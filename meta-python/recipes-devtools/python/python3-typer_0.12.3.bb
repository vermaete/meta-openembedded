SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints."
DESCRIPTION = "\
    Typer is a library for building CLI applications that users will love using and developers will love creating. Based on Python type hints. \
    It's also a command line tool to run scripts, automatically converting them to CLI applications. \
"
HOMEPAGE = "https://github.com/tiangolo/typer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=173d405eb704b1499218013178722617"

SRC_URI[sha256sum] = "49e73131481d804288ef62598d97a1ceef3058905aa536a1134f90891ba35482"

inherit pypi python_setuptools_build_meta

DEPENDS += "\
        python3-pdm-backend-native \
        python3-pdm-native \
"

PYPI_PACKAGE = "typer"

RDEPENDS:${PN} += "\
    python3-click \
"
