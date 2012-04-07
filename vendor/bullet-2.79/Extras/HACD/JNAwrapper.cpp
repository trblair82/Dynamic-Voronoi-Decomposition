
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trblair
 */
#include <hacdHACD.h>
#include <JNAwrapper.h>

JNACluster* clusters;
HACD::Vec3<long>* end_triangles;
HACD::Vec3<HACD::Real>* end_points;
HACD::HACD my_hacd;
//
void FreeJNAConvexDecomposition(struct JNACluster* cluster){
    delete[] cluster;
//    delete[] end_triangles;
//    delete[] end_points;
    
    
}

JNACluster* JNAConvexDecomposition(float* inputConcave, int num_triangles, int *pcount){
    
    int float_count = 0;
    
    std::map<std::string,HACD::Vec3<HACD::Real>* > my_map;
    float*** triangles = (float ***) malloc (num_triangles * sizeof(float **));
    
    for(int i = 0;i<num_triangles;i++){
        triangles[i] = (float **) malloc (3 * sizeof(float *));
        for(int k = 0;k<3;k++){
            triangles[i][k] = (float *) malloc (3 * sizeof(float));
            for(int j = 0;j<3;j++){
                triangles[i][k][j] = inputConcave[float_count];
                float_count++;
            }
        }
    }
    
    for(int i = 0;i<num_triangles;i++){
        for(int j =0;j<3;j++){
            HACD::Vec3<HACD::Real>* point = new HACD::Vec3<HACD::Real>(triangles[i][j][0],triangles[i][j][1],triangles[i][j][2]);
            int tester = my_map.size();
            double x = point->X();
            double y = point->Y();
            double z = point->Z();
            
            
            
            char buffer[32];  
            snprintf(buffer, sizeof(buffer), "%010.5f/%010.5f/%010.5f", x, y, z);

            my_map[buffer] = point;

            

            
            
            
        }
    }
    std::vector<std::string> keys;

    end_points = (HACD::Vec3<HACD::Real>*) malloc (my_map.size() * sizeof(HACD::Vec3<HACD::Real>));
    int key_count = 0;
    
    std::map<std::string,HACD::Vec3<HACD::Real>* >::iterator key_iter;
    for(key_iter = my_map.begin();key_iter!=my_map.end();key_iter++){
        std::string temp_str = key_iter->first;
        keys.push_back(temp_str);

        
        
        
        end_points[key_count] = *key_iter->second;
       

        key_count++;
    }
    
  
    end_triangles = (HACD::Vec3<long>*) malloc (num_triangles * sizeof(HACD::Vec3<long>));
    for(int i = 0;i<num_triangles;i++){
        long index[3];
        int index_count = 0;
        for(int j =0;j<3;j++){
            HACD::Vec3<HACD::Real>* point = new HACD::Vec3<HACD::Real>(triangles[i][j][0],triangles[i][j][1],triangles[i][j][2]);
           
            double x = point->X();
            double y = point->Y();
            double z = point->Z();
            
            char buffer[32];  
            snprintf(buffer, sizeof(buffer), "%010.5f/%010.5f/%010.5f", x, y, z);

            
            for(int k = 0;k<keys.size();k++){

                std::string key1_str = keys.at(k);

                
                
                if(key1_str.compare(buffer)==0){
                    index[index_count] = (long)k;
                    index_count++;
                }
            }
        }
        HACD::Vec3<long>* triangle = new HACD::Vec3<long>(index[0],index[1],index[2]);

        end_triangles[i] = *triangle;
        int testert = 0;
    }
    

    for(int i =0;i<num_triangles;i++){
        for(int j =0;j<3;j++){
            
            delete[] triangles[i][j];
        }
        delete[] triangles[i];
    }
    
    
    
    my_hacd.SetNTriangles(num_triangles);
    my_hacd.SetNPoints(my_map.size());
    
    my_hacd.SetPoints(end_points);
    my_hacd.SetTriangles(end_triangles);
    
    my_hacd.SetCompacityWeight(0.1);
    my_hacd.SetVolumeWeight(0.0);
    my_hacd.SetNClusters(2);                     // minimum number of clusters
    my_hacd.SetNVerticesPerCH(100);                      // max of 100 vertices per convex-hull
    my_hacd.SetConcavity(100);                     // maximum concavity
    my_hacd.SetAddExtraDistPoints(true);   
    my_hacd.SetAddNeighboursDistPoints(true);   
    my_hacd.SetAddFacesPoints(true); 
    my_hacd.Compute();
//    
    int num_clusters = my_hacd.GetNClusters();
    pcount[0] = num_clusters;
    
    
    
    
    clusters = (JNACluster*)malloc(num_clusters*sizeof(JNACluster));
    int cluster_count =0;

    for(size_t i = 0;i<num_clusters;i++){
       size_t nPoints = my_hacd.GetNPointsCH(i);

       size_t nTriangles = my_hacd.GetNTrianglesCH(i); 
       HACD::Vec3<HACD::Real>* cluster_points = new HACD::Vec3<HACD::Real>[nPoints];
       HACD::Vec3<long>* cluster_triangles = new HACD::Vec3<long>[nTriangles];
       my_hacd.GetCH(i,cluster_points,cluster_triangles);
       float* end_cluster_points = (float*)malloc((nPoints*3)*sizeof(float));
       for(size_t j = 0;j<nPoints;j++){
           
           double x = cluster_points[j].X();
           end_cluster_points[j*3]=x;

           double y = cluster_points[j].Y();
           end_cluster_points[j*3+1]=y;

           double z = cluster_points[j].Z();
           end_cluster_points[j*3+2]=z;
         
           
       }
       int n_points = my_hacd.GetNPointsCH(cluster_count);
       clusters[cluster_count].floats = end_cluster_points;
       clusters[cluster_count].size = n_points*3;
       
       cluster_count++; 

        delete[] cluster_points;
        delete[] cluster_triangles;
    }

    return clusters;
    
}

