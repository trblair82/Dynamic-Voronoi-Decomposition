# Install script for directory: /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL

# Set the install prefix
IF(NOT DEFINED CMAKE_INSTALL_PREFIX)
  SET(CMAKE_INSTALL_PREFIX "/usr/local")
ENDIF(NOT DEFINED CMAKE_INSTALL_PREFIX)
STRING(REGEX REPLACE "/$" "" CMAKE_INSTALL_PREFIX "${CMAKE_INSTALL_PREFIX}")

# Set the install configuration name.
IF(NOT DEFINED CMAKE_INSTALL_CONFIG_NAME)
  IF(BUILD_TYPE)
    STRING(REGEX REPLACE "^[^A-Za-z0-9_]+" ""
           CMAKE_INSTALL_CONFIG_NAME "${BUILD_TYPE}")
  ELSE(BUILD_TYPE)
    SET(CMAKE_INSTALL_CONFIG_NAME "Debug")
  ENDIF(BUILD_TYPE)
  MESSAGE(STATUS "Install configuration: \"${CMAKE_INSTALL_CONFIG_NAME}\"")
ENDIF(NOT DEFINED CMAKE_INSTALL_CONFIG_NAME)

# Set the component getting installed.
IF(NOT CMAKE_INSTALL_COMPONENT)
  IF(COMPONENT)
    MESSAGE(STATUS "Install component: \"${COMPONENT}\"")
    SET(CMAKE_INSTALL_COMPONENT "${COMPONENT}")
  ELSE(COMPONENT)
    SET(CMAKE_INSTALL_COMPONENT)
  ENDIF(COMPONENT)
ENDIF(NOT CMAKE_INSTALL_COMPONENT)

IF(NOT CMAKE_INSTALL_COMPONENT OR "${CMAKE_INSTALL_COMPONENT}" STREQUAL "Unspecified")
  FILE(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE SHARED_LIBRARY FILES
    "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/libBulletSoftBodySolvers_OpenCL_Mini.2.79.dylib"
    "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/libBulletSoftBodySolvers_OpenCL_Mini.dylib"
    )
  FOREACH(file
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libBulletSoftBodySolvers_OpenCL_Mini.2.79.dylib"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libBulletSoftBodySolvers_OpenCL_Mini.dylib"
      )
    IF(EXISTS "${file}" AND
       NOT IS_SYMLINK "${file}")
      EXECUTE_PROCESS(COMMAND "/usr/bin/install_name_tool"
        -id "libBulletSoftBodySolvers_OpenCL_Mini.2.79.dylib"
        -change "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletCollision/libBulletCollision.2.79.dylib" "libBulletCollision.2.79.dylib"
        -change "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletDynamics/libBulletDynamics.2.79.dylib" "libBulletDynamics.2.79.dylib"
        -change "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/libBulletMultiThreaded.2.79.dylib" "libBulletMultiThreaded.2.79.dylib"
        -change "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletSoftBody/libBulletSoftBody.2.79.dylib" "libBulletSoftBody.2.79.dylib"
        -change "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/LinearMath/libLinearMath.2.79.dylib" "libLinearMath.2.79.dylib"
        -change "/Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/MiniCL/libMiniCL.2.79.dylib" "libMiniCL.2.79.dylib"
        "${file}")
      IF(CMAKE_INSTALL_DO_STRIP)
        EXECUTE_PROCESS(COMMAND "/usr/bin/strip" "${file}")
      ENDIF(CMAKE_INSTALL_DO_STRIP)
    ENDIF()
  ENDFOREACH()
ENDIF(NOT CMAKE_INSTALL_COMPONENT OR "${CMAKE_INSTALL_COMPONENT}" STREQUAL "Unspecified")

