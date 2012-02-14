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
import CGAL.Kernel.Triangle_3;
import CGAL.Polyhedron_3.Polyhedron_3;
import CGAL.Polyhedron_3.Polyhedron_3_Modifier_triangular_facets;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Cell_handle;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Facet;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Vertex_handle;
import com.bulletphysics.collision.shapes.ConvexHullShape;
import com.bulletphysics.util.ObjectArrayList;
import com.sun.opengl.util.GLUT;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.math.geometry.Rotation;
import javax.vecmath.*;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.math.geometry.RotationOrder;


public class Delaunay {
    
    private LinkedList<Point_3> input_points=new LinkedList<Point_3>();
    public static ArrayList delaunay_cells = new ArrayList();
    public static ArrayList voronoi_cells = new ArrayList();
    public ArrayList voronoi_points = new ArrayList();
    public ArrayList outer_intersection = new ArrayList();
    public ArrayList points = new ArrayList();
    public ArrayList outer_adjacents = new ArrayList();
    private Delaunay_triangulation_3 dt;
    public ArrayList final_voronoi = new ArrayList();
    public double[] angles;
    public boolean hit = true;
    public ArrayList infinite_cells = new ArrayList();
    public float3 center;
    
    
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
        
        
//        
        
        HashMap boulder_hull = new HashMap();
        
        ArrayList all_voronoi = new ArrayList();
        Delaunay_triangulation_3_All_vertices_iterator verts = dt.all_vertices();
             while(verts.hasNext()){
                 
                 Delaunay_triangulation_3_Vertex_handle delaunayP = verts.next();
                 
                 Delaunay_triangulation_3_Finite_cells_iterator cells1 = dt.finite_cells();

                 
                 
                 ArrayList voronoi_cell = new ArrayList();
                 ArrayList final_cell = new ArrayList();
                 ArrayList on_plane = new ArrayList();
                 float threshold = 20;
                 
                 ArrayList cell_intersects = new ArrayList();
                 while(cells1.hasNext()){

                    Delaunay_triangulation_3_Cell_handle delaunayC = cells1.next();

                     if(delaunayC.has_vertex(delaunayP)){
                         Point_3 vcell = dt.dual(delaunayC);
                         
                        
                        
                                
                                voronoi_cell.add(vcell);
                                if(dt_bounds.isClose(vcell)){
                                    
                                    
                                    for(int ini=0;ini<4;ini++){
                                        Delaunay_triangulation_3_Cell_handle ch = delaunayC.neighbor(ini);
                                        Point_3 adj = dt.dual(ch);
                                        
                                        if(!dt_bounds.isClose(adj)){
                                            
                                            Point_3 out_adjacent = dt_bounds.intersects(vcell, adj);
//                                            
                                            outer_adjacents.add(adj);
                                            
                                            
                                            outer_intersection.add(out_adjacent);
                                            
                                        }
                                    
                                    
                                    

                                    }
                                }
                                
                            





                     }
                 }
                 float3 centroid = new float3();
                 for(int i =0;i<voronoi_cell.size();i++){
                     Point_3 cellp = (Point_3)voronoi_cell.get(i);
                     for(int ini = 0;ini<outer_adjacents.size();ini++){
                         Point_3 outp = (Point_3)outer_adjacents.get(ini);
                         if(outp.equals(cellp)){
                             cellp = (Point_3)outer_intersection.get(ini);
                             String s = cellp.toString();
                             
                             String sh = DigestUtils.md5Hex(s);
                             boulder_hull.put(sh, cellp);
                             on_plane.add(cellp);
                             
                             
                         }
                     }
                     if(dt_bounds.isClose(cellp)){
                        
                        
                            
                            final_cell.add(cellp);
                            
                            centroid.x+=cellp.x();centroid.y+=cellp.y();centroid.z+=cellp.z();
                        
                     }
                 }
                if(final_cell.size()>5){       //if delaunay cell is infinite create cell with centroid of finite facet and three neighboring voronoi
                    
                    all_voronoi.addAll(final_cell);
                    centroid.x=centroid.x/final_cell.size();
                    centroid.y=centroid.y/final_cell.size();
                    centroid.z=centroid.z/final_cell.size();
                     Iterator final_iter = final_cell.iterator();
                     Delaunay_triangulation_3 vcell = new Delaunay_triangulation_3();
                     boolean edge_case = false;
                     vcell.insert(final_iter);
                     ArrayList triangles = new ArrayList();
                     Delaunay_triangulation_3_All_cells_iterator iter = vcell.all_cells();
                     while(iter.hasNext()){
                         Delaunay_triangulation_3_Cell_handle dc = iter.next();
                         if(vcell.is_infinite(dc)){
                             ArrayList triangle = new ArrayList();
//                             
                             for(int i = 0;i<4;i++){
                                 
                                 Delaunay_triangulation_3_Vertex_handle vh = dc.vertex(i);
                                 if(vcell.is_infinite(vh)){
                                     Triangle_3 test = vcell.triangle(dc, i);
                                     for(int ini = 0;ini<3;ini++){
                                         Point_3 p = test.vertex(ini);
                                         float3 pf = new float3((float)p.x(),(float)p.y(),(float)p.z());
                                         float3 end = float3.Subtract(pf, centroid);
                                         Point_3 endp = new Point_3(end.x,end.y,end.z);
                                         triangle.add(endp);
                                     }
                                     
                                     
                                     
                                     
                                     
                                     
                                 }
                             }
                             if(triangle.size()==3){
                                 triangles.add(triangle);
//                                 
                             }
                         }
                     }
                     
                     outer_adjacents.clear();
                     outer_intersection.clear();
                     HashMap cell = new HashMap();
                     
                     cell.put("vertices", final_cell);
                     
                     
                     cell.put("triangles", triangles);
//                    
                     
                     voronoi_cells.add(cell);
                }
                    
             }          
                    
             for(int i = 0;i<corners.size();i++){
                 float3 cornerf = (float3)corners.get(i);
                 Point_3 corner = new Point_3(cornerf.x,cornerf.y,cornerf.z);
                 String s = corner.toString();
                 String md5 = DigestUtils.md5Hex(s);
                 boulder_hull.put(md5, corner);
             }
             
             
             ArrayList vertices = new ArrayList();
             
             Iterator iter3 = boulder_hull.keySet().iterator();
             Triangulation_3 test = new Triangulation_3();
             ArrayList triangles = new ArrayList();
             HashMap outer_hull = new HashMap();
             
             while(iter3.hasNext()){
                 Point_3 point = (Point_3)boulder_hull.get(iter3.next());
                 
                 
                     if(point.x()>10){
                     test.insert(point);
                     
                     vertices.add(point);}
                 
             }
             
             Triangulation_3_All_cells_iterator all_iter = test.all_cells();
             while(all_iter.hasNext()){
                 Triangulation_3_Cell_handle t = all_iter.next();
                 if(test.is_infinite(t)){
                     ArrayList triangle = new ArrayList();
                     for(int i=0;i<4;i++){
                         Triangulation_3_Vertex_handle v = t.vertex(i);
                         if(!test.is_infinite(v)){
                             Point_3 p = v.point();
                             
                             
                             triangle.add(p);
                         }
                     }
                     if(triangle.size()==3){
                     triangles.add(triangle);}
                     
                 }
             }
             outer_hull.put("triangles", triangles);
             outer_hull.put("vertices", vertices);
//             voronoi_cells.add(outer_hull);
                     
             
             
             
             
             
                



         

         
             
         
             
    
    
        
    
    }
     public void drawVoronoiCells(GL gl,float rotate, boolean debug){
         
         
         gl.glPushMatrix();
         gl.glTranslatef(0, 20, -200);
         gl.glRotatef(rotate, 1, 1, 1);
         
         
        GLUT glut = new GLUT();
        gl.glPushMatrix();
        gl.glTranslatef(10, 10, 10);
        
        glut.glutWireCube(20);
        gl.glPopMatrix();
        Iterator cell_iter = Physics.renderVoronoi.iterator();
        int t = 0;
//        
        
        while(cell_iter.hasNext()){
            HashMap c = (HashMap)cell_iter.next();

            ArrayList tris = (ArrayList)c.get("triangles");
            
            

            Transform trans = new Transform();
            RigidBody tri = (RigidBody)Physics.polyhedrons.get(t);t++;
            
            

            
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


            
            gl.glTranslatef(trans.origin.x, trans.origin.y, trans.origin.z);
            
            gl.glRotatef((float)angles[0]*(float)(180/Math.PI), 1, 0, 0);
            gl.glRotatef((float)angles[1]*(float)(180/Math.PI), 0, 1, 0);
            gl.glRotatef((float)angles[2]*(float)(180/Math.PI), 0, 0, 1);
            gl.glBegin(GL.GL_TRIANGLES);
            
            for(int i=0;i<tris.size();i++){
                ArrayList triangle = (ArrayList)tris.get(i);
                float3 centroid = new float3();
                
                Point_3 vertex1 = (Point_3)triangle.get(0);
                Point_3 vertex2 = (Point_3)triangle.get(1);
                Point_3 vertex3 = (Point_3)triangle.get(2);
                
                float3 vertexf1 = new float3((float)(vertex1.x()),(float)(vertex1.y()),(float)(vertex1.z()));
                float3 vertexf2 = new float3((float)(vertex2.x()),(float)(vertex2.y()),(float)(vertex2.z()));
                float3 vertexf3 = new float3((float)(vertex3.x()),(float)(vertex3.y()),(float)(vertex3.z()));
                
                centroid.x = (vertexf1.x+vertexf2.x+vertexf3.x)/3;
                centroid.y = (vertexf1.y+vertexf2.y+vertexf3.y)/3;
                centroid.z = (vertexf1.z+vertexf2.z+vertexf3.z)/3;
                
                float3 n = float3.Subtract(vertexf2, vertexf1);
                float3 n1 = float3.Subtract(vertexf3, vertexf1);
                float3 normal = float3.Cross(n, n1);
                

                normal.normalize();
                gl.glNormal3f(normal.x, normal.y, normal.z);
                gl.glVertex3f(vertexf1.x, vertexf1.y, vertexf1.z);
                
                gl.glVertex3f(vertexf2.x, vertexf2.y, vertexf2.z);
                
                gl.glVertex3f(vertexf3.x, vertexf3.y, vertexf3.z);
                
                
                
            }
            
            
            

            
            
            gl.glEnd();
            gl.glPopMatrix();
            
        }
        
        gl.glPopMatrix(); 
        
        

     }
//     
     
     
     
}