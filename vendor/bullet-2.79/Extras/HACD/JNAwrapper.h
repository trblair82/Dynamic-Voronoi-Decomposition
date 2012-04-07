/* 
 * File:   JNAwrapper.h
 * Author: trblair
 *
 * Created on April 6, 2012, 10:14 PM
 */

#ifndef JNAWRAPPER_H
#define	JNAWRAPPER_H

struct JNACluster {
    float* floats;
    int size;
    

} ;       

extern "C" JNACluster* JNAConvexDecomposition(float* inputConcave,int num_triangles, int *pcount);

extern "C" void FreeJNAConvexDecomposition(struct JNACluster* clusters);


#endif	/* JNAWRAPPER_H */

