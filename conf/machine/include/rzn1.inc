SOC_FAMILY = "rzn1"

# Cortex A7, thumb, hard float, VPFv4-d16
DEFAULTTUNE ?= "armv7vethf-vfpv4d16"
require conf/machine/include/tune-cortexa7.inc

# this variable specifies the kernel to be built
# this affects the PREFERRED_PROVIDER of virtual/kernel
# it can be overriden from the environment, using BB_ENV_EXTRAWHITE
KERNEL_PROVIDER ?= "linux-rzn1"
PREFERRED_PROVIDER_virtual/kernel = "${KERNEL_PROVIDER}"

PREFERRED_PROVIDER_virtual/bootloader = "u-boot-rzn1"

# Increase this everytime you change something in the kernel
MACHINE_KERNEL_PR = "r1"

UBOOT_ENTRYPOINT ?= "0x80008000"
UBOOT_LOADADDRESS ?= "0x80008000"

SERIAL_CONSOLE ?= "115200 ttyS0"

KERNEL_IMAGETYPE ?= "uImage"
KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

MACHINE_EXTRA_RRECOMMENDS = " kernel-modules kernel-devicetree"

# We want PCI just because USB Host is behind a PCI bridge
MACHINE_FEATURES += " pci usbgadget usbhost vfat"

# file system images required
IMAGE_FSTYPES ?= "tar.bz2 squashfs"

# Provide RZ/N1 specifics
OVERRIDES += ":rzn1"
