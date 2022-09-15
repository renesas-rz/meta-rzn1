require recipes-kernel/linux/linux-rzn1.inc

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable-v5.15"
SRC_URI = "git://github.com/renesas-rz/rzn1_linux.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "rzn1-v1.8.1"
