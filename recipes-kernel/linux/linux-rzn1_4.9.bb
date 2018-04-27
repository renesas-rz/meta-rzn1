require recipes-kernel/linux/linux-rzn1.inc

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI = "git://github.com/renesas-rz/rzn1_linux.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "d0435dded595a0d349aca4a7fba9d44edb0b61e7"
