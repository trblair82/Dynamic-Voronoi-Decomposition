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
include Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/depend.make

# Include the progress variables for this target.
include Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/flags.make

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/flags.make
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o: Demos/OpenCLClothDemo/cl_cloth_demo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/cl_cloth_demo.cpp

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/cl_cloth_demo.cpp > CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.i

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/cl_cloth_demo.cpp -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.s

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.requires:
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.requires

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.provides: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build.make Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.provides.build
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.provides

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.provides.build: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/flags.make
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o: Demos/OpenCLClothDemo/gl_win.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/gl_win.cpp

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/gl_win.cpp > CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.i

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/gl_win.cpp -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.s

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.requires:
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.requires

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.provides: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build.make Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.provides.build
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.provides

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.provides.build: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/flags.make
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o: Demos/OpenCLClothDemo/clstuff.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_3)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/clstuff.cpp

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/clstuff.cpp > CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.i

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/clstuff.cpp -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.s

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.requires:
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.requires

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.provides: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build.make Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.provides.build
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.provides

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.provides.build: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/flags.make
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_4)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.cpp

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.cpp > CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.i

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.cpp -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.s

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.requires:
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.requires

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.provides: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build.make Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.provides.build
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.provides

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.provides.build: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/flags.make
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o: Demos/SharedOpenCL/btOclUtils.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_5)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp > CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.i

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.s

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires:
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build.make Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides.build
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides.build: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/flags.make
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o: Demos/SharedOpenCL/btOclCommon.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_6)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp > CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.i

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp -o CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.s

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires:
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires
	$(MAKE) -f Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build.make Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides.build
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides.build: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o

# Object files for target AppOpenCLClothDemo_Mini
AppOpenCLClothDemo_Mini_OBJECTS = \
"CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o" \
"CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o" \
"CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o" \
"CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o" \
"CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o" \
"CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o"

# External object files for target AppOpenCLClothDemo_Mini
AppOpenCLClothDemo_Mini_EXTERNAL_OBJECTS =

Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenGL/libOpenGLSupport.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/libBulletSoftBodySolvers_OpenCL_Mini.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/BulletMultiThreaded/GpuSoftBodySolvers/CPU/libBulletSoftBodySolvers_CPU.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/MiniCL/libMiniCL.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/BulletMultiThreaded/libBulletMultiThreaded.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/BulletSoftBody/libBulletSoftBody.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/BulletDynamics/libBulletDynamics.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/BulletCollision/libBulletCollision.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: src/LinearMath/libLinearMath.2.79.dylib
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build.make
Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppOpenCLClothDemo_Mini"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppOpenCLClothDemo_Mini.dir/link.txt --verbose=$(VERBOSE)
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && "/Applications/CMake 2.8-7.app/Contents/bin/cmake" -E copy_if_different /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/bullet_logo.png /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL

# Rule to build all files generated by this target.
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build: Demos/OpenCLClothDemo/MiniCL/AppOpenCLClothDemo_Mini
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/build

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/requires: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/cl_cloth_demo.o.requires
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/requires: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/gl_win.o.requires
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/requires: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/clstuff.o.requires
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/requires: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/__/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/MiniCL/MiniCLTaskWrap.o.requires
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/requires: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires
Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/requires: Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/requires

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/clean:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL && $(CMAKE_COMMAND) -P CMakeFiles/AppOpenCLClothDemo_Mini.dir/cmake_clean.cmake
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/clean

Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/depend:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/OpenCLClothDemo/MiniCL/CMakeFiles/AppOpenCLClothDemo_Mini.dir/depend

