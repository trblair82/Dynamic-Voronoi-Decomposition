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
include Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/depend.make

# Include the progress variables for this target.
include Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/flags.make

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/flags.make
Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o: Demos/ConcaveDemo/ConcavePhysicsDemo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo/ConcavePhysicsDemo.cpp

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo/ConcavePhysicsDemo.cpp > CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.i

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo/ConcavePhysicsDemo.cpp -o CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.s

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.requires:
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.requires

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.provides: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.requires
	$(MAKE) -f Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/build.make Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.provides.build
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.provides

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.provides.build: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/flags.make
Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o: Demos/ConcaveDemo/main.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppConcaveDemo.dir/main.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo/main.cpp

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppConcaveDemo.dir/main.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo/main.cpp > CMakeFiles/AppConcaveDemo.dir/main.i

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppConcaveDemo.dir/main.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo/main.cpp -o CMakeFiles/AppConcaveDemo.dir/main.s

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.requires:
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.requires

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.provides: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.requires
	$(MAKE) -f Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/build.make Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.provides.build
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.provides

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.provides.build: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o

# Object files for target AppConcaveDemo
AppConcaveDemo_OBJECTS = \
"CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o" \
"CMakeFiles/AppConcaveDemo.dir/main.o"

# External object files for target AppConcaveDemo
AppConcaveDemo_EXTERNAL_OBJECTS =

Demos/ConcaveDemo/AppConcaveDemo: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o
Demos/ConcaveDemo/AppConcaveDemo: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o
Demos/ConcaveDemo/AppConcaveDemo: Demos/OpenGL/libOpenGLSupport.a
Demos/ConcaveDemo/AppConcaveDemo: Extras/Serialize/BulletWorldImporter/libBulletWorldImporter.a
Demos/ConcaveDemo/AppConcaveDemo: src/BulletDynamics/libBulletDynamics.a
Demos/ConcaveDemo/AppConcaveDemo: src/BulletCollision/libBulletCollision.a
Demos/ConcaveDemo/AppConcaveDemo: Extras/Serialize/BulletFileLoader/libBulletFileLoader.a
Demos/ConcaveDemo/AppConcaveDemo: src/LinearMath/libLinearMath.a
Demos/ConcaveDemo/AppConcaveDemo: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/build.make
Demos/ConcaveDemo/AppConcaveDemo: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppConcaveDemo"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppConcaveDemo.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/build: Demos/ConcaveDemo/AppConcaveDemo
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/build

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/requires: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/ConcavePhysicsDemo.o.requires
Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/requires: Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/main.o.requires
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/requires

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/clean:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo && $(CMAKE_COMMAND) -P CMakeFiles/AppConcaveDemo.dir/cmake_clean.cmake
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/clean

Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/depend:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/ConcaveDemo/CMakeFiles/AppConcaveDemo.dir/depend

