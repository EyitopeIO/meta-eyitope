SUMMARY = "Like cpp but for shell scripts"
SECTION = "utils"

LICENSE 		= "MIT"
LIC_FILES_CHKSUM	= "file://${S}/LICENSE;md5=2254a0920e227c847911a184933b2dac"
SRC_URI 		= "git://github.com/EyitopeIO/spp.git;branch=main;protocol=https"
SRCREV			= "0937edbf84408efe9b4989290816688278d783e8"
S 			= "${WORKDIR}/git"

inherit cmake

do_install() {
	install -m 0755 ${B}/spp ${D}${bindir}
}

