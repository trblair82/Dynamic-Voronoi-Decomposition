/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.block.simulation;

/**
 *
 * @author trblair
 */

import javax.media.opengl.*;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.GLCanvas;
import com.sun.opengl.util.FPSAnimator;
import com.sun.opengl.util.GLUT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;




public class MyCanvas extends GLCanvas implements GLEventListener {
    
    
    public static int screenW = 800;
    public static int screenH = 600;
    public float rotate = 0.0f;
    public Physics world;
    public Delaunay dt;
    public static GL gl;
    private float timeStep;
    public static boolean startPhysics = false;
    public static float xpos,yrot,zpos,heading;
    public static float walkbias = 0.0f;
    public static float walkbiasangle = 0.0f;
    public static float lookupdown = 0.0f;
    public static boolean[] keys = new boolean[250];
    public MyCanvas( ) {
       initWindow(); 
       
    }
    
    
    
    public void initWindow(){
        //initiate viewable window with open gl event handler
        JFrame container = new JFrame("Dynamic Block");
        container.setSize(screenW ,screenH);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addGLEventListener(this);
        container.addKeyListener(new DynamicKeyListener());
        container.getContentPane().add(this, BorderLayout.CENTER);
        container.setResizable(false);
        container.setVisible(true);
    }   
    
   
    
    @Override
    public void init(GLAutoDrawable drawable){
        
        
        
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        SetGL.startGL(gl, glu);
        
        SetGL.setMaterial(gl);
        try{ dt = new Delaunay(200,20.0f);
        
        }catch(Exception e){
            e.printStackTrace();
            System.exit(-1);
        }
        world = new Physics();
        world.setGround();
        world.addDynamics(dt.cell_vertices); 
        FPSAnimator animator = new FPSAnimator(this,60);
        
        animator.start();
        
    }
    
    
    
    //open gl display method (main looop)
    @Override
    public void display(GLAutoDrawable drawable){
        double radius = 10;
        long startTime = System.currentTimeMillis();
        float xTrans = -xpos;
        float yTrans =  walkbias-0.43f;
        float zTrans = -zpos;
        float[] light = {xTrans,yTrans,zTrans,0.0f};
        float px = 0.0f;
        float py = -20.0f+(float)radius ;
        float pz = 0.0f;
        float sceneroty = 360.0f - yrot;
        GLUT glut = new GLUT();
              
        gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glPushMatrix();
        gl.glTranslatef(px, py, pz);
        glut.glutSolidSphere(radius, 10, 10);
        gl.glPopMatrix();
        SetGL.setLighting(gl,light);
        gl.glRotatef(lookupdown, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(sceneroty, 0.0f, 1.0f, 0.0f);
        gl.glTranslatef(xTrans, yTrans, zTrans);
        
//        dt.drawVoronoi(gl, rotate);
        dt.drawDelaunay(gl, rotate);
        
        
        if (keys[KeyEvent.VK_RIGHT]) {
                heading -= 3.0f;
                yrot = heading;
        }
 
        if (keys[KeyEvent.VK_LEFT]) {
                heading += 3.0f;
                yrot = heading;
        }
        if (keys[KeyEvent.VK_W]) {
 
            xpos -= (float)Math.sin(Math.toRadians(heading)) * 1.0f; // Move On The X-Plane Based On Player Direction
            zpos -= (float)Math.cos(Math.toRadians(heading)) * 1.0f; // Move On The Z-Plane Based On Player Direction
            px -= (float)Math.sin(Math.toRadians(heading)) * 1.0f;;
            pz -= (float)Math.cos(Math.toRadians(heading)) * 1.0f;;
            if (walkbiasangle >= 359.0f){
                walkbiasangle = 0.0f;
            }else
                walkbiasangle += 20.0f;

                walkbias = (float)Math.sin(Math.toRadians(walkbiasangle))/20.0f; // Causes The Player To Bounce
        }
 
        if (keys[KeyEvent.VK_S]) {
 
            xpos += (float)Math.sin(Math.toRadians(heading)) * 1.0f; // Move On The X-Plane Based On Player Direction
            zpos += (float)Math.cos(Math.toRadians(heading)) * 1.0f; // Move On The Z-Plane Based On Player Direction
            pz += (float)Math.cos(Math.toRadians(heading)) * 1.0f;
            px += (float)Math.sin(Math.toRadians(heading)) * 1.0f;
            if (walkbiasangle <= 1.0f){
                walkbiasangle = 359.0f;
            }else
                walkbiasangle -= 20.0f;

                walkbias = (float)Math.sin(Math.toRadians(walkbiasangle))/20.0f; // Causes The Player To Bounce
        }
 
        if (keys[KeyEvent.VK_DOWN]) {
            if(lookupdown<90){
                lookupdown += 2.0f;
            }
        }
 
        if (keys[KeyEvent.VK_UP]) {
            if(lookupdown>-90){
                lookupdown -= 2.0f;
            }
        }
        if (keys[KeyEvent.VK_A]) {
                xpos -= (float)Math.sin(Math.toRadians(heading+90)) * 1.0f;
                zpos -= (float)Math.cos(Math.toRadians(heading+90)) * 1.0f;
                px -= (float)Math.sin(Math.toRadians(heading+90)) * 1.0f;
                pz -= (float)Math.cos(Math.toRadians(heading+90)) * 1.0f;
        }
        if (keys[KeyEvent.VK_D]) {
                xpos += (float)Math.sin(Math.toRadians(heading+90)) * 1.0f;
                zpos += (float)Math.cos(Math.toRadians(heading+90)) * 1.0f;
                px += (float)Math.sin(Math.toRadians(heading+90)) * 1.0f;
                pz += (float)Math.cos(Math.toRadians(heading+90)) * 1.0f;
        }
        
        
        
        
        
        rotate += 0.5;
        long currentTime = System.currentTimeMillis();
        long deltaTime = currentTime-startTime;
        timeStep = (float)deltaTime;
        if(startPhysics){
            world.dynamicWorld.stepSimulation(timeStep);
        }
       
    }
    
    
    
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }
    
    
    
    @Override
    public void displayChanged(GLAutoDrawable drawable,boolean x,boolean y) {
    }
    
}
