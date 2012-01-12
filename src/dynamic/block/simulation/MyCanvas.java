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
    
    
    public MyCanvas( ) {
        
        dt = new Delaunay(10);
        world = new Physics();
        world.setGround();
        world.addDynamics(dt.cell_vertices);
        initWindow();
    }
    
    
    
    public void initWindow(){
        //initiate viewable window with open gl event handler
        JFrame container = new JFrame("Dynamic Block");
        container.setSize(screenW ,screenH);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addGLEventListener(this);
        container.getContentPane().add(this, BorderLayout.CENTER);
        container.setResizable(false);
        container.setVisible(true);
    }   
    
   
    
    @Override
    public void init(GLAutoDrawable drawable){
        
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        SetGL.startGL(gl, glu);
        FPSAnimator animator = new FPSAnimator(this,60);
        animator.start();
    }
    
    
    
    //open gl display method (main looop)
    @Override
    public void display(GLAutoDrawable drawable){
        
        GL gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        dt.drawDelaunay(gl, rotate);
        dt.drawVoronoi(gl, rotate);
        
//        world.dynamicWorld.stepSimulation(100);
        rotate += 0.5;
    }
    
    
    
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }
    
    
    
    @Override
    public void displayChanged(GLAutoDrawable drawable,boolean x,boolean y) {
    }
    
}
