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
include Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/depend.make

# Include the progress variables for this target.
include Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/flags.make

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/flags.make
Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o: Demos/VehicleDemo/VehicleDemo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo/VehicleDemo.cpp

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppVehicleDemo.dir/VehicleDemo.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo/VehicleDemo.cpp > CMakeFiles/AppVehicleDemo.dir/VehicleDemo.i

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppVehicleDemo.dir/VehicleDemo.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo/VehicleDemo.cpp -o CMakeFiles/AppVehicleDemo.dir/VehicleDemo.s

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.requires:
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.requires

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.provides: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.requires
	$(MAKE) -f Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/build.make Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.provides.build
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.provides

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.provides.build: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/flags.make
Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o: Demos/VehicleDemo/main.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppVehicleDemo.dir/main.o -c /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo/main.cpp

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppVehicleDemo.dir/main.i"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo/main.cpp > CMakeFiles/AppVehicleDemo.dir/main.i

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppVehicleDemo.dir/main.s"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo/main.cpp -o CMakeFiles/AppVehicleDemo.dir/main.s

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.requires:
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.requires

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.provides: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.requires
	$(MAKE) -f Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/build.make Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.provides.build
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.provides

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.provides.build: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o

# Object files for target AppVehicleDemo
AppVehicleDemo_OBJECTS = \
"CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o" \
"CMakeFiles/AppVehicleDemo.dir/main.o"

# External object files for target AppVehicleDemo
AppVehicleDemo_EXTERNAL_OBJECTS =

Demos/VehicleDemo/AppVehicleDemo: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o
Demos/VehicleDemo/AppVehicleDemo: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o
Demos/VehicleDemo/AppVehicleDemo: Demos/OpenGL/libOpenGLSupport.dylib
Demos/VehicleDemo/AppVehicleDemo: src/BulletDynamics/libBulletDynamics.2.79.dylib
Demos/VehicleDemo/AppVehicleDemo: src/BulletCollision/libBulletCollision.2.79.dylib
Demos/VehicleDemo/AppVehicleDemo: src/LinearMath/libLinearMath.2.79.dylib
Demos/VehicleDemo/AppVehicleDemo: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/build.make
Demos/VehicleDemo/AppVehicleDemo: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppVehicleDemo"
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppVehicleDemo.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/build: Demos/VehicleDemo/AppVehicleDemo
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/build

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/requires: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/VehicleDemo.o.requires
Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/requires: Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/main.o.requires
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/requires

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/clean:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo && $(CMAKE_COMMAND) -P CMakeFiles/AppVehicleDemo.dir/cmake_clean.cmake
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/clean

Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/depend:
	cd /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo /Users/sikanrong/DynamicBlock/vendor/bullet-2.79 /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo /Users/sikanrong/DynamicBlock/vendor/bullet-2.79/Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/VehicleDemo/CMakeFiles/AppVehicleDemo.dir/depend

