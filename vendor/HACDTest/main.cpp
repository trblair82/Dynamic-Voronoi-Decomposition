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
#include <cstdlib>
#include <iomanip.h>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int i = 0;
    int num_triangles = 105;
    float primitives[945];
    ifstream filenumbers;
    ofstream output;
    filenumbers.open("triangles.txt",fstream::in);
    while(!filenumbers.eof()){
        filenumbers >> primitives[i];
        if(filenumbers){
            i++;
        }
    }
    filenumbers.close();
    int pcount = 10;
    JNACluster* clusters = JNAConvexDecomposition(primitives, num_triangles, &pcount);
    int testPcount = pcount;
    int balls = 0;
    
//    JNACluster first = clusters[0];
//    int size = first.size;
//    int total = first.total;
//    float* points = first.floats;
//    float point = points[10];
//    
//    int* cluster_size = GetClusterSize();
//    output.open("hacd.txt");
//    
//    for(int i = 0;i<num_clusters;i++){
//       for(int j =0;j<cluster_size[i]*3;j++){
//           double d = clusters[i][j];
//            output << fixed << setprecision(5) << clusters[i][j] << endl;
//       }
//       output << "next\n";
//    }
//    output.close();
//    return 0;
}

