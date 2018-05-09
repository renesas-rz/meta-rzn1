require recipes-kernel/linux/linux-rzn1.inc

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI = "git://github.com/renesas-rz/rzn1_linux.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "b437a9bb5663f4a31a4f8bb327d62b90b87c9dde"
