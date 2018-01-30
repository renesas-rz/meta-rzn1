include recipes-bsp/u-boot/u-boot.inc

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI_rzn1 = "git://github.com/renesas-rz/rzn1_u-boot.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "0fe1224d5008dac430da38426631aa5d0a83677d"

# Temporary workaround
#SPL_BINARY = "u-boot-spl.bin"
#SPL_OUTDIR = "spl/"
