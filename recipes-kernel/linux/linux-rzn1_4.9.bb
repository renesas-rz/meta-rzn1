require recipes-kernel/linux/linux-rzn1.inc

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI = "git://github.com/renesas-rz/rzn1_linux.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "831d9f8f0391ff7cd960188542d3fd68cace0f38"
