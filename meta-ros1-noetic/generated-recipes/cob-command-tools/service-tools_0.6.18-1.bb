# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Service tools"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_command_tools"
ROS_BPN = "service_tools"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rospy \
    rosservice \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_command_tools-release/archive/release/noetic/service_tools/0.6.18-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/service_tools"
SRC_URI = "git://github.com/ipa320/cob_command_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "eabcba5f8ba16abfe548ba5d156471413b00b5f9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
