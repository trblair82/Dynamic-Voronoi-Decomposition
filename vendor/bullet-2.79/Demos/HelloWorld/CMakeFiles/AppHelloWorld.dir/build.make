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
include Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/depend.make

# Include the progress variables for this target.
include Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/flags.make

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o: Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/flags.make
Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o: Demos/HelloWorld/HelloWorld.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppHelloWorld.dir/HelloWorld.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld/HelloWorld.cpp

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppHelloWorld.dir/HelloWorld.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld/HelloWorld.cpp > CMakeFiles/AppHelloWorld.dir/HelloWorld.i

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppHelloWorld.dir/HelloWorld.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld/HelloWorld.cpp -o CMakeFiles/AppHelloWorld.dir/HelloWorld.s

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.requires:
.PHONY : Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.requires

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.provides: Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.requires
	$(MAKE) -f Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/build.make Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.provides.build
.PHONY : Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.provides

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.provides.build: Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o

# Object files for target AppHelloWorld
AppHelloWorld_OBJECTS = \
"CMakeFiles/AppHelloWorld.dir/HelloWorld.o"

# External object files for target AppHelloWorld
AppHelloWorld_EXTERNAL_OBJECTS =

Demos/HelloWorld/AppHelloWorld: Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o
Demos/HelloWorld/AppHelloWorld: src/BulletDynamics/libBulletDynamics.2.79.dylib
Demos/HelloWorld/AppHelloWorld: src/BulletCollision/libBulletCollision.2.79.dylib
Demos/HelloWorld/AppHelloWorld: src/LinearMath/libLinearMath.2.79.dylib
Demos/HelloWorld/AppHelloWorld: Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/build.make
Demos/HelloWorld/AppHelloWorld: Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppHelloWorld"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppHelloWorld.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/build: Demos/HelloWorld/AppHelloWorld
.PHONY : Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/build

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/requires: Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/HelloWorld.o.requires
.PHONY : Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/requires

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/clean:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld && $(CMAKE_COMMAND) -P CMakeFiles/AppHelloWorld.dir/cmake_clean.cmake
.PHONY : Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/clean

Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/depend:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/HelloWorld/CMakeFiles/AppHelloWorld.dir/depend

