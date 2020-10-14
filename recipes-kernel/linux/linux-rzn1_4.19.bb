require recipes-kernel/linux/linux-rzn1.inc

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable-v4.19"
SRC_URI = "git://github.com/renesas-rz/rzn1_linux.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "rzn1-v1.6.1"

