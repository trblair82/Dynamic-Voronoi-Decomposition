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
include Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/depend.make

# Include the progress variables for this target.
include Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/flags.make

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/flags.make
Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o: Demos/InternalEdgeDemo/InternalEdgeDemo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo/InternalEdgeDemo.cpp

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo/InternalEdgeDemo.cpp > CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.i

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo/InternalEdgeDemo.cpp -o CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.s

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.requires:
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.requires

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.provides: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.requires
	$(MAKE) -f Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/build.make Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.provides.build
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.provides

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.provides.build: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/flags.make
Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o: Demos/InternalEdgeDemo/main.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppInternalEdgeDemo.dir/main.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo/main.cpp

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppInternalEdgeDemo.dir/main.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo/main.cpp > CMakeFiles/AppInternalEdgeDemo.dir/main.i

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppInternalEdgeDemo.dir/main.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo/main.cpp -o CMakeFiles/AppInternalEdgeDemo.dir/main.s

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.requires:
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.requires

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.provides: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.requires
	$(MAKE) -f Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/build.make Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.provides.build
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.provides

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.provides.build: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o

# Object files for target AppInternalEdgeDemo
AppInternalEdgeDemo_OBJECTS = \
"CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o" \
"CMakeFiles/AppInternalEdgeDemo.dir/main.o"

# External object files for target AppInternalEdgeDemo
AppInternalEdgeDemo_EXTERNAL_OBJECTS =

Demos/InternalEdgeDemo/AppInternalEdgeDemo: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o
Demos/InternalEdgeDemo/AppInternalEdgeDemo: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o
Demos/InternalEdgeDemo/AppInternalEdgeDemo: Demos/OpenGL/libOpenGLSupport.dylib
Demos/InternalEdgeDemo/AppInternalEdgeDemo: src/BulletDynamics/libBulletDynamics.2.79.dylib
Demos/InternalEdgeDemo/AppInternalEdgeDemo: src/BulletCollision/libBulletCollision.2.79.dylib
Demos/InternalEdgeDemo/AppInternalEdgeDemo: src/LinearMath/libLinearMath.2.79.dylib
Demos/InternalEdgeDemo/AppInternalEdgeDemo: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/build.make
Demos/InternalEdgeDemo/AppInternalEdgeDemo: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppInternalEdgeDemo"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppInternalEdgeDemo.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/build: Demos/InternalEdgeDemo/AppInternalEdgeDemo
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/build

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/requires: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/InternalEdgeDemo.o.requires
Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/requires: Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/main.o.requires
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/requires

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/clean:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo && $(CMAKE_COMMAND) -P CMakeFiles/AppInternalEdgeDemo.dir/cmake_clean.cmake
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/clean

Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/depend:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/InternalEdgeDemo/CMakeFiles/AppInternalEdgeDemo.dir/depend

