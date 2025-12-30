SUMMARY = "Python BLE GATT server"
DESCRIPTION = "Python BLE GATT server"
HOMEPAGE = "https://github.com/whhuster/gattd"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c53d04442d1a229d62549856b7ec456a"

SRC_URI = "git://github.com/whhuster/gattd.git;protocol=https;branch=main"
SRCREV = "9be765dce622351f3659773b42af2689fe14160d"

RDEPENDS_${PN} = "python3-dbus"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/*.py ${D}${bindir}
}

FILE_${PN} += "${bindir}/*.py"
