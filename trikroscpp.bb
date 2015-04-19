DESCRIPTION = "roscpp cross-compile-demo"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp catkin rospy std-msgs trik-runtime"
RDEPENDS_${PN} = "roscpp rospy std-msgs trik-runtime"

SRC_URI = "git://github.com/ujohnny/trikroscpp.git"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE_prepend = "-DTRIKINC=${STAGING_INCDIR}/trik -DQT=${STAGING_INCDIR}/qtopia"
OECMAKE_CXX_FLAGS_prepend = "-std=c++11"
inherit catkin