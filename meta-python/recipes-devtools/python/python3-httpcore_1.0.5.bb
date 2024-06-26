SUMMARY = "A minimal low-level HTTP client."
DESCRIPTION = "\
    The HTTP Core package provides a minimal low-level HTTP client, \
    which does one thing only. Sending HTTP requests.\
"
HOMEPAGE = "https://www.encode.io/httpcore"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=1c1f23b073da202e1f4f9e426490210c"

inherit pypi python_hatchling

SRC_URI[sha256sum] = "34a38e2f9291467ee3b44e89dd52615370e152954ba21721378a87b2960f7a61"

DEPENDS += "\
    python3-hatch-fancy-pypi-readme-native \
"

PACKAGECONFIG ??= ""
PACKAGECONFIG[http2] = ",,,python3-h2"
PACKAGECONFIG[socks] = ",,,python3-socksio"
PACKAGECONFIG[asyncio] = ",,,python3-anyio"
PACKAGECONFIG[trio] = ",,,python3-trio"

RDEPENDS:${PN} += "\
    python3-certifi \
    python3-h11 \
"
