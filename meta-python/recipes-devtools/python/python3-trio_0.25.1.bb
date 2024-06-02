SUMMARY = "A friendly Python library for async concurrency and I/O"
HOMEPAGE = "https://github.com/python-trio/trio"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "\
    file://LICENSE.APACHE2;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.MIT;md5=5f229c828e5a6f0a2ce90c7d3c054721 \
"

SRC_URI[sha256sum] = "9f5314f014ea3af489e77b001861c535005c3858d38ec46b6b071ebfa339d7fb"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "trio"

RDEPENDS:${PN} = "\
    python3-attrs \
    python3-cffi \
    python3-idna \
    python3-sniffio \
    python3-sortedcontainers \
"
