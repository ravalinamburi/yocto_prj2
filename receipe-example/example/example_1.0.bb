DESCRIPTION = "Simple example application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"
SRC_URI = "file://example.c"

S = "${WORKDIR}"

do_compile() {
    pwd
    ${CC} ${S}/example.c ${LDFLAGS} -o example
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 example ${D}${bindir}
}
