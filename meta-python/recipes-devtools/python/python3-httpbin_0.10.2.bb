SUMMARY = "HTTP Request and Response Service"
LICENSE = "ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE.ISC;md5=0b1d7a7639cdb11cdcf50ff2fc5a5b3b \
                    file://LICENSE.MIT;md5=138d4be72f7275b6866098981c67dde4"

SRC_URI[sha256sum] = "632148698261c8684ea2d2b624cdea845b402b1fe91736e89df886408c6317a9"

inherit pypi python_setuptools_build_meta


# WARNING: We were unable to map the following python package/module
# runtime dependencies to the bitbake packages which include them:
#    brotlicffi
#    decorator
#    flasgger
#    flask
#    greenlet
#    importlib-metadata;
#    werkzeug

PYPI_PACKAGE = "httpbin"
RDEPENDS:${PN} = "python3-six"
