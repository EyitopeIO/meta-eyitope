SUMMARY = "Predict device bandwidth usage"
SECTION = "utils"

LICENSE			= "MIT"
LIC_FILES_CHKSUM	= "file://${S}/LICENSE;md5=1f6aaaf1abe8992f351302b6ef138615"
SRC_URI			= "git://github.com/EyitopeIO/Bizzare.git;branch=main;protocol=https"
SRCREV			= "3799f08d62240fcaca58917dfcd8d48ccd8a8947"
S			= "${WORKDIR}/git"


# runtime deps. auto detected but...why not?
RDEPENDS:bizzare += " libnetfilter-conntrack libsqlite3"

DEPENDS += " libnetfilter-conntrack sqlite3"

inherit cmake

do_install() {
	install -d ${D}/usr/bin
	install -m 0755 ${B}/bizzare ${D}${bindir}
}

