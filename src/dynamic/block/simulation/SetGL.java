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
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import com.bulletphysics.collision.broadphase.*;
import com.bulletphysics.collision.dispatch.*;
import com.bulletphysics.collision.shapes.*;
import com.bulletphysics.dynamics.*;
import com.bulletphysics.collision.shapes.BU_Simplex1to4;
import com.bulletphysics.dynamics.constraintsolver.SequentialImpulseConstraintSolver;
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
import org.apache.commons.math.geometry.RotationOrder;

public class SetGL {
    public SetGL(){}
    
    public static void setLighting(GL gl){
        float SHINE_ALL_DIRECTIONS = 1;
        float[] lightPos = {-30, 0, 0, SHINE_ALL_DIRECTIONS};
        float[] lightColorAmbient = {0.2f, 0.2f, 0.2f, 1f};
        float[] lightColorSpecular = {0.8f, 0.8f, 0.8f, 1f};
        gl.glLightModeli(GL.GL_FRONT_FACE,GL.GL_TRUE);
        gl.glLightfv(GL.GL_LIGHT1, GL.GL_POSITION, lightPos, 0);
        gl.glLightfv(GL.GL_LIGHT1, GL.GL_AMBIENT, lightColorAmbient, 0);
        gl.glLightfv(GL.GL_LIGHT1, GL.GL_SPECULAR, lightColorSpecular, 0);
        gl.glEnable(GL.GL_LIGHT1);
        gl.glEnable(GL.GL_LIGHTING);
    }
    public static void setMaterial(GL gl){
        float[] rgba = {0.3f, 0.5f, 1f};
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, rgba, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, rgba, 0);
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, 0.5f);
    }
    public static void startGL(GL gl, GLU glu){
        gl.glClearColor(0f, 0f, 0f, 0f);
        gl.glViewport(0, 0, MyCanvas.screenW, MyCanvas.screenH);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45, MyCanvas.screenW/MyCanvas.screenH, 1, 1000);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glShadeModel(GL.GL_SMOOTH);
        gl.glEnable(GL.GL_DEPTH_TEST);            
        gl.glDepthFunc(GL.GL_LEQUAL);  
        
    }
}
