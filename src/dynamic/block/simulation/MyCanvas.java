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
    
    public float rotate = 0.0f;
    public int size = 10;
    public static DynamicsWorld dynamicWorld = null;
    public static RigidBody cube,ground;
    public double[] angles;
    public HashMap cell_vertices = new HashMap();
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
        LinkedList<Point_3> input_points=new LinkedList<Point_3>();
        Delaunay_triangulation_3 dt = new Delaunay_triangulation_3();
        
        for(int i = 0;i<20;i++){
            double x = (Math.random()*1000)%20;
            double y = (Math.random()*1000)%20;
            double z = (Math.random()*1000)%20;
            input_points.add(new Point_3(x,y,z));
        }
//        dt.insert(new Point_3(4.0,1.0,5.0));
//        dt.insert(new Point_3(2.0,1.5,4.0));
//        dt.insert(new Point_3(6.0,3.0,8.0));
//        dt.insert(new Point_3(1.0,7.0,4.0));
//        dt.insert(new Point_3(4.0,5.0,5.0));
//        dt.insert(new Point_3(4.0,1.0,10.0));
        dt.insert(input_points.iterator());
        Delaunay_triangulation_3_All_cells_iterator cells = dt.all_cells();
        int c = dt.number_of_cells();
        for(int i=0;i<c;i++){
            Delaunay_triangulation_3_Cell_handle ch = cells.next();
            
            
            ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
            for(int k=0;k<4;k++){
                
                Delaunay_triangulation_3_Vertex_handle v = ch.vertex(k);
                Point_3 vertex = v.point();
                Vector3f V1 = new Vector3f((float)vertex.x(),(float)vertex.y(),(float)vertex.z());
                vertices.add(V1);
                
            boolean _valid = ch.is_valid();
            }
            if(!dt.is_infinite(ch)){
            cell_vertices.put(hashStart, vertices);
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
        gl.glLightModeli(GL.GL_FRONT_FACE,GL.GL_TRUE);
        gl.glLightfv(GL.GL_LIGHT1, GL.GL_POSITION, lightPos, 0);
        gl.glLightfv(GL.GL_LIGHT1, GL.GL_AMBIENT, lightColorAmbient, 0);
        gl.glLightfv(GL.GL_LIGHT1, GL.GL_SPECULAR, lightColorSpecular, 0);
        gl.glEnable(GL.GL_LIGHT1);
        gl.glEnable(GL.GL_LIGHTING);
        float[] rgba = {0.3f, 0.5f, 1f};
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, rgba, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, rgba, 0);
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, 0.5f);
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
        
        
        
        
        Iterator cell_iter = cell_vertices.keySet().iterator();
        while(cell_iter.hasNext()){
            ArrayList<Vector3f> v1 = (ArrayList<Vector3f>)cell_vertices.get(cell_iter.next());
            Vector3f test = v1.get(0);
            Vector3f test1 =v1.get(1);
            Vector3f test2 =v1.get(2);
            Vector3f test3 =v1.get(3);
//            Vector3f center = new Vector3f((test1.x+test2.x+test3.x)/3.0f,(test1.y+test2.y+test3.y)/3.0f,(test1.z+test2.z+test3.z)/3.0f);
//            Vector3f centroid = new Vector3f(center.x+0.25f*(test.x-center.x),center.y+0.25f*(test.y-center.y),center.z+0.25f*(test.z-center.z));

            gl.glTranslatef(0.0f,0.0f,-100);
            gl.glBegin(GL.GL_LINES);
            gl.glColor3f(255, 255, 0);
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
        }
        gl.glEnd();
        
//        gl.glBegin(GL.GL_TRIANGLES);
//        gl.glNormal3f(0.0f, 0.0f, 1.0f);
//        gl.glVertex3f(0.0f, 5.0f, 0.0f);
//        gl.glVertex3f(-5.0f, -5.0f, 5.0f);
//        gl.glVertex3f(5.0f, -5.0f, 5.0f);
//        gl.glNormal3f(0.0f, 0.0f, 1.0f);
//        gl.glVertex3f(0.0f, 5.0f, 0.0f);
//        gl.glVertex3f(5.0f, -5.0f, 5.0f);
//        gl.glVertex3f(5.0f, -5.0f, -5.0f);
//        gl.glNormal3f(0.0f, 0.0f, -1.0f);
//        gl.glVertex3f(0.0f, 5.0f, 0.0f);
//        gl.glVertex3f(5.0f, -5.0f, -5.0f);
//        gl.glVertex3f(-5.0f, -5.0f, -5.0f);
//        gl.glNormal3f(0.0f, 0.0f, -1.0f);
//        gl.glVertex3f(0.0f, 5.0f, 0.0f);
//        gl.glVertex3f(-5.0f, -5.0f, -5.0f);
//        gl.glVertex3f(-5.0f, -5.0f, 5.0f);
//        gl.glEnd();
        gl.glPopMatrix();

        rotate += 0.1;
        dynamicWorld.stepSimulation(100);
    }
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    
    }
    @Override
    public void displayChanged(GLAutoDrawable drawable,boolean x,boolean y) {}
    
}
