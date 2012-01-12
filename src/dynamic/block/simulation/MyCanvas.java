/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.block.simulation;

/**
 *
 * @author trblair
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
import javax.media.opengl.*;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.GLCanvas;
import com.sun.opengl.util.FPSAnimator;
import com.sun.opengl.util.GLUT;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import com.bulletphysics.collision.broadphase.*;
import com.bulletphysics.collision.dispatch.*;
import com.bulletphysics.collision.shapes.*;
import com.bulletphysics.dynamics.*;
import com.bulletphysics.dynamics.constraintsolver.SequentialImpulseConstraintSolver;
import com.bulletphysics.linearmath.*;
import com.bulletphysics.linearmath.Transform;
import CGAL.Triangulation_3.*;
import CGAL.*;
import CGAL.Voronoi.CGAL_Voronoi;
import CGAL.Voronoi.CGAL_VoronoiJNI;
import CGAL.Kernel.Point_3;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Cell_handle;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Vertex_handle;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.math.geometry.Rotation;
import javax.vecmath.*;
import org.apache.commons.math.geometry.RotationOrder;




public class MyCanvas extends GLCanvas implements GLEventListener {
    private static int screenW = 800;
    private static int screenH = 600;
    public LinkedList<Point_3> input_points=new LinkedList<Point_3>();
    public float rotate = 0.0f;
    public int size = 10;
    public static DynamicsWorld dynamicWorld = null;
    public static RigidBody cube,ground;
    public double[] angles;
    public HashMap cell_vertices = new HashMap();
    public HashMap voronoi_vertices = new HashMap();
    
    public MyCanvas( ) {
        initPhysics();
        initWindow();
        
    }
    
    
    public void initWindow(){
        JFrame container = new JFrame("Dynamic Block");
        container.setSize(screenW ,screenH);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addGLEventListener(this);
        container.getContentPane().add(this, BorderLayout.CENTER);
        container.setResizable(false);
        container.setVisible(true);
        ArrayList cell_handles = new ArrayList();
        
        int hashStart = 0;
        
        Delaunay_triangulation_3 dt = new Delaunay_triangulation_3();
        
        for(int i = 0;i<10;i++){
            double x = (Math.random()*1000)%10;
            double y = (Math.random()*1000)%10;
            double z = (Math.random()*1000)%10;
            input_points.add(new Point_3(x,y,z));
        }
        dt.insert(new Point_3(0.0,0.0,0.0));
        dt.insert(new Point_3(10.0,0.0,0.0));
        dt.insert(new Point_3(10.0,10.0,0.0));
        dt.insert(new Point_3(0.0,10.0,0.0));
        dt.insert(new Point_3(0.0,0.0,10.0));
        dt.insert(new Point_3(0.0,10.0,10.0));
        dt.insert(new Point_3(10.0,10.0,10.0));
        dt.insert(new Point_3(10.0,0.0,10.0));
        
        dt.insert(input_points.iterator());
        Delaunay_triangulation_3_All_cells_iterator cells = dt.all_cells();
        int c = dt.number_of_cells();
        while(cells.hasNext()){
            Delaunay_triangulation_3_Cell_handle ch = cells.next();
            ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
            for(int k=0;k<4;k++){
                boolean _valid = ch.is_valid();
                Delaunay_triangulation_3_Vertex_handle v = ch.vertex(k);
                Point_3 vertex = v.point();
                Vector3f V1 = new Vector3f((float)vertex.x(),(float)vertex.y(),(float)vertex.z());
                vertices.add(V1);
                
            
            }
            
            if(!dt.is_infinite(ch)&&dt.is_valid(ch)) {
            cell_vertices.put(hashStart, vertices);
            Point_3 circ = new Point_3();
            CGAL_Voronoi.get_Voronoi(dt, ch, circ);
            ArrayList voronoi = new ArrayList();
            voronoi.add(circ);
            
                for(int i=0;i<4;i++){
                    Point_3 v_neigh = new Point_3();
                    Delaunay_triangulation_3_Cell_handle neigh = ch.neighbor(i);
                    CGAL_Voronoi.get_Voronoi(dt, neigh, v_neigh);
                    voronoi.add(v_neigh);
            }
            voronoi_vertices.put(hashStart, voronoi);
            hashStart++;
            }
            
        }    
            
            
                
                
                
                
                
                
            
            
        
        
       
       
           
    }
    public void initPhysics(){
        DefaultCollisionConfiguration collisionConfiguration = new DefaultCollisionConfiguration();
	CollisionDispatcher dispatcher = new CollisionDispatcher(collisionConfiguration);
	Vector3f worldAabbMin = new Vector3f(-10000,-10000,-10000);
	Vector3f worldAabbMax = new Vector3f(10000,10000,10000);
	AxisSweep3 overlappingPairCache = new AxisSweep3(worldAabbMin, worldAabbMax);
	SequentialImpulseConstraintSolver solver = new SequentialImpulseConstraintSolver();
        dynamicWorld = new DiscreteDynamicsWorld(dispatcher, overlappingPairCache, solver, collisionConfiguration);
	dynamicWorld.setGravity(new Vector3f(0,-10,0));
	dynamicWorld.getDispatchInfo().allowedCcdPenetration = 0f;
        CollisionShape groundShape = new StaticPlaneShape(new Vector3f(0,1,0),0);
        float groundMass = 0.0f;
        Vector3f localInertia = new Vector3f(0,0,0);
        groundShape.calculateLocalInertia(groundMass, localInertia);
        Transform groundTransform = new Transform();
	groundTransform.setIdentity();
	groundTransform.origin.set(0, -20, 0);
        DefaultMotionState groundMS = new DefaultMotionState(groundTransform);
        RigidBodyConstructionInfo ground_rbInfo = new RigidBodyConstructionInfo(groundMass, groundMS, groundShape,localInertia);
        ground = new RigidBody(ground_rbInfo);
	ground.setRestitution(0.1f);
	ground.setFriction(0.50f);
	ground.setDamping(0f, 0f);
        dynamicWorld.addRigidBody(ground);
        
        
        
        CollisionShape collisionShape = new BoxShape(new Vector3f(10.0f,10.0f,10.0f));
        float mass = 1.0f;
        
	collisionShape.calculateLocalInertia(mass, localInertia);
        Transform startTransform = new Transform();
	startTransform.setIdentity();
	startTransform.origin.set(0, 20, -70);
//        Quat4f rotation = new Quat4f(0.5f,1.0f,1.0f,0.5f);
//        startTransform.setRotation(rotation);
        DefaultMotionState ms = new DefaultMotionState(startTransform);
        RigidBodyConstructionInfo rbInfo = new RigidBodyConstructionInfo(mass, ms, collisionShape,localInertia);
        cube = new RigidBody(rbInfo);
	cube.setRestitution(0.1f);
	cube.setFriction(0.50f);
	cube.setDamping(0f, 0f);
        
        
        
        
        dynamicWorld.addRigidBody(cube);
        
    }
    
    
    @Override
    public void init(GLAutoDrawable drawable){
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        
        gl.glClearColor(0f, 0f, 0f, 0f);
        gl.glViewport(0, 0, screenW, screenH);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45, screenW/screenH, 1, 1000);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glShadeModel(GL.GL_SMOOTH);
        gl.glEnable(GL.GL_DEPTH_TEST);            
        gl.glDepthFunc(GL.GL_LEQUAL);  
        FPSAnimator animator = new FPSAnimator(this,60);
        animator.start();
        
    }
    @Override
    public void display(GLAutoDrawable drawable){
        float SHINE_ALL_DIRECTIONS = 1;
        float[] lightPos = {-30, 0, 0, SHINE_ALL_DIRECTIONS};
        float[] lightColorAmbient = {0.2f, 0.2f, 0.2f, 1f};
        float[] lightColorSpecular = {0.8f, 0.8f, 0.8f, 1f};

        GL gl = drawable.getGL();
        
        GLUT glut = new GLUT();
//        gl.glLightModeli(GL.GL_FRONT_FACE,GL.GL_TRUE);
//        gl.glLightfv(GL.GL_LIGHT1, GL.GL_POSITION, lightPos, 0);
//        gl.glLightfv(GL.GL_LIGHT1, GL.GL_AMBIENT, lightColorAmbient, 0);
//        gl.glLightfv(GL.GL_LIGHT1, GL.GL_SPECULAR, lightColorSpecular, 0);
//        gl.glEnable(GL.GL_LIGHT1);
//        gl.glEnable(GL.GL_LIGHTING);
//        float[] rgba = {0.3f, 0.5f, 1f};
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, rgba, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, rgba, 0);
//        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, 0.5f);
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        
        gl.glLoadIdentity();
        Transform trans = new Transform();
        MotionState ms = cube.getMotionState();
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
        } catch (java.lang.Exception ex) {
            Logger.getLogger(MyCanvas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        
        gl.glPushMatrix();
//        gl.glTranslatef(trans.origin.x, trans.origin.y, trans.origin.z);
         
//        gl.glRotatef((float)angles[0]*(float)(180/Math.PI), 1, 0, 0);
//        gl.glRotatef((float)angles[1]*(float)(180/Math.PI), 0, 1, 0);
//        gl.glRotatef((float)angles[2]*(float)(180/Math.PI), 0, 0, 1);
////        
//        glut.glutSolidCube(10.0f);
        
        Iterator voronoi_iter = voronoi_vertices.keySet().iterator();
        while(voronoi_iter.hasNext()){
            ArrayList adjacents = (ArrayList)voronoi_vertices.get(voronoi_iter.next());
            Point_3 v = (Point_3)adjacents.get(0);
            Point_3 a1 = (Point_3)adjacents.get(1);
            Point_3 a2 = (Point_3)adjacents.get(2);
            Point_3 a3 = (Point_3)adjacents.get(3);
            Point_3 a4 = (Point_3)adjacents.get(4);
            
                
            
            gl.glTranslatef(0.0f,0.0f,-100);
            gl.glRotatef(rotate, 1, 1, 0.5f);
            gl.glBegin(GL.GL_LINES);
            gl.glColor3f(255, 0, 0);
            gl.glVertex3d(v.x(), v.y(), v.z());
            gl.glVertex3d(a1.x(), a1.y(), a1.z());
            gl.glVertex3d(v.x(), v.y(), v.z());
            gl.glVertex3d(a2.x(), a2.y(), a2.z());
            gl.glVertex3d(v.x(), v.y(), v.z());
            gl.glVertex3d(a3.x(), a3.y(), a3.z());
            gl.glVertex3d(v.x(), v.y(), v.z());
            gl.glVertex3d(a4.x(), a4.y(), a4.z());
            
        }
        gl.glEnd();
        
//        Iterator cell_iter = cell_vertices.keySet().iterator();
//        while(cell_iter.hasNext()){
//            ArrayList<Vector3f> v1 = (ArrayList<Vector3f>)cell_vertices.get(cell_iter.next());
//            Vector3f test = v1.get(0);
//            Vector3f test1 =v1.get(1);
//            Vector3f test2 =v1.get(2);
//            Vector3f test3 =v1.get(3);
//            
//           
//            
//            
//            gl.glTranslatef(0.0f,0.0f,-100);
//            gl.glRotatef(rotate, 1, 1, 0.5f);
//            gl.glBegin(GL.GL_LINES);
//            gl.glColor3f(0, 255, 0);
//            gl.glVertex3f(test.x,test.y,test.z);
//            gl.glVertex3f(test1.x,test1.y,test1.z);
//            gl.glVertex3f(test.x,test.y,test.z);
//            gl.glVertex3f(test2.x,test2.y,test2.z);
//            gl.glVertex3f(test.x,test.y,test.z);
//            gl.glVertex3f(test3.x,test3.y,test3.z);
//            
//            gl.glVertex3f(test1.x,test1.y,test1.z);
//            gl.glVertex3f(test2.x,test2.y,test2.z);
//            gl.glVertex3f(test1.x,test1.y,test1.z);
//            gl.glVertex3f(test3.x,test3.y,test3.z);
//            gl.glVertex3f(test2.x,test2.y,test2.z);
//            gl.glVertex3f(test3.x,test3.y,test3.z);
//        }
//        gl.glEnd();
        
        
        for(int p=0;p<input_points.size();p++){
        Point_3 v_point = (Point_3)input_points.get(p);
       
        gl.glPointSize(3.0f);
        gl.glBegin(GL.GL_POINTS);
        gl.glColor3f(0, 255, 0);
        
        gl.glVertex3d(v_point.x(), v_point.y(), v_point.z());
        
        
        }
        gl.glEnd();
        gl.glPushMatrix();
        gl.glTranslatef(5.0f,5.0f,5.0f);
        gl.glRotatef(rotate, 1, 1, 0.5f);
        glut.glutWireCube(10);
        gl.glPopMatrix();
        gl.glPopMatrix();

        rotate += 0.5;
        dynamicWorld.stepSimulation(100);
    }
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    
    }
    @Override
    public void displayChanged(GLAutoDrawable drawable,boolean x,boolean y) {}
    
}
