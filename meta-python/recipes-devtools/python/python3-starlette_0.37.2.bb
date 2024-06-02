SUMMARY = "The little ASGI framework that shines"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, \
    which is ideal for building async web services in Python \
"
HOMEPAGE = "https://www.starlette.io"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=11e8c8dbfd5fa373c703de492140ff7a"

SRC_URI[sha256sum] = "9af890290133b79fc3db55474ade20f6220a364a0402e0b556e7cd5e1e093823"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
    python3-anyio \
"

PYPI_PACKAGE = "starlette"
