package dynamic.block.simulation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trblair
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
import javax.media.opengl.*;
import java.util.LinkedList;
import com.bulletphysics.dynamics.*;
import com.bulletphysics.collision.shapes.BU_Simplex1to4;
import com.bulletphysics.linearmath.*;
import com.bulletphysics.linearmath.Transform;
import CGAL.Triangulation_3.*;
import CGAL.Kernel.Point_3;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Cell_handle;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Vertex_handle;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.math.geometry.Rotation;
import javax.vecmath.*;
import javax.vecmath.Point3f;
import org.apache.commons.math.geometry.RotationOrder;


public class Delaunay {
    
    private LinkedList<Point_3> input_points=new LinkedList<Point_3>();
    public HashMap cell_vertices = new HashMap();
    public HashMap voronoi_vertices = new HashMap();
    public HashMap voronoi_cells = new HashMap();
    public int vcellHash = 0;
    public ArrayList voronoi_points = new ArrayList();
    public ArrayList delaunay_cube = new ArrayList();
    private Delaunay_triangulation_3 dt;
    public double[] angles;
    public boolean hit = true;
    public int out_hold;
    public ArrayList test = new ArrayList();
    
    public float3 p1a = new float3(0.0f,0.0f,0.0f);
    public float3 p1b = new float3(20.0f,0.0f,0.0f);
    public float3 p1c = new float3(20.0f,20.0f,0.0f);
    public float3 p2a = new float3(20.0f,0.0f,0.0f);
    public float3 p2b = new float3(20.0f,0.0f,20.0f);
    public float3 p2c = new float3(20.0f,20.0f,20.0f);
    public float3 p3a = new float3(20.0f,0.0f,20.0f);
    public float3 p3b = new float3(0.0f,0.0f,20.0f);
    public float3 p3c = new float3(0.0f,20.0f,20.0f);
    public float3 p4a = new float3(0.0f,0.0f,20.0f);
    public float3 p4b = new float3(0.0f,0.0f,0.0f);
    public float3 p4c = new float3(0.0f,20.0f,0.0f);
    public float3 p5a = new float3(0.0f,0.0f,0.0f);
    public float3 p5b = new float3(0.0f,0.0f,20.0f);
    public float3 p5c = new float3(20.0f,0.0f,20.0f);
    public float3 p6a = new float3(0.0f,20.0f,0.0f);
    public float3 p6b = new float3(0.0f,20.0f,20.0f);
    public float3 p6c = new float3(20.0f,20.0f,20.0f);
    public Point3f intersect2,intersect1;
    public Point_3 real_intersect,a1,a2,a3,a4;
    public ArrayList realPoints = new ArrayList();
    public ArrayList voronoi_intersect = new ArrayList();
    public ArrayList out_voronoi= new ArrayList();
    public ArrayList dcells = new ArrayList();
    
    
    
    
    public Delaunay_triangulation_3_Cell_handle neigh;
    public Delaunay(int num_points){   
        
        int hashStart = 0;
        int v_hashStart = 0;
        dt = new Delaunay_triangulation_3();
        
        
        for(int i = 0;i<num_points;i++){
            
            double x = (Math.random()*1000)%20;
            double y = (Math.random()*1000)%20;
            double z = (Math.random()*1000)%20;
            input_points.add(new Point_3(x,y,z));
        }
        
        
        input_points.add(new Point_3(0.0,0.0,0.0));
        input_points.add(new Point_3(20.0,0.0,0.0));
        input_points.add(new Point_3(20.0,20.0,0.0));
        input_points.add(new Point_3(0.0,20.0,0.0));
        input_points.add(new Point_3(0.0,0.0,20.0));
        input_points.add(new Point_3(0.0,20.0,20.0));
        input_points.add(new Point_3(20.0,20.0,20.0));
        input_points.add(new Point_3(20.0,0.0,20.0));
        
        
        dt.insert(input_points.iterator());
        
        
        Delaunay_triangulation_3_All_cells_iterator cells = dt.all_cells();
        
        
        while(cells.hasNext()){
            
            Delaunay_triangulation_3_Cell_handle ch = cells.next();
            dcells.add(ch);
            ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
            
            
            for(int k=0;k<4;k++){
                
                Delaunay_triangulation_3_Vertex_handle v = ch.vertex(k);
                Point_3 vertex = v.point();
                Vector3f V1 = new Vector3f((float)vertex.x(),(float)vertex.y(),(float)vertex.z());
                vertices.add(V1);
            }
            
            
            if(!dt.is_infinite(ch)&&dt.is_valid(ch)) {
                
                cell_vertices.put(hashStart, vertices);
                
                hashStart++;
                Point_3 circ = dt.dual(ch);
                if(circ.x()>0.0&&circ.x()<20.0&&circ.y()>0.0&&circ.y()<20.0&&circ.z()>0.0&&circ.z()<20.0){
                    ArrayList voronoi = new ArrayList();
                    voronoi.add(circ);
                    voronoi_points.add(circ);
                    
                        
                    
                    for(int i=0;i<4;i++){
                         
                        neigh = ch.neighbor(i);
                        Point_3 v_neigh = dt.dual(neigh);
                            
                            
                            
                         if(v_neigh.x()<0.0||v_neigh.x()>20.0||v_neigh.y()<0.0||v_neigh.y()>20.0||v_neigh.z()<0.0||v_neigh.z()>20.0){
                             out_voronoi.add(v_neigh);
                             ArrayList points = new ArrayList();
                             float3 outside = new float3((float)v_neigh.x(),(float)v_neigh.y(),(float)v_neigh.z());
                             float3 inside = new float3((float)circ.x(),(float)circ.y(),(float)circ.z());
                             Line.intersectPlane(points, outside, inside, p1a, p1b, p1c);
                             Line.intersectPlane(points, outside, inside, p2a, p2b, p2c);
                             Line.intersectPlane(points, outside, inside, p3a, p3b, p3c);
                             Line.intersectPlane(points, outside, inside, p4a, p4b, p4c);
                             Line.intersectPlane(points, outside, inside, p5a, p5b, p5c);
                             Line.intersectPlane(points, outside, inside, p6a, p6b, p6c);
                             Iterator iter = points.iterator();
                             while(iter.hasNext()){
                                Intersection inter = (Intersection)iter.next();
                                float3 intersects = inter.intersection;
                                if(intersects.x<-0.10f||intersects.x>20.10f){
                                    
                                } 
                         
                                else if(intersects.y<-0.10f||intersects.y>20.10f){
                              
                                }    
                                else if(intersects.z<-0.10f||intersects.z>20.10f){
                             
                                }else{realPoints.add(intersects);}
                             }    
                         
                             Point3f outsidef = new Point3f(outside.x,outside.y,outside.z);   
                             if(realPoints.size()>1){
                                float3 intersect1i = (float3)realPoints.get(0);
                                Point3f intersect1 = new Point3f(intersect1i.x,intersect1i.y,intersect1i.z);
                                float3 intersection2 = (float3)realPoints.get(1);
                                intersect2 = new Point3f(intersection2.x,intersection2.y,intersection2.z);
                             
                                if(outsidef.distance(intersect1)>outsidef.distance(intersect2)){
                                    v_neigh = new Point_3(intersect2.x,intersect2.y,intersect2.z); 
                            
                                }
                                if(outsidef.distance(intersect1)<outsidef.distance(intersect2)){
                                    v_neigh = new Point_3(intersect1.x,intersect1.y,intersect1.z);
                                }
                                if(realPoints.size()>2){
                                    float3 intersect3i = (float3)realPoints.get(2);
                                    Point3f intersect3 = new Point3f(intersect3i.x,intersect3i.y,intersect3i.z);
                                    if(outsidef.distance(intersect1)<outsidef.distance(intersect2)&&outsidef.distance(intersect1)<outsidef.distance(intersect3)){
                                        v_neigh = new Point_3(intersect1.x,intersect1.y,intersect1.z);
                                    }
                                    if(outsidef.distance(intersect2)<outsidef.distance(intersect1)&&outsidef.distance(intersect2)<outsidef.distance(intersect3)){
                                        v_neigh = new Point_3(intersect2.x,intersect2.y,intersect2.z); 
                                    }
                                    if(outsidef.distance(intersect3)<outsidef.distance(intersect1)&&outsidef.distance(intersect3)<outsidef.distance(intersect2)){
                                        v_neigh = new Point_3(intersect3.x,intersect3.y,intersect3.z);
                                    }
                                }
                                
                             }
                             if(realPoints.size()==1){
                                float3 intersect1i = (float3)realPoints.get(0);
                                v_neigh = new Point_3(intersect1i.x,intersect1i.y,intersect1i.z);
                                
                             }
                            
                
                             if(realPoints.isEmpty()){
                                v_neigh = circ;
                                
                             }
                         voronoi_points.add(v_neigh);   
                         voronoi_intersect.add(v_neigh);
                         voronoi.add(v_neigh);
                         realPoints.clear();
                         
                         
                     
                        }else{voronoi.add(v_neigh);voronoi_points.add(v_neigh);  
                                
                         
                    }
                    if(!voronoi.isEmpty()){
                        
                                
                        voronoi_vertices.put(v_hashStart, voronoi);
                        v_hashStart++;
                    }
                }
            }
        }
    }   
        
        Delaunay_triangulation_3_All_vertices_iterator verts = dt.all_vertices();
             while(verts.hasNext()){
                 ArrayList voronoi_cell = new ArrayList();
                 
                 Delaunay_triangulation_3_Vertex_handle delaunayP = verts.next();
                 Delaunay_triangulation_3_Finite_cells_iterator cells1 = dt.finite_cells();
                 while(cells1.hasNext()){
//                     
                     Delaunay_triangulation_3_Cell_handle delaunayC = cells1.next();
                     
                     if(delaunayC.has_vertex(delaunayP)){
                         Point_3 vcell = dt.dual(delaunayC);
                         for(int l=0;l<out_voronoi.size();l++){
                             Point_3 out = (Point_3)out_voronoi.get(l);
                             if(out.equals(vcell)){
                                 vcell = (Point_3)voronoi_intersect.get(l);
                             }
                         }
                       
                         for(int i = 0;i<voronoi_points.size();i++){
                             Point_3 test = (Point_3)voronoi_points.get(i);
                             if(test.equals(vcell)){
                                voronoi_cell.add(vcell);
                                break;
                             }
                          }
                          

                         
                     }
                 }
                 if(voronoi_cell.size()>4){
                    voronoi_cells.put(vcellHash, voronoi_cell);
                    vcellHash++;
                 }   
             }
              
    }
    
        
    
    
     public void drawDelaunay(GL gl,float rotate){
         
        Vector3f force = new Vector3f(0.0f,5.0f,0.0f);
        Iterator cell_iter = cell_vertices.keySet().iterator();
        int t = 0;
        
        
        while(cell_iter.hasNext()){
            
            
            ArrayList<Vector3f> v1 = (ArrayList<Vector3f>)cell_vertices.get(cell_iter.next());
            Transform trans = new Transform();
            RigidBody tri = (RigidBody)Physics.tetrahedrons.get(t);t++;
            
            
            if(hit){
                tri.applyImpulse(force,force);
            }
            
            
            if(t>Physics.tetrahedrons.size()-1){
                hit = false;
            }
            
            
            MotionState ms = tri.getMotionState();
            trans = ms.getWorldTransform(trans);
            Quat4f quat = new Quat4f();
            quat = trans.getRotation(quat);
            float degrees = (float)quat.w*(float)(180/Math.PI);
            Matrix3f basis = trans.basis;
            float[][] basisF = new float[3][3];
            double[][] basisD = new double[3][3];
            
        
            for (int i = 0; i < 3; i++){
                
                basis.getRow(i, basisF[i]);
                
                
                for(int inner_i = 0; inner_i < basisF.length; inner_i++){
                    
                    basisD[i][inner_i] = (double)basisF[i][inner_i];
                }
            }
        
            try {
                
                angles = new Rotation(basisD, 1.0e-10).getAngles(RotationOrder.XYZ);
            } 
            
            
            catch (java.lang.Exception ex) {
                
                Logger.getLogger(Delaunay.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         
         
            BU_Simplex1to4 shape = (BU_Simplex1to4)tri.getCollisionShape();
            Vector3f test = new Vector3f();
            Vector3f test1 =new Vector3f();
            Vector3f test2 =new Vector3f();
            Vector3f test3 =new Vector3f();
            shape.getVertex(0, test);
            shape.getVertex(1, test1);
            shape.getVertex(2, test2);
            shape.getVertex(3, test3);
            gl.glPushMatrix();
            gl.glTranslatef(-30, 0, -100);
            gl.glRotatef(rotate, 1, 1, 1);
            
//            gl.glTranslatef(trans.origin.x-10, trans.origin.y, trans.origin.z-100);
//            gl.glRotatef((float)angles[0]*(float)(180/Math.PI), 1, 0, 0);
//            gl.glRotatef((float)angles[1]*(float)(180/Math.PI), 0, 1, 0);
//            gl.glRotatef((float)angles[2]*(float)(180/Math.PI), 0, 0, 1);
            
            gl.glBegin(GL.GL_LINES);
            
            
            gl.glColor3f(0, 255, 0);
            
            gl.glVertex3f(test.x,test.y,test.z);
            gl.glVertex3f(test1.x,test1.y,test1.z);
            
            gl.glVertex3f(test.x,test.y,test.z);
            gl.glVertex3f(test2.x,test2.y,test2.z);
            
            gl.glVertex3f(test.x,test.y,test.z);
            gl.glVertex3f(test3.x,test3.y,test3.z);
            
            gl.glVertex3f(test1.x,test1.y,test1.z);
            gl.glVertex3f(test2.x,test2.y,test2.z);
            
            gl.glVertex3f(test1.x,test1.y,test1.z);
            gl.glVertex3f(test3.x,test3.y,test3.z);
            
            gl.glVertex3f(test2.x,test2.y,test2.z);
            gl.glVertex3f(test3.x,test3.y,test3.z);
            
            
            gl.glEnd();
            gl.glPopMatrix();
            
        }
        
        
        gl.glPushMatrix();
        gl.glTranslatef(-30, 0, -100);
        gl.glRotatef(rotate, 1, 1, 1);
        Iterator voronoi_iter1 = voronoi_vertices.keySet().iterator();
        
        
        while(voronoi_iter1.hasNext()){
            
            ArrayList adjacents = (ArrayList)voronoi_vertices.get(voronoi_iter1.next());
            
            Point_3 v = (Point_3)adjacents.get(0);
            gl.glPointSize(3.0f);
            gl.glBegin(GL.GL_POINTS);
            gl.glColor3f(255, 0, 0);
            gl.glVertex3d(v.x(), v.y(), v.z());
        }
            
        
        gl.glEnd();
        //outer cube
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0, 0, 255);
            
        gl.glVertex3d(0.0,0.0,0.0);
        gl.glVertex3d(0.0,0.0,20.0);
            
        gl.glVertex3d(0.0,0.0,0.0);
        gl.glVertex3d(0.0,20.0,0.0);
            
        gl.glVertex3d(0.0,0.0,0.0);
        gl.glVertex3d(20.0,0.0,0.0);
            
        gl.glVertex3d(20.0,0.0,0.0);
        gl.glVertex3d(20.0,0.0,20.0);
            
        gl.glVertex3d(20.0,0.0,0.0);
        gl.glVertex3d(20.0,20.0,0.0);

        gl.glVertex3d(20.0,20.0,20.0);
        gl.glVertex3d(20.0,0.0,20.0);

        gl.glVertex3d(20.0,20.0,20.0);
        gl.glVertex3d(20.0,20.0,0.0);

        gl.glVertex3d(20.0,20.0,20.0);
        gl.glVertex3d(0.0,20.0,20.0);

        gl.glVertex3d(0.0,20.0,20.0);
        gl.glVertex3d(0.0,0.0,20.0);

        gl.glVertex3d(0.0,20.0,20.0);
        gl.glVertex3d(0.0,20.0,0.0);

        gl.glVertex3d(20.0,0.0,20.0);
        gl.glVertex3d(0.0,0.0,20.0);

        gl.glVertex3d(20.0,0.0,20.0);
        gl.glVertex3d(0.0,0.0,20.0);

        gl.glVertex3d(20.0,20.0,0.0);
        gl.glVertex3d(0.0,20.0,0.0);
        
        gl.glEnd();
        gl.glPopMatrix();
     }
//     
     
     
     public void drawVoronoi(GL gl, float rotate){
         
        
        
        

        gl.glPushMatrix();
        
        
        
        Iterator voronoiC_iter = voronoi_cells.keySet().iterator();
//        while(voronoiC_iter.hasNext()){
            gl.glTranslatef(10,-10 , -100);
            gl.glRotatef(rotate, 1, 1, 1);
            ArrayList points = (ArrayList)voronoi_cells.get(20);
            
            
            
            gl.glColor3f(0,0,255);
            gl.glBegin(GL.GL_LINES);
            for(int i=0;i<points.size();i++){
            Point_3 point1 = (Point_3)points.get(i);
            for(int in_i=0;in_i<points.size();in_i++){
                Point_3 point2 = (Point_3)points.get(in_i);
                gl.glVertex3d(point1.x(), point1.y(), point1.z());
                gl.glVertex3d(point2.x(), point2.y(), point2.z());
                
            }
            
        }
//        }
        
        
        
        
        Iterator voronoi_iter2 = voronoi_vertices.keySet().iterator();
        while(voronoi_iter2.hasNext()){
            
            ArrayList adjacents = (ArrayList)voronoi_vertices.get(voronoi_iter2.next());
            Point_3 v = (Point_3)adjacents.get(0);
            gl.glTranslatef(10,-10 , -100);
            gl.glRotatef(rotate, 1, 1, 1);
            gl.glBegin(GL.GL_LINES);
            a1 = (Point_3)adjacents.get(1);
            gl.glColor3f(255, 0, 0);
            
            gl.glVertex3d(v.x(), v.y(), v.z());
            gl.glVertex3d(a1.x(), a1.y(), a1.z());
            
            
            if(adjacents.size()>2){
                a2 = (Point_3)adjacents.get(2);
                gl.glVertex3d(v.x(), v.y(), v.z());
                gl.glVertex3d(a2.x(), a2.y(), a2.z());
                
                
            }
             if(adjacents.size()>3){
                a3 = (Point_3)adjacents.get(3);
                gl.glVertex3d(v.x(), v.y(), v.z());
                gl.glVertex3d(a3.x(), a3.y(), a3.z());
                
            }
             if(adjacents.size()>4){
                a4 = (Point_3)adjacents.get(4);
                gl.glVertex3d(v.x(), v.y(), v.z());
                gl.glVertex3d(a4.x(), a4.y(), a4.z());
                
            }
        }
            //outer cube
        gl.glBegin(GL.GL_LINES);
            gl.glColor3f(0, 0, 255);
            
            gl.glVertex3d(0.0,0.0,0.0);
            gl.glVertex3d(0.0,0.0,20.0);
            
            gl.glVertex3d(0.0,0.0,0.0);
            gl.glVertex3d(0.0,20.0,0.0);
            
            gl.glVertex3d(0.0,0.0,0.0);
            gl.glVertex3d(20.0,0.0,0.0);
            
            gl.glVertex3d(20.0,0.0,0.0);
            gl.glVertex3d(20.0,0.0,20.0);
            
            gl.glVertex3d(20.0,0.0,0.0);
            gl.glVertex3d(20.0,20.0,0.0);
            
            gl.glVertex3d(20.0,20.0,20.0);
            gl.glVertex3d(20.0,0.0,20.0);
            
            gl.glVertex3d(20.0,20.0,20.0);
            gl.glVertex3d(20.0,20.0,0.0);
            
            gl.glVertex3d(20.0,20.0,20.0);
            gl.glVertex3d(0.0,20.0,20.0);
            
            gl.glVertex3d(0.0,20.0,20.0);
            gl.glVertex3d(0.0,0.0,20.0);
            
            gl.glVertex3d(0.0,20.0,20.0);
            gl.glVertex3d(0.0,20.0,0.0);
            
            gl.glVertex3d(20.0,0.0,20.0);
            gl.glVertex3d(0.0,0.0,20.0);
            
            gl.glVertex3d(20.0,0.0,20.0);
            gl.glVertex3d(0.0,0.0,20.0);
            
            gl.glVertex3d(20.0,20.0,0.0);
            gl.glVertex3d(0.0,20.0,0.0);
            
//        }
        
        
        gl.glEnd();
        
        
//        draws delaunay triangulation vertices
        for(int p=0;p<input_points.size();p++){
            
            Point_3 v_point = (Point_3)input_points.get(p);
            gl.glPointSize(3.0f);
            gl.glBegin(GL.GL_POINTS);
            gl.glColor3f(0, 255, 0);
            gl.glVertex3d(v_point.x(), v_point.y(), v_point.z());
        }
        
        
        gl.glEnd();
        
        
        gl.glPopMatrix();
     }
}