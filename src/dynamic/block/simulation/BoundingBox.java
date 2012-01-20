/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.block.simulation;

import CGAL.Kernel.Point_3;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author trblair
 */
public class BoundingBox {
    
    private ArrayList planes = new ArrayList();
    private ArrayList corners = new ArrayList();
    private float size;
    private float3 origin;
    
    public BoundingBox(float box_size, float3 box_origin){
        this.setInstance(box_size, box_origin);
    }
    public BoundingBox(float box_size){
        setInstance(box_size);
    }
    public void setInstance(float box_size, float3 box_origin){
         
         origin = box_origin;
         size = box_size;
         
         if(origin == null){
             origin = new float3(0.0f,0.0f,0.0f);
         }
         corners.add(origin);
         corners.add(new float3(origin.x+size,origin.y,origin.z));
         corners.add(new float3(origin.x+size,origin.y+size,origin.z));
         corners.add(new float3(origin.x,origin.y+size,origin.z));
         corners.add(new float3(origin.x,origin.y,origin.z+size));
         corners.add(new float3(origin.x,origin.y+size,origin.z+size));
         corners.add(new float3(origin.x+size,origin.y+size,origin.z+size));
         corners.add(new float3(origin.x+size,origin.y,origin.z+size));
         
         
    }
    public void setInstance(float box_size){
        setInstance(box_size, null);
    }
    
    public boolean isWithin(float3 point){
        if(point.x<origin.x||point.x>origin.x+size||point.y<origin.y||point.y>origin.y+size||point.z<origin.z||point.z>origin.z+size){
            return false;
        }else{return true;}
    }
    
    public void setPlanes(){
         
        float3 a_origin = new float3(origin.x+size,origin.y+size,origin.z+size);
         float x = origin.x;        float y = origin.y;        float z = origin.z; 
         float ax = a_origin.x;        float ay = a_origin.y;        float az = a_origin.z;
         
         ArrayList plane = new ArrayList();
         plane.add(origin);
         float3 p1b = new float3(x+size, y, z);
         plane.add(p1b);
         float3 p1c = new float3(x, y+size, z);
         plane.add(p1c);
         planes.add(plane);
         plane.clear();
         
         
         plane.add(origin);
         float3 p2b = new float3(x, y, z+size);
         plane.add(p2b);
         plane.add(p1c);
         planes.add(plane);
         plane.clear();
         
         plane.add(origin);
         plane.add(p2b);
         plane.add(p1b);
         planes.add(plane);
         plane.clear();
         
         plane.add(a_origin);
         float3 p4b = new float3(ax, ay, az-size);
         plane.add(p4b);
         float3 p4c = new float3(ax, ay-size, az);
         plane.add(p4c);
         planes.add(plane);
         plane.clear();
         
         plane.add(a_origin);
         float3 p5b = new float3(ax-size, ay, az);
         plane.add(p5b);
         plane.add(p4c);
         planes.add(plane);
         plane.clear();
         
         plane.add(a_origin);
         plane.add(p5b);
         plane.add(p4b);
         planes.add(plane);
         plane.clear();
    }
    
    public ArrayList getPlanes(){
        return planes;
    }
    
    public ArrayList getCorners(){
        return corners;
    }
           
}
