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
    public boolean debug = false;
    public boolean voronoi = false;
    public long voronoi_start_time =0;
    public boolean drawV = false;
    public boolean first = true;
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
        SetGL.setLighting(gl);
        SetGL.setMaterial(gl);
//        try{ dt = new Delaunay(10,20.0f);
//        
//        }catch(Exception e){
//            e.printStackTrace();
//            System.exit(-1);
//        }
        
        world = new Physics();
        world.setGround();
        
         
        FPSAnimator animator = new FPSAnimator(this,60);
        
        animator.start();
        
    }
    
    
    
    //open gl display method (main looop)
    @Override
    public void display(GLAutoDrawable drawable){
        double radius = 10;
        
        long startTime = System.currentTimeMillis();
        float xTrans = -1*xpos;
        float yTrans =  walkbias-35.43f;
        float zTrans = -1*zpos;
        float[] light = {xTrans,yTrans,zTrans,0.0f};
        float px = 0.0f;
        float py = -20.0f+(float)radius ;
        float pz = 0.0f;
        float sceneroty = 360.0f - yrot;
        GLUT glut = new GLUT();
              
        gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
//        gl.glPushMatrix();
//        gl.glTranslatef(px, py, pz);
//        glut.glutSolidSphere(radius, 10, 10);
//        gl.glPopMatrix();
        
        gl.glRotatef(lookupdown, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(sceneroty, 0.0f, 1.0f, 0.0f);
        gl.glTranslatef(xTrans, yTrans, zTrans);
        
        if(keys[KeyEvent.VK_B]&&!startPhysics){
            debug = true;
            
        }
        
        if(keys[KeyEvent.VK_P]){
            debug = false;
            
        }
        
        if(keys[KeyEvent.VK_Q]&&first){
            voronoi = true;
            first = false;
            voronoi_start_time = System.currentTimeMillis();
        }
        
        
        if(voronoi){
            try{ dt = new Delaunay(10,20.0f);
        
            }catch(Exception e){
                e.printStackTrace();
                System.exit(-1);
            }
            world.addVoronoi();
            
            voronoi = false;
            drawV = true;
        }
        
        if(drawV){dt.drawVoronoiCells(gl, rotate, debug);}
        
        
        if (keys[KeyEvent.VK_RIGHT]) {
                heading -= 1.0f;
                yrot = heading;
        }
 
        if (keys[KeyEvent.VK_LEFT]) {
                heading += 1.0f;
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
                lookupdown += 1.0f;
            }
        }
 
        if (keys[KeyEvent.VK_UP]) {
            if(lookupdown>-90){
                lookupdown -= 1.0f;
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
        
        
        
        
        if(debug){
           rotate += 0.5; 
        }
        
        long currentTime = System.currentTimeMillis();
        long deltaTime = currentTime-startTime;
        timeStep = (float)deltaTime;
        
        if(startPhysics&&!debug){
            rotate = 0;
            world.dynamicWorld.stepSimulation(timeStep);
            long current_voronoi_time = System.currentTimeMillis();
            long voronoi_delta_time = current_voronoi_time - voronoi_start_time;
            if(voronoi_delta_time>10000){
                first = true;
            }
            
        }
       
    }
    
    
    
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }
    
    
    
    @Override
    public void displayChanged(GLAutoDrawable drawable,boolean x,boolean y) {
    }
    
}
