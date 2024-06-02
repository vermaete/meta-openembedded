SUMMARY = "FastAPI framework"
DESCRIPTION = "FastAPI framework, high performance, easy to learn, fast to code, ready for production"
HOMEPAGE = "https://fastapi.tiangolo.com"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95792ff3fe8e11aa49ceb247e66e4810"

inherit pypi python_setuptools_build_meta

DEPENDS += " \
        python3-pdm-native \
        python3-pdm-backend-native \
"

RDEPENDS:${PN} += "\
    python3-pydantic \
    python3-starlette \
"

SRC_URI[sha256sum] = "b9db9dd147c91cb8b769f7183535773d8741dd46f9dc6676cd82eab510228cd7"
