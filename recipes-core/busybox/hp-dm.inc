PACKAGES =+ "${PN}-hp-dm-private"

FILES_${PN}-hp-dm-private = "/TEST_NEW_RECEIPE_TO_ROOT"


do_install_append () {
        touch ${D}${sysconfdir}/TEST_NEW_RECEIPE_TOSYSCONFDIR
        touch ${D}/TEST_NEW_RECEIPE_TO_ROOT
}


