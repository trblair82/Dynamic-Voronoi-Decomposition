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
include Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/depend.make

# Include the progress variables for this target.
include Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/flags.make

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o: Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/flags.make
Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o: Demos/ContinuousConvexCollision/ContinuousConvexCollisionDemo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision/ContinuousConvexCollisionDemo.cpp

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision/ContinuousConvexCollisionDemo.cpp > CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.i

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision/ContinuousConvexCollisionDemo.cpp -o CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.s

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.requires:
.PHONY : Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.requires

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.provides: Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.requires
	$(MAKE) -f Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/build.make Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.provides.build
.PHONY : Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.provides

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.provides.build: Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o

# Object files for target AppContinuousConvexCollisionDemo
AppContinuousConvexCollisionDemo_OBJECTS = \
"CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o"

# External object files for target AppContinuousConvexCollisionDemo
AppContinuousConvexCollisionDemo_EXTERNAL_OBJECTS =

Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo: Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o
Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo: Demos/OpenGL/libOpenGLSupport.dylib
Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo: src/BulletDynamics/libBulletDynamics.2.79.dylib
Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo: src/BulletCollision/libBulletCollision.2.79.dylib
Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo: src/LinearMath/libLinearMath.2.79.dylib
Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo: Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/build.make
Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo: Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppContinuousConvexCollisionDemo"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppContinuousConvexCollisionDemo.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/build: Demos/ContinuousConvexCollision/AppContinuousConvexCollisionDemo
.PHONY : Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/build

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/requires: Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/ContinuousConvexCollisionDemo.o.requires
.PHONY : Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/requires

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/clean:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision && $(CMAKE_COMMAND) -P CMakeFiles/AppContinuousConvexCollisionDemo.dir/cmake_clean.cmake
.PHONY : Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/clean

Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/depend:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/ContinuousConvexCollision/CMakeFiles/AppContinuousConvexCollisionDemo.dir/depend

