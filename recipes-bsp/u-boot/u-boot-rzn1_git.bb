require recipes-bsp/u-boot/u-boot.inc

SUMMARY = "U-Boot bootloader with support for Renesas RZ/N1"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

DEPENDS_append = " bc-native"

PROVIDES += "u-boot"

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI_rzn1 = "git://github.com/renesas-rz/rzn1_u-boot.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "rzn1-public-v1.5.9"

S = "${WORKDIR}/git"

inherit dtc-145

PACKAGE_ARCH = "${MACHINE_ARCH}"
