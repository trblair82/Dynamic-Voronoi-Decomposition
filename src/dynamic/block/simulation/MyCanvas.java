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
import javax.swing.*;
import java.awt.*;




public class MyCanvas extends GLCanvas implements GLEventListener {
    
    
    public static int screenW = 800;
    public static int screenH = 600;
    public float rotate = 0.0f;
    public Physics world;
    public Delaunay dt;
    public static GL gl;
    private float timeStep;
    
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
        try{ dt = new Delaunay(10,20.0f);
        
        }catch(Exception e){
            e.printStackTrace();
            System.exit(-1);
        }
        world = new Physics();
        world.setGround();
        world.addDynamics(dt.cell_vertices); 
        FPSAnimator animator = new FPSAnimator(this,32);
        
        animator.start();
        
    }
    
    
    
    //open gl display method (main looop)
    @Override
    public void display(GLAutoDrawable drawable){
        long startTime = System.currentTimeMillis();
        gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
//        dt.drawVoronoi(gl, rotate);
        dt.drawDelaunay(gl, rotate);
        
        
        
        
        
        rotate += 0.5;
        long currentTime = System.currentTimeMillis();
        long deltaTime = currentTime-startTime;
        timeStep = (float)deltaTime;
        world.dynamicWorld.stepSimulation(timeStep);
    }
    
    
    
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }
    
    
    
    @Override
    public void displayChanged(GLAutoDrawable drawable,boolean x,boolean y) {
    }
    
}
