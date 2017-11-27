# Different repo for RZ/N1, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI = "git://github.com/renesas-rz/rzn1_linux.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "5ae37771adc83a012c07bd0b04f8bb85c0946892"
#SRCREV = "${AUTOREV}"

require recipes-kernel/linux/linux-rzn1.inc
