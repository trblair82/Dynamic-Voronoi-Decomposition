# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.8

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = "/Applications/CMake 2.8-7.app/Contents/bin/cmake"

# The command to remove a file.
RM = "/Applications/CMake 2.8-7.app/Contents/bin/cmake" -E remove -f

# The program to use to edit the cache.
CMAKE_EDIT_COMMAND = "/Applications/CMake 2.8-7.app/Contents/bin/ccmake"

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/sikanrong/DynamicBlock/vendor/bullet-2.79

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/sikanrong/DynamicBlock/vendor/bullet-2.79

# Include any dependencies generated for this target.
include Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/depend.make

# Include the progress variables for this target.
include Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/flags.make

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/flags.make
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o: Demos/OpenCLClothDemo/cl_cloth_demo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/cl_cloth_demo.cpp

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/cl_cloth_demo.cpp > CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.i

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/cl_cloth_demo.cpp -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.s

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.requires:
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.requires

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.provides: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build.make Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.provides.build
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.provides

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.provides.build: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/flags.make
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o: Demos/SharedOpenCL/btOclUtils.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp > CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.i

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.s

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.requires:
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.requires

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.provides: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build.make Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.provides.build
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.provides

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.provides.build: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/flags.make
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o: Demos/SharedOpenCL/btOclCommon.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_3)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp > CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.i

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.s

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.requires:
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.requires

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.provides: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build.make Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.provides.build
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.provides

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.provides.build: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/flags.make
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o: Demos/OpenCLClothDemo/gl_win.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_4)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/gl_win.cpp

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/gl_win.cpp > CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.i

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/gl_win.cpp -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.s

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.requires:
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.requires

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.provides: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build.make Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.provides.build
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.provides

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.provides.build: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/flags.make
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o: Demos/OpenCLClothDemo/clstuff.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_5)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/clstuff.cpp

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/clstuff.cpp > CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.i

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/clstuff.cpp -o CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.s

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.requires:
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.requires

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.provides: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build.make Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.provides.build
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.provides

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.provides.build: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o

# Object files for target AppOpenCLClothDemo_Apple
AppOpenCLClothDemo_Apple_OBJECTS = \
"CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o" \
"CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o" \
"CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o" \
"CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o" \
"CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o"

# External object files for target AppOpenCLClothDemo_Apple
AppOpenCLClothDemo_Apple_EXTERNAL_OBJECTS =

Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenGL/libOpenGLSupport.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/libBulletSoftBodySolvers_OpenCL_Apple.2.79.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: src/BulletMultiThreaded/GpuSoftBodySolvers/CPU/libBulletSoftBodySolvers_CPU.2.79.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: src/BulletMultiThreaded/libBulletMultiThreaded.2.79.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: src/BulletSoftBody/libBulletSoftBody.2.79.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: src/BulletDynamics/libBulletDynamics.2.79.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: src/BulletCollision/libBulletCollision.2.79.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: src/LinearMath/libLinearMath.2.79.dylib
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build.make
Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppOpenCLClothDemo_Apple"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppOpenCLClothDemo_Apple.dir/link.txt --verbose=$(VERBOSE)
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && "/Applications/CMake 2.8-7.app/Contents/bin/cmake" -E copy_if_different /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/bullet_logo.png /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple

# Rule to build all files generated by this target.
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build: Demos/OpenCLClothDemo/Apple/AppOpenCLClothDemo_Apple
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/build

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/requires: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/cl_cloth_demo.o.requires
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/requires: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclUtils.o.requires
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/requires: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/__/SharedOpenCL/btOclCommon.o.requires
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/requires: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/gl_win.o.requires
Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/requires: Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/__/clstuff.o.requires
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/requires

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/clean:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple && $(CMAKE_COMMAND) -P CMakeFiles/AppOpenCLClothDemo_Apple.dir/cmake_clean.cmake
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/clean

Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/depend:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/OpenCLClothDemo/Apple/CMakeFiles/AppOpenCLClothDemo_Apple.dir/depend

