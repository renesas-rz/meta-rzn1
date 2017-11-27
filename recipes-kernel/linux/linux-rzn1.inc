DESCRIPTION = "Renesas RZ/N1 Linux kernel"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
PR = "r4"

SRC_URI ?= "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;branch=master"
KERNEL_DEFCONFIG ?= "rzn1_defconfig"

inherit kernel
require recipes-kernel/linux/linux-dtb.inc

S = "${WORKDIR}/git"

kernel_configure_variable() {
	CONF_SED_SCRIPT="$CONF_SED_SCRIPT /CONFIG_$1[ =]/d;"
	if test "$2" = "n"
	then
		echo "# CONFIG_$1 is not set" >> ${S}/.config
	else
		echo "CONFIG_$1=$2" >> ${S}/.config
	fi
}

do_configure_prepend() {
	echo "" > ${S}/.config
	CONF_SED_SCRIPT=""

	install -m 0644 ${S}/arch/${ARCH}/configs/${KERNEL_DEFCONFIG} ${WORKDIR}/defconfig || die "No default configuration for ${MACHINE} / ${KERNEL_DEFCONFIG} available."

	if [ ! -z ${INITRAMFS_IMAGE} ]; then
		kernel_configure_variable BLK_DEV_INITRD y
	else
		kernel_configure_variable BLK_DEV_INITRD n
	fi

	# Yocto will specify the correct path via a command line arg
	kernel_configure_variable INITRAMFS_SOURCE n

	# Only used when using an initramfs
	kernel_configure_variable INITRAMFS_COMPRESSION_NONE y
	kernel_configure_variable INITRAMFS_ROOT_UID 0
	kernel_configure_variable INITRAMFS_ROOT_GID 0

	kernel_configure_variable ARM_APPENDED_DTB n

	sed -e "${CONF_SED_SCRIPT}" < '${WORKDIR}/defconfig' >>'${S}/.config'
}
