# Different repo for RZ/N1, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI_rzn1 = "git://github.com/renesas-rz/rzn1_u-boot.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "22bb9900999f4591192e2dbe46562cd93eed390e"
#SRCREV = "${AUTOREV}"

# Temporary workaround
#SPL_BINARY = "u-boot-spl.bin"
#SPL_OUTDIR = "spl/"

include recipes-bsp/u-boot/u-boot.inc
