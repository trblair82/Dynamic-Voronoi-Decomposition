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
include Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/depend.make

# Include the progress variables for this target.
include Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/progress.make

# Include the compile flags for this target's objects.
include Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o: Demos/ParticlesOpenCL/btParticlesDemoDynamicsWorld.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/btParticlesDemoDynamicsWorld.cpp

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/btParticlesDemoDynamicsWorld.cpp > CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.i

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/btParticlesDemoDynamicsWorld.cpp -o CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.s

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.requires:
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.provides: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.requires
	$(MAKE) -f Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.provides.build
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.provides

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.provides.build: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o: Demos/ParticlesOpenCL/main.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/main.cpp

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppParticlesOCL_Mini.dir/__/main.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/main.cpp > CMakeFiles/AppParticlesOCL_Mini.dir/__/main.i

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppParticlesOCL_Mini.dir/__/main.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/main.cpp -o CMakeFiles/AppParticlesOCL_Mini.dir/__/main.s

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.requires:
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.provides: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.requires
	$(MAKE) -f Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.provides.build
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.provides

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.provides.build: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o: Demos/ParticlesOpenCL/ParticlesDemo.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_3)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/ParticlesDemo.cpp

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/ParticlesDemo.cpp > CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.i

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/ParticlesDemo.cpp -o CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.s

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.requires:
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.provides: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.requires
	$(MAKE) -f Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.provides.build
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.provides

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.provides.build: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o: Demos/ParticlesOpenCL/shaders.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_4)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/shaders.cpp

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/shaders.cpp > CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.i

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/shaders.cpp -o CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.s

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.requires:
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.provides: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.requires
	$(MAKE) -f Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.provides.build
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.provides

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.provides.build: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o: Demos/ParticlesOpenCL/MiniCL/MiniCLTaskWrap.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_5)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL/MiniCLTaskWrap.cpp

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL/MiniCLTaskWrap.cpp > CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.i

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL/MiniCLTaskWrap.cpp -o CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.s

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.requires:
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.provides: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.requires
	$(MAKE) -f Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.provides.build
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.provides

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.provides.build: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o: Demos/SharedOpenCL/btOclUtils.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_6)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp > CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.i

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclUtils.cpp -o CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.s

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires:
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires
	$(MAKE) -f Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides.build
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.provides.build: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/flags.make
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o: Demos/SharedOpenCL/btOclCommon.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/CMakeFiles $(CMAKE_PROGRESS_7)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o -c /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.i"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp > CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.i

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.s"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/SharedOpenCL/btOclCommon.cpp -o CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.s

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires:
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires
	$(MAKE) -f Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides.build
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.provides.build: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o

# Object files for target AppParticlesOCL_Mini
AppParticlesOCL_Mini_OBJECTS = \
"CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o" \
"CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o" \
"CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o" \
"CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o" \
"CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o" \
"CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o" \
"CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o"

# External object files for target AppParticlesOCL_Mini
AppParticlesOCL_Mini_EXTERNAL_OBJECTS =

Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/OpenGL/libOpenGLSupport.a
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: src/BulletDynamics/libBulletDynamics.a
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: src/BulletCollision/libBulletCollision.a
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: src/MiniCL/libMiniCL.a
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: src/BulletMultiThreaded/libBulletMultiThreaded.a
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: src/LinearMath/libLinearMath.a
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build.make
Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX executable AppParticlesOCL_Mini"
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/AppParticlesOCL_Mini.dir/link.txt --verbose=$(VERBOSE)
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && /usr/local/bin/cmake -E copy_if_different /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/ParticlesOCL.cl /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL

# Rule to build all files generated by this target.
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build: Demos/ParticlesOpenCL/MiniCL/AppParticlesOCL_Mini
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/build

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/btParticlesDemoDynamicsWorld.o.requires
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/main.o.requires
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/ParticlesDemo.o.requires
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/shaders.o.requires
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/MiniCLTaskWrap.o.requires
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclUtils.o.requires
Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires: Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/__/__/SharedOpenCL/btOclCommon.o.requires
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/requires

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/clean:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL && $(CMAKE_COMMAND) -P CMakeFiles/AppParticlesOCL_Mini.dir/cmake_clean.cmake
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/clean

Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/depend:
	cd /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79 /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL /Users/trblair/NetBeansProjects/DynamicBlock/vendor/bullet-2.79/Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Demos/ParticlesOpenCL/MiniCL/CMakeFiles/AppParticlesOCL_Mini.dir/depend
