# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The assisted_teleop node subscribes to a desired trajectory topic     (geometry_msgs/Twist) and uses TrajectoryPlannerROS to find a valid     trajectory close to the desired trajectory before republishing. Useful for     filtering teleop commands while avoiding obstacles. This package also     contains LaserScanMaxRangeFilter, which is a LaserScan filter plugin that     takes max range values in a scan and turns them into valid values that are     slightly less than max range."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://wiki.ros.org/assisted_teleop"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_experimental"
ROS_BPN = "assisted_teleop"

ROS_BUILD_DEPENDS = " \
    actionlib \
    angles \
    base-local-planner \
    costmap-2d \
    filters \
    geometry-msgs \
    libeigen \
    message-filters \
    move-base-msgs \
    pluginlib \
    roscpp \
    roslib \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    angles \
    base-local-planner \
    costmap-2d \
    filters \
    geometry-msgs \
    libeigen \
    message-filters \
    move-base-msgs \
    pluginlib \
    roscpp \
    roslib \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    angles \
    base-local-planner \
    costmap-2d \
    filters \
    geometry-msgs \
    libeigen \
    message-filters \
    move-base-msgs \
    pluginlib \
    roscpp \
    roslib \
    sensor-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation_experimental-release/archive/release/noetic/assisted_teleop/0.3.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/assisted_teleop"
SRC_URI = "git://github.com/ros-gbp/navigation_experimental-release;${ROS_BRANCH};protocol=https"
SRCREV = "8cccabe19fe59464a3ed250e86ab64570375e581"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
