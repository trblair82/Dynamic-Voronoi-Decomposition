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
include Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/depend.make

# Include the progress variables for this target.
include Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/flags.make

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o: Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/flags.make
Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o: Demos/ConvexHullDistance/ConvexHullDistanceDemo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance/ConvexHullDistanceDemo.cpp

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance/ConvexHullDistanceDemo.cpp > CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.i

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance/ConvexHullDistanceDemo.cpp -o CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.s

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.requires:
.PHONY : Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.requires

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.provides: Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.requires
	$(MAKE) -f Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/build.make Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.provides.build
.PHONY : Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.provides

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.provides.build: Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o

# Object files for target AppConvexHullDistanceDemo
AppConvexHullDistanceDemo_OBJECTS = \
"CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o"

# External object files for target AppConvexHullDistanceDemo
AppConvexHullDistanceDemo_EXTERNAL_OBJECTS =

Demos/ConvexHullDistance/AppConvexHullDistanceDemo: Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o
Demos/ConvexHullDistance/AppConvexHullDistanceDemo: Demos/OpenGL/libOpenGLSupport.dylib
Demos/ConvexHullDistance/AppConvexHullDistanceDemo: src/BulletDynamics/libBulletDynamics.2.79.dylib
Demos/ConvexHullDistance/AppConvexHullDistanceDemo: src/BulletCollision/libBulletCollision.2.79.dylib
Demos/ConvexHullDistance/AppConvexHullDistanceDemo: src/LinearMath/libLinearMath.2.79.dylib
Demos/ConvexHullDistance/AppConvexHullDistanceDemo: Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/build.make
Demos/ConvexHullDistance/AppConvexHullDistanceDemo: Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppConvexHullDistanceDemo"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppConvexHullDistanceDemo.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/build: Demos/ConvexHullDistance/AppConvexHullDistanceDemo
.PHONY : Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/build

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/requires: Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/ConvexHullDistanceDemo.o.requires
.PHONY : Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/requires

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/clean:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance && $(CMAKE_COMMAND) -P CMakeFiles/AppConvexHullDistanceDemo.dir/cmake_clean.cmake
.PHONY : Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/clean

Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/depend:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/ConvexHullDistance/CMakeFiles/AppConvexHullDistanceDemo.dir/depend

