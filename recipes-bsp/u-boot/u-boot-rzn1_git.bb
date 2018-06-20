require recipes-bsp/u-boot/u-boot.inc

SUMMARY = "U-Boot bootloader with support for Renesas RZ/N1"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

DEPENDS_append = " dtc-native bc-native"

PROVIDES += "u-boot"

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI_rzn1 = "git://github.com/renesas-rz/rzn1_u-boot.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "0fe1224d5008dac430da38426631aa5d0a83677d"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
