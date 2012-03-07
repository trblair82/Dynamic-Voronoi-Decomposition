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
CMAKE_COMMAND = /usr/local/bin/cmake

# The command to remove a file.
RM = /usr/local/bin/cmake -E remove -f

# The program to use to edit the cache.
CMAKE_EDIT_COMMAND = /usr/local/bin/ccmake

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79

# Include any dependencies generated for this target.
include src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/depend.make

# Include the progress variables for this target.
include src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/progress.make

# Include the compile flags for this target's objects.
include src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/flags.make

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/flags.make
src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCL.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCL.cpp

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCL.cpp > CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.i

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCL.cpp -o CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.s

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.requires:
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.requires

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.provides: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.requires
	$(MAKE) -f src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/build.make src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.provides.build
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.provides

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.provides.build: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/flags.make
src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCLSIMDAware.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCLSIMDAware.cpp

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCLSIMDAware.cpp > CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.i

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/btSoftBodySolver_OpenCLSIMDAware.cpp -o CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.s

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.requires:
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.requires

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.provides: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.requires
	$(MAKE) -f src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/build.make src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.provides.build
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.provides

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.provides.build: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o

# Object files for target BulletSoftBodySolvers_OpenCL_Apple
BulletSoftBodySolvers_OpenCL_Apple_OBJECTS = \
"CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o" \
"CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o"

# External object files for target BulletSoftBodySolvers_OpenCL_Apple
BulletSoftBodySolvers_OpenCL_Apple_EXTERNAL_OBJECTS =

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/libBulletSoftBodySolvers_OpenCL_Apple.a: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o
src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/libBulletSoftBodySolvers_OpenCL_Apple.a: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o
src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/libBulletSoftBodySolvers_OpenCL_Apple.a: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/build.make
src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/libBulletSoftBodySolvers_OpenCL_Apple.a: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX static library libBulletSoftBodySolvers_OpenCL_Apple.a"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && $(CMAKE_COMMAND) -P CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/cmake_clean_target.cmake
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/build: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/libBulletSoftBodySolvers_OpenCL_Apple.a
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/build

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/requires: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCL.o.requires
src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/requires: src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/__/btSoftBodySolver_OpenCLSIMDAware.o.requires
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/requires

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/clean:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple && $(CMAKE_COMMAND) -P CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/cmake_clean.cmake
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/clean

src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/depend:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : src/BulletMultiThreaded/GpuSoftBodySolvers/OpenCL/Apple/CMakeFiles/BulletSoftBodySolvers_OpenCL_Apple.dir/depend
