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
import CGAL.Polyhedron_3.Polyhedron_3;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Cell_handle;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Facet;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Vertex_handle;
import com.bulletphysics.collision.shapes.ConvexHullShape;
import com.bulletphysics.util.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.math.geometry.Rotation;
import javax.vecmath.*;

import org.apache.commons.math.geometry.RotationOrder;


public class Delaunay {
    
    private LinkedList<Point_3> input_points=new LinkedList<Point_3>();
    public ArrayList cell_vertices = new ArrayList();
    public static ArrayList voronoi_cells = new ArrayList();
    public ArrayList voronoi_points = new ArrayList();
    public ArrayList outer_intersection = new ArrayList();
    public ArrayList points = new ArrayList();
    public ArrayList outer_adjacents = new ArrayList();
    private Delaunay_triangulation_3 dt;
    
    public double[] angles;
    public boolean hit = true;
    
    
    
    private float dt_size;
    private BoundingBox dt_bounds;
    private HashMap planes;
    
    
    public float3 dt_origin;
    
    public static int display_cell = 0;
    
    
    
    public Delaunay(int num_points,float size) throws Exception{   
        dt_size = size;
        ArrayList save_points = new ArrayList();
        //create triangulation from random points within a bounding cube
        dt = new Delaunay_triangulation_3();
        dt_origin = new float3(0.0f,0.0f,0.0f);
        dt_bounds = new BoundingBox(dt_size,dt_origin);
        dt_bounds.setPlanes();
        planes = dt_bounds.getPlanes();
        
        
        for(int i = 0;i<num_points;i++){
            
            double x = (Math.random()*1000)%(dt_size);
            double y = (Math.random()*1000)%(dt_size);
            double z = (Math.random()*1000)%(dt_size);
            input_points.add(new Point_3(x,y,z));
//            save_points.add(new Point3d(x,y,z));
        }
        ArrayList corners = dt_bounds.getCorners();
        for(int i = 0;i<corners.size();i++){
            float3 cornerf = (float3)corners.get(i);
            Point_3 corner = new Point_3(cornerf.x,cornerf.y,cornerf.z);
            input_points.add(corner);
//            save_points.add(new Point3d(corner.x(),corner.y(),corner.z()));
        }
        
//        DelaunayPoints dt_points = new DelaunayPoints(save_points);
//        dt_points.saveArray(save_points, "points.txt");
//        save_points = dt_points.loadArray("points.txt");
//        for(int i = 0;i<save_points.size();i++){
//            Point3d p = (Point3d)save_points.get(i);
//            Point_3 p1 = new Point_3(p.x,p.y,p.z);
//            input_points.add(p1);
//        }
        
        
        dt.insert(input_points.iterator());
        
        
        Delaunay_triangulation_3_All_cells_iterator cells = dt.all_cells();
        
        //gets the vertices of each delaunay cell
        while(cells.hasNext()){
            
            Delaunay_triangulation_3_Cell_handle ch = cells.next();
            
            ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
            
            
            for(int k=0;k<4;k++){
                
                Delaunay_triangulation_3_Vertex_handle v = ch.vertex(k);
                Point_3 vertex = v.point();
                Vector3f V1 = new Vector3f((float)vertex.x(),(float)vertex.y(),(float)vertex.z());
                vertices.add(V1);
            }
            
            
            if(!dt.is_infinite(ch)) {
                
                cell_vertices.add(vertices);
                
                //gets voronoi dual  of each cell
                Point_3 circ = dt.dual(ch);
                float3 circf = new float3((float)circ.x(),(float)circ.y(),(float)circ.z());
                //checks voronoi dual against bounding cube
                if(dt_bounds.isWithin(circ)){
                    
                    //list of all valid voronoi duals
                    voronoi_points.add(circ);
                    //finds adjacent duals from neighbors of delaunay cells
                    for(int i=0;i<4;i++){
                        ArrayList outers = new ArrayList(); 
                        Delaunay_triangulation_3_Cell_handle neigh = ch.neighbor(i);
                        
                        //adjacent dual
                        Point_3 v_neigh = dt.dual(neigh);
                        voronoi_points.add(v_neigh);
                        
                           
                    } 
                }
            }
        }   
        
        
        
        
        Delaunay_triangulation_3_All_vertices_iterator verts = dt.all_vertices();
             while(verts.hasNext()){
                 
                 Delaunay_triangulation_3_Vertex_handle delaunayP = verts.next();
                 
                 Delaunay_triangulation_3_Finite_cells_iterator cells1 = dt.finite_cells();

                 
                 
                 ArrayList voronoi_cell = new ArrayList();
                 ArrayList final_cell = new ArrayList();
                 ArrayList on_plane = new ArrayList();
                 
                 ArrayList voronoi_adjacents = new ArrayList();
                 ArrayList cell_intersects = new ArrayList();
                 while(cells1.hasNext()){

                    Delaunay_triangulation_3_Cell_handle delaunayC = cells1.next();

                     if(delaunayC.has_vertex(delaunayP)){
                         Point_3 vcell = dt.dual(delaunayC);
                         
                        ArrayList v_adjacents = new ArrayList();
                        for(int i = 0;i<voronoi_points.size();i++){
                            Point_3 test = (Point_3)voronoi_points.get(i); 
                            float3 vcellf = new float3((float)vcell.x(),(float)vcell.y(),(float)vcell.z());
                            if(test.equals(vcell)){
                                
                                voronoi_cell.add(vcell);
                                if(dt_bounds.isClose(vcell)){
                                    v_adjacents.add(vcell);
                                    for(int ini=0;ini<4;ini++){
                                        Delaunay_triangulation_3_Cell_handle ch = delaunayC.neighbor(ini);
                                        Point_3 adj = dt.dual(ch);
                                        
                                        if(!dt_bounds.isClose(adj)){
                                            Point_3 out_adjacent = dt_bounds.intersects(vcell, adj);
                                            outer_adjacents.add(adj);
                                            
                                            
                                            outer_intersection.add(out_adjacent);
                                        }
                                    
                                    
                                    

                                    }
                                }
                                
                             break;
                             }
                        }      





                     }
                 }
                 for(int i =0;i<voronoi_cell.size();i++){
                     Point_3 cellp = (Point_3)voronoi_cell.get(i);
                     for(int ini = 0;ini<outer_adjacents.size();ini++){
                         Point_3 outp = (Point_3)outer_adjacents.get(ini);
                         if(outp.equals(cellp)){
                             cellp = (Point_3)outer_intersection.get(ini);
                             
                             on_plane.add(cellp);
                             
                             
                         }
                     }
                     if(dt_bounds.isClose(cellp)){
                        final_cell.add(cellp);
                     }
                 }
                if(final_cell.size()>4){
                    float3 centroid = new float3();
                    for(int i = 0;i<final_cell.size();i++){
                        Point_3 temp = (Point_3)final_cell.get(i);
                
                        centroid.x+=temp.x();centroid.y+=temp.y();centroid.z+=temp.z();
                
                    }
                    centroid.x=centroid.x/final_cell.size();
                    centroid.y=centroid.y/final_cell.size();
                    centroid.z=centroid.z/final_cell.size();
                     Iterator final_iter = final_cell.iterator();
                     Delaunay_triangulation_3 vcell = new Delaunay_triangulation_3();
                     vcell.insert(final_iter);
                     ArrayList triangles = new ArrayList();
                     Delaunay_triangulation_3_All_cells_iterator iter = vcell.all_cells();
                     while(iter.hasNext()){
                         Delaunay_triangulation_3_Cell_handle dc = iter.next();
                         if(vcell.is_infinite(dc)){
                             ArrayList triangle = new ArrayList();
                             for(int i = 0;i<4;i++){
                                 
                                 Delaunay_triangulation_3_Vertex_handle vh = dc.vertex(i);
                                 if(!vcell.is_infinite(vh)){
                                     Point_3 p = vh.point();
                                     float3 pf = new float3((float)p.x(),(float)p.y(),(float)p.z());
                                     float3 end = float3.Subtract(pf, centroid);
                                     Point_3 endp = new Point_3(end.x,end.y,end.z);
                                     triangle.add(endp);
                                 }
                             }
                             if(triangle.size()==3){
                             triangles.add(triangle);}
                         }
                     }
                     
                     outer_adjacents.clear();
                     outer_intersection.clear();
                     HashMap cell = new HashMap();
                     
                     cell.put("vertices", final_cell);
                     cell.put("edge_points", on_plane);
                     
                     cell.put("triangles", triangles);
//                    
                     cell.put("intersections", cell_intersects);
                     voronoi_cells.add(cell);
                }



         }
             
             
    }
    
        
    
    
     public void drawDelaunay(GL gl,float rotate){
         
        Vector3f force = new Vector3f(0.0f,50.0f,0.0f);
        Iterator cell_iter = voronoi_cells.iterator();
        int t = 0;
        
        
        while(cell_iter.hasNext()){
            HashMap c = (HashMap)cell_iter.next();
//            HashMap c = (HashMap)voronoi_cells.get(10);
            ArrayList tris = (ArrayList)c.get("triangles");
            
            
////            ArrayList<Vector3f> v1 = (ArrayList<Vector3f>)cell_iter.next();
            Transform trans = new Transform();
            RigidBody tri = (RigidBody)Physics.tetrahedrons.get(t);t++;
            
            
//            if(hit){
//                tri.applyImpulse(force,force);
//            }
//            
//            
//            if(t>Physics.tetrahedrons.size()-1){
//                hit = false;
//            }
            
            
            MotionState ms = tri.getMotionState();
            trans = ms.getWorldTransform(trans);
            Quat4f quat = new Quat4f();
            float[] floats = new float[16];
            trans.getOpenGLMatrix(floats);
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
         
         
         
            
            
            
            gl.glPushMatrix();
//            gl.glLoadMatrixf(floats, 4);
//            gl.glTranslatef(-30, 0, -100);
//            gl.glRotatef(rotate, 1, 1, 1);
            
            gl.glTranslatef(trans.origin.x, trans.origin.y, trans.origin.z-200);
            gl.glRotatef((float)angles[0]*(float)(180/Math.PI), 1, 0, 0);
            gl.glRotatef((float)angles[1]*(float)(180/Math.PI), 0, 1, 0);
            gl.glRotatef((float)angles[2]*(float)(180/Math.PI), 0, 0, 1);
            
            for(int i=0;i<tris.size();i++){
                ArrayList triangle = (ArrayList)tris.get(i);
                Point_3 v = (Point_3)triangle.get(0);
                Point_3 v1 = (Point_3)triangle.get(1);
                Point_3 v2 = (Point_3)triangle.get(2);
                float3 x = new float3((float)(v.x()),(float)(v.y()),(float)(v.z()));
                float3 x1 = new float3((float)(v1.x()),(float)(v1.y()),(float)(v1.z()));
                float3 x2 = new float3((float)(v2.x()),(float)(v2.y()),(float)(v2.z()));
                float3 n = float3.Subtract(x, x1);
                float3 n1 = float3.Subtract(x, x2);
                float3 normal = float3.Cross(n, n1);
                normal.normalize();
                gl.glNormal3f(normal.x, normal.y, normal.z);
                gl.glBegin(GL.GL_TRIANGLES);
                gl.glVertex3d(v.x(), v.y(), v.z());
                gl.glVertex3d(v1.x(), v1.y(), v1.z());
                gl.glVertex3d(v2.x(), v2.y(), v2.z());
                
            }
            
            
            
//            gl.glColor3f(0, 255, 0);
            
            
            gl.glEnd();
            gl.glPopMatrix();
            
        }
        
        
//        gl.glPushMatrix();
//        gl.glTranslatef(-30, 0, -100);
//        gl.glRotatef(rotate, 1, 1, 1);
        
            
        
        
        //outer cube
//        gl.glBegin(GL.GL_LINES);
//        gl.glColor3f(0, 0, 255);
//            
//        gl.glVertex3d(0.0,0.0,0.0);
//        gl.glVertex3d(0.0,0.0,20.0);
//            
//        gl.glVertex3d(0.0,0.0,0.0);
//        gl.glVertex3d(0.0,20.0,0.0);
//            
//        gl.glVertex3d(0.0,0.0,0.0);
//        gl.glVertex3d(20.0,0.0,0.0);
//            
//        gl.glVertex3d(20.0,0.0,0.0);
//        gl.glVertex3d(20.0,0.0,20.0);
//            
//        gl.glVertex3d(20.0,0.0,0.0);
//        gl.glVertex3d(20.0,20.0,0.0);
//
//        gl.glVertex3d(20.0,20.0,20.0);
//        gl.glVertex3d(20.0,0.0,20.0);
//
//        gl.glVertex3d(20.0,20.0,20.0);
//        gl.glVertex3d(20.0,20.0,0.0);
//
//        gl.glVertex3d(20.0,20.0,20.0);
//        gl.glVertex3d(0.0,20.0,20.0);
//
//        gl.glVertex3d(0.0,20.0,20.0);
//        gl.glVertex3d(0.0,0.0,20.0);
//
//        gl.glVertex3d(0.0,20.0,20.0);
//        gl.glVertex3d(0.0,20.0,0.0);
//
//        gl.glVertex3d(20.0,0.0,20.0);
//        gl.glVertex3d(0.0,0.0,20.0);
//
//        gl.glVertex3d(20.0,0.0,20.0);
//        gl.glVertex3d(0.0,0.0,20.0);
//
//        gl.glVertex3d(20.0,20.0,0.0);
//        gl.glVertex3d(0.0,20.0,0.0);
//        
//        gl.glEnd();
//        gl.glPopMatrix();
     }
//     
     
     
     public void drawVoronoi(GL gl, float rotate){
         
        
        
        

        gl.glPushMatrix();
        
        
        

        
        
        
        
//        Iterator voronoi_iter2 = voronoi_cells.iterator();
//        while(voronoi_iter2.hasNext()){
//            HashMap cell = (HashMap)voronoi_iter2.next();
            HashMap cell = (HashMap)voronoi_cells.get(display_cell);
//            ArrayList vertices = (ArrayList)cell.get("adjacents");
            ArrayList vertices = (ArrayList)cell.get("triangles");
            Iterator a_iter = vertices.iterator();
//            ArrayList adjacents = (ArrayList)voronoi_iter2.next();
//            Iterator a_iter = adjacents.iterator();
            while(a_iter.hasNext()){
                ArrayList adjacents = (ArrayList)a_iter.next();
                if(!adjacents.isEmpty()){
//                    Point_3 v = (Point_3)adjacents.get(0);
                    gl.glTranslatef(-10,-10 , -100);
                    gl.glRotatef(rotate, 1, 1, 1);
//                    gl.glBegin(GL.GL_LINES);
                    gl.glBegin(GL.GL_TRIANGLES);

                    gl.glColor3f(255, 0, 0);
                    Point_3 v = (Point_3)adjacents.get(0);
                    Point_3 v1 = (Point_3)adjacents.get(1);
                    Point_3 v2 = (Point_3)adjacents.get(2);
                    float3 x = new float3((float)(v.x()),(float)(v.y()),(float)(v.z()));
                    float3 x1 = new float3((float)(v1.x()),(float)(v1.y()),(float)(v1.z()));
                    float3 x2 = new float3((float)(v2.x()),(float)(v2.y()),(float)(v2.z()));
                    float3 n = float3.Subtract(x, x1);
                    float3 n1 = float3.Subtract(x, x2);
                    float3 normal = float3.Cross(n, n1);
                    normal.normalize();
                    gl.glNormal3f(normal.x, normal.y, normal.z);
                    gl.glVertex3d(v.x(), v.y(), v.z());
                    gl.glVertex3d(v1.x(), v1.y(), v1.z());
                    gl.glVertex3d(v2.x(), v2.y(), v2.z());
//                    for(int i = 0;i<adjacents.size();i++){
//                        Point_3 adj = (Point_3)adjacents.get(i);
//                        gl.glVertex3d(v.x(), v.y(), v.z());
//                        gl.glVertex3d(adj.x(), adj.y(), adj.z());
//                    }
                }
//            }
            }
            gl.glEnd();
            //outer cube
        gl.glBegin(GL.GL_LINES);
            gl.glColor3f(0, 0, 255);
            
            gl.glVertex3d(dt_origin.x,dt_origin.y,dt_origin.z);
            gl.glVertex3d(dt_origin.x,dt_origin.y,dt_origin.z+dt_size);
            
            gl.glVertex3d(dt_origin.x,dt_origin.y,dt_origin.z);
            gl.glVertex3d(dt_origin.x,dt_origin.y+dt_size,dt_origin.z);
            
            gl.glVertex3d(dt_origin.x,dt_origin.y,dt_origin.z);
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y,dt_origin.z);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y,dt_origin.z);
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y,dt_origin.z+dt_size);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y,dt_origin.z);
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y+dt_size,dt_origin.z);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y+dt_size,dt_origin.z+dt_size);
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y,dt_origin.z+dt_size);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y+dt_size,dt_origin.z+dt_size);
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y+dt_size,dt_origin.z);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y+dt_size,dt_origin.z+dt_size);
            gl.glVertex3d(dt_origin.x,dt_origin.y+dt_size,dt_origin.z+dt_size);
            
            gl.glVertex3d(dt_origin.x,dt_origin.y+dt_size,dt_origin.z+dt_size);
            gl.glVertex3d(dt_origin.x,dt_origin.y,dt_origin.z+dt_size);
            
            gl.glVertex3d(dt_origin.x,dt_origin.y+dt_size,dt_origin.z+dt_size);
            gl.glVertex3d(dt_origin.x,dt_origin.y+dt_size,dt_origin.z);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y,dt_origin.z+dt_size);
            gl.glVertex3d(dt_origin.x,dt_origin.y,dt_origin.z+dt_size);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y,dt_origin.z+dt_size);
            gl.glVertex3d(dt_origin.x,dt_origin.y,dt_origin.z+dt_size);
            
            gl.glVertex3d(dt_origin.x+dt_size,dt_origin.y+dt_size,dt_origin.z);
            gl.glVertex3d(dt_origin.x,dt_origin.y+dt_size,dt_origin.z);
            
//        }
        
        
        gl.glEnd();
        
        
//        draws delaunay triangulation vertices
//        HashMap cell1 =(HashMap)voronoi_cells.get(display_cell);
//        ArrayList voronoi = (ArrayList)cell1.get("intersections");
//        for(int p=0;p<voronoi.size();p++){
//            
//            Point_3 v_point = (Point_3)voronoi.get(p);
//            gl.glPointSize(5.0f);
//            gl.glBegin(GL.GL_POINTS);
//            gl.glColor3f(0, 255, 0);
//            gl.glVertex3d(v_point.x(), v_point.y(), v_point.z());
//        }
//        ArrayList test = (ArrayList)cell1.get("vertices");
//        for(int i = 0;i<test.size();i++){
//           Point_3 point = (Point_3)test.get(i);
//            gl.glPointSize(5.0f);
//            gl.glBegin(GL.GL_POINTS);
//            gl.glColor3f(0, 0, 255);
//            gl.glVertex3d(point.x(), point.y(), point.z()); 
//        }
//        gl.glEnd();
        
        
        gl.glPopMatrix();
     }
}