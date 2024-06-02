SUMMARY = "Capture the outcome of Python function calls."
DESCRIPTION = "Capture the outcome of Python function calls. Extracted from the Trio project."
HOMEPAGE = "https://github.com/python-trio/outcome"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "\
    file://LICENSE.APACHE2;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.MIT;md5=e62ba5042d5983462ad229f5aec1576c \
"

SRC_URI[sha256sum] = "588ef4dc10b64e8df160d8d1310c44e1927129a66d6d2ef86845cef512c5f24c"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    python3-asyncio \
    python3-core \
    python3-typing-extensions \
"

PYPI_PACKAGE = "outcome"
