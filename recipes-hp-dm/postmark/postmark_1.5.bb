DESCRIPTION = "Postmark benchmark"
SECTION = "benchmark"
DEPENDS = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://postmark-1_5.c;md5=da4aecd7ec076b6615677c741d219e8c"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:${THISDIR}/postmark:"

SRC_URI[md5sum] = "da4aecd7ec076b6615677c741d219e8c"
SRC_URI = "http://www.dartmouth.edu/~davidg/postmark-1_5.c \
file://Add-Makefile.patch \
"

S = "${WORKDIR}/"

FILES_${PN} += "/usr/local/bin/postmark"

do_compile() {
	make 
}
do_install() {
	PREFIX=${D} make install
}
do_package_qa() {
}

