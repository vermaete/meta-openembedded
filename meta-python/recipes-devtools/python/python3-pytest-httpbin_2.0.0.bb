SUMMARY = "Easily test your HTTP library against a local copy of httpbin"
HOMEPAGE = "https://github.com/kevin1024/pytest-httpbin"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=11610a9d8fd95649cf8159be12b98cb7"

SRC_URI[sha256sum] = "3e739cad9b8f8df58952df7329d9295fe17449d3a647f49c4ce634fd81d71b8e"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-httpbin"

RDEPENDS:${PN} += "\
    python3-httpbin \
    python3-io \
    python3-misc \
    python3-pytest \
"

PYPI_PACKAGE = "pytest-httpbin"
