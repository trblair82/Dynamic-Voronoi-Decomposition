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
include Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/depend.make

# Include the progress variables for this target.
include Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/flags.make

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o: Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/flags.make
Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o: Demos/VectorAdd_OpenCL/MiniCL_VectorAdd.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/MiniCL_VectorAdd.cpp

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/MiniCL_VectorAdd.cpp > CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.i

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/MiniCL_VectorAdd.cpp -o CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.s

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.requires:
.PHONY : Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.requires

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.provides: Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.requires
	$(MAKE) -f Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/build.make Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.provides.build
.PHONY : Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.provides

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.provides.build: Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o

# Object files for target AppVectorAdd_Apple
AppVectorAdd_Apple_OBJECTS = \
"CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o"

# External object files for target AppVectorAdd_Apple
AppVectorAdd_Apple_EXTERNAL_OBJECTS =

Demos/VectorAdd_OpenCL/Apple/AppVectorAdd_Apple: Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o
Demos/VectorAdd_OpenCL/Apple/AppVectorAdd_Apple: src/LinearMath/libLinearMath.a
Demos/VectorAdd_OpenCL/Apple/AppVectorAdd_Apple: Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/build.make
Demos/VectorAdd_OpenCL/Apple/AppVectorAdd_Apple: Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppVectorAdd_Apple"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppVectorAdd_Apple.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/build: Demos/VectorAdd_OpenCL/Apple/AppVectorAdd_Apple
.PHONY : Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/build

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/requires: Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/__/MiniCL_VectorAdd.o.requires
.PHONY : Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/requires

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/clean:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple && $(CMAKE_COMMAND) -P CMakeFiles/AppVectorAdd_Apple.dir/cmake_clean.cmake
.PHONY : Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/clean

Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/depend:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/VectorAdd_OpenCL/Apple/CMakeFiles/AppVectorAdd_Apple.dir/depend

