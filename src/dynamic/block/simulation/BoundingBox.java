/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.block.simulation;

import CGAL.Kernel.Point_3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.vecmath.Point3f;

/**
 *
 * @author trblair
 */
public class BoundingBox {
    
    private HashMap planes = new HashMap();
    private ArrayList corners = new ArrayList();
    private float size;
    private float3 origin;
    private ArrayList corner_points = new ArrayList();
    
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
         float3 corner_origin = origin;
         ArrayList corner = new ArrayList();
         corner.add(origin);
         corner.add("Xleft");corner.add("Ybottom");corner.add("Zback");
         corners.add(corner_origin);
         corner_points.add(corner);
         
         corner = new ArrayList();
         float3 c1 = new float3(origin.x,origin.y+size,origin.z);
         corner.add(c1);
         corner.add("Xleft");corner.add("Ytop");corner.add("Zback");
         corners.add(new float3(corner_origin.x,corner_origin.y+(size),corner_origin.z));
         corner_points.add(corner);
         
         corner = new ArrayList();
         float3 c2 = new float3(origin.x+size,origin.y+size,origin.z);
         corner.add(c2);
         corner.add("Xright");corner.add("Ytop");corner.add("Zback");
         corners.add(new float3(corner_origin.x+(size),corner_origin.y+(size),corner_origin.z));
         corner_points.add(corner);
         
         corner = new ArrayList();
         float3 c3 = new float3(origin.x+size,origin.y,origin.z);
         corner.add(c3);
         corner.add("Xright");corner.add("Ybottom");corner.add("Zback");
         corners.add(new float3(corner_origin.x+(size),corner_origin.y,corner_origin.z));
         corner_points.add(corner);
         
         corner = new ArrayList();
         float3 c4 = new float3(origin.x,origin.y,origin.z+size);
         corner.add(c4);
         corner.add("Xleft");corner.add("Ybottom");corner.add("Zfront");
         corners.add(new float3(corner_origin.x,corner_origin.y,corner_origin.z+(size)));
         corner_points.add(corner);
         
         corner = new ArrayList();
         float3 c5 = new float3(origin.x,origin.y+size,origin.z+size);
         corner.add(c5);
         corner.add("Xleft");corner.add("Ytop");corner.add("Zfront");
         corners.add(new float3(corner_origin.x,corner_origin.y+(size),corner_origin.z+(size)));
         corner_points.add(corner);
         
         corner = new ArrayList();
         float3 c6 = new float3(origin.x+size,origin.y+size,origin.z+size);
         corner.add(c6);
         corner.add("Xright");corner.add("Ytop");corner.add("Zfront");
         corners.add(new float3(corner_origin.x+(size),corner_origin.y+(size),corner_origin.z+(size)));
         corner_points.add(corner);
         
         corner = new ArrayList();
         float3 c7 = new float3(origin.x+size,origin.y,origin.z+size);
         corner.add(c7);
         corner.add("Xright");corner.add("Ybottom");corner.add("Zfront");
         corners.add(new float3(corner_origin.x+(size),corner_origin.y,corner_origin.z+(size)));
         corner_points.add(corner);
         
    }
    public void setInstance(float box_size){
        setInstance(box_size, null);
    }
    
    public Point_3 intersects(Point_3 inside, Point_3 outside){
        
        Point_3 to_return = null;
        float3 inner = new float3((float)inside.x(),(float)inside.y(),(float)inside.z());
        float3 outer = new float3((float)outside.x(),(float)outside.y(),(float)outside.z());
        Point3f outerf = new Point3f(outer.x,outer.y,outer.z);
        Float old_distance = null;
        ArrayList intersections = new ArrayList();
        ArrayList real_intersections = new ArrayList();
        Iterator planes_iter = planes.keySet().iterator();
        
        while(planes_iter.hasNext()){
            ArrayList plane = (ArrayList)planes.get(planes_iter.next());
            Line.intersectPlane(intersections, outer, inner, (float3)plane.get(0), (float3)plane.get(1), (float3)plane.get(2));
            
            if(!intersections.isEmpty()){
                Intersection inter = (Intersection)intersections.get(0);
                float3 intersectsf = inter.intersection;
                Point_3 intersects = new Point_3(intersectsf.x,intersectsf.y,intersectsf.z);
                intersections.clear();
                                     
                if(this.isClose(intersects)){
                    real_intersections.add(intersectsf);
                    
                }
            }
        }
        
        for(int i = 0;i<real_intersections.size();i++){
            float3 temp = (float3)real_intersections.get(i);
            Point3f test = new Point3f(temp.x,temp.y,temp.z);
            Point_3 shortest = new Point_3(temp.x,temp.y,temp.z);
            Float distance = outerf.distance(test);
            if(old_distance == null){
                old_distance = distance;
                to_return = shortest;
            }
            if(distance<old_distance){
                old_distance = distance;
                to_return = shortest;
            }
                  
        }
        return to_return;
    }
    
    public boolean isWithin(Point_3 point){
        float3 pointf = new float3((float)point.x(),(float)point.y(),(float)point.z());
        if(pointf.x<origin.x+0.1||pointf.x>origin.x+size-0.1||pointf.y<origin.y+0.1||pointf.y>origin.y+size-0.1||pointf.z<origin.z+0.1||pointf.z>origin.z+size-0.1){
            return false;
        }else{return true;}
    }
    
    public boolean isClose(Point_3 point){
        float3 pointf = new float3((float)point.x(),(float)point.y(),(float)point.z());
        if(pointf.x<origin.x-0.1||pointf.x>origin.x+size+0.1||pointf.y<origin.y-0.1||pointf.y>origin.y+size+0.1||pointf.z<origin.z-0.1||pointf.z>origin.z+size+0.1){
            return false;
        }else{return true;}
    }
    
    public void setPlanes(){
         
        float3 a_origin = new float3(origin.x+size,origin.y+size,origin.z+size);
         float x = origin.x;        float y = origin.y;        float z = origin.z; 
         float ax = a_origin.x;        float ay = a_origin.y;        float az = a_origin.z;
         
         ArrayList plane1 = new ArrayList();
         plane1.add(origin);
         float3 p1b = new float3(x+size, y, z);
         plane1.add(p1b);
         float3 p1c = new float3(x, y+size, z);
         plane1.add(p1c);
         planes.put("Zback",plane1);
         
         
         ArrayList plane2 = new ArrayList();
         plane2.add(origin);
         float3 p2b = new float3(x, y, z+size);
         plane2.add(p2b);
         plane2.add(p1c);
         planes.put("Xleft",plane2);
         
         
         ArrayList plane3 = new ArrayList();
         plane3.add(origin);
         plane3.add(p2b);
         plane3.add(p1b);
         planes.put("Ybottom",plane3);
         
         
         ArrayList plane4 = new ArrayList();
         plane4.add(a_origin);
         float3 p4b = new float3(ax, ay, az-size);
         plane4.add(p4b);
         float3 p4c = new float3(ax, ay-size, az);
         plane4.add(p4c);
         planes.put("Xright",plane4);
         
         
         ArrayList plane5 = new ArrayList();
         plane5.add(a_origin);
         float3 p5b = new float3(ax-size, ay, az);
         plane5.add(p5b);
         plane5.add(p4c);
         planes.put("Zfront",plane5);
         
         
         ArrayList plane6 = new ArrayList();
         plane6.add(a_origin);
         plane6.add(p5b);
         plane6.add(p4b);
         planes.put("Ytop",plane6);
         
    }
    
    public HashMap getPlanes(){
        return planes;
    }
    
    public ArrayList getCorners(){
        return corners;
    }
    public float3 getCorner(ArrayList plane_strings){
        Iterator corner_iter = corner_points.iterator();
        float3 toReturn = null;
        while(corner_iter.hasNext()){
            ArrayList temp = new ArrayList();
            ArrayList c = (ArrayList)corner_iter.next();
            for(int i=0;i<plane_strings.size();i++){
                String plane = (String)plane_strings.get(i);
                if(c.contains(plane)){
                   temp.add(plane); 
                }
                if(temp.size()==3){
                    toReturn = (float3)c.get(0);
                }
            }
        }
        return toReturn;
        
    }       
}
