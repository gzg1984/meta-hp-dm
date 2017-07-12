DESCRIPTION = "Image with HP DM1"

#IMAGE_FEATURES += "splash package-management x11-base ssh-server-dropbear hwcodecs"
IMAGE_FEATURES += ""

LICENSE = "GPLv2"

inherit core-image

IMAGE_INSTALL += " postmark "
IMAGE_INSTALL += " openssh "
IMAGE_INSTALL += " ntfs "
IMAGE_INSTALL_remove += " bluez5 "
IMAGE_INSTALL_remove += " ofono "
DISTRO_FEATURES_remove = " 3g "



TOOLCHAIN_HOST_TASK_append = " nativesdk-intltool nativesdk-glib-2.0"
TOOLCHAIN_HOST_TASK_remove_task-populate-sdk-ext = " nativesdk-intltool nativesdk-glib-2.0"
