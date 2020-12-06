# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "C++ library about sensor model, geometrical modeling and perception."
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "https://jsk-docs.readthedocs.io/projects/jsk_recognition/en/latest/jsk_recognition_utils"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_recognition"
ROS_BPN = "jsk_recognition_utils"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-cython} \
    dynamic-reconfigure \
    eigen-conversions \
    geometry-msgs \
    image-geometry \
    jsk-recognition-msgs \
    jsk-topic-tools \
    message-generation \
    pcl-msgs \
    pcl-ros \
    qtbase \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-chainer-pip} \
    ${ROS_UNRESOLVED_DEP-python3-skimage} \
    eigen-conversions \
    geometry-msgs \
    image-geometry \
    image-view \
    jsk-recognition-msgs \
    jsk-topic-tools \
    message-runtime \
    pcl-msgs \
    pcl-ros \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    tf2-ros \
    visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    jsk-tools \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_recognition-release/archive/release/noetic/jsk_recognition_utils/1.2.15-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/jsk_recognition_utils"
SRC_URI = "git://github.com/tork-a/jsk_recognition-release;${ROS_BRANCH};protocol=https"
SRCREV = "6fe44bd807388712a8ab267c95c85cd0e6b1734f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
