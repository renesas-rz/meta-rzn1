FILESEXTRAPATHS_prepend_rzn1 := "${THISDIR}/files:"
SRC_URI_append_rzn1 = " \
	file://goal_app.sh \
	"

MASKED_SCRIPTS_append_rzn1 = " goal_app"

do_install_append_rzn1() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0644 ${WORKDIR}/goal_app.sh ${D}${sysconfdir}/init.d

	update-rc.d -r ${D} goal_app.sh start 99 5 .
}
