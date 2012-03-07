/* 
 * File:   main.cpp
 * Author: trblair
 *
 * Created on February 11, 2012, 11:37 PM
 */

#include <cstdlib>
#include "hacdHACD.h"
#include <iostream>
#include <fstream>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int i = 0;
    int num_triangles = 105;
    float primitives[945];
    ifstream filenumbers;
    filenumbers.open("triangles.txt",fstream::in);
    while(!filenumbers.eof()){
        filenumbers >> primitives[i];
        if(filenumbers){
            i++;
        }
    }
    JNAConvexDecomposition(primitives, num_triangles);
     float test1 = primitives[0];
    return 0;
}

