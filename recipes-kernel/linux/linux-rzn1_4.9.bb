require recipes-kernel/linux/linux-rzn1.inc

# Renesas RZ/N1 repo, use latest release
SRCBRANCH = "rzn1-stable"
SRC_URI = "git://github.com/renesas-rz/rzn1_linux.git;protocol=https;branch=${SRCBRANCH}"
SRCREV = "89d6c9be056a462b95d5217221d70d6e5c25dfc2"
