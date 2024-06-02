SUMMARY = "Run and manage FastAPI apps from the command line with FastAPI CLI."
HOMEPAGE = "https://github.com/tiangolo/fastapi-cli"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0cf8d811ea2046529403707b266fb5a"

SRC_URI[sha256sum] = "e2e9ffaffc1f7767f488d6da34b6f5a377751c996f397902eb6abb99a67bde32"

inherit pypi python_setuptools_build_meta

DEPENDS += "\
        python3-pdm-backend-native \
        python3-pdm-native \
"

PYPI_PACKAGE = "fastapi_cli"

RDEPENDS:${PN} += "\
    python3-fastapi \
    python3-rich \
    python3-typer \
"
