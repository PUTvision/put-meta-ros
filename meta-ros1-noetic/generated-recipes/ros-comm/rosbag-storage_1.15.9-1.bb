# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This is a set of tools for recording from and playing back ROS     message without relying on the ROS client library."
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
ROS_AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "rosbag_storage"

ROS_BUILD_DEPENDS = " \
    boost \
    bzip2 \
    console-bridge \
    cpp-common \
    gpgme \
    openssl \
    pluginlib \
    roscpp-serialization \
    roscpp-traits \
    roslz4 \
    rostest \
    rostime \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    bzip2 \
    console-bridge \
    cpp-common \
    gpgme \
    openssl \
    pluginlib \
    roscpp-serialization \
    roscpp-traits \
    roslz4 \
    rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    bzip2 \
    console-bridge \
    cpp-common \
    gpgme \
    openssl \
    pluginlib \
    roscpp-serialization \
    roscpp-traits \
    roslz4 \
    rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/noetic/rosbag_storage/1.15.9-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosbag_storage"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "4c8c9def2eb874e6b0ab4780fd20e8bc935b76e3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
