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


public class Physics {
    public DynamicsWorld dynamicWorld = null;
    public RigidBody tetrahedron, ground;
    public static ArrayList tetrahedrons = new ArrayList();
    public Physics(){
        //initializes and configures physics world
        DefaultCollisionConfiguration collisionConfiguration = new DefaultCollisionConfiguration();
	CollisionDispatcher dispatcher = new CollisionDispatcher(collisionConfiguration);
	Vector3f worldAabbMin = new Vector3f(-10000,-10000,-10000);
	Vector3f worldAabbMax = new Vector3f(10000,10000,10000);
	AxisSweep3 overlappingPairCache = new AxisSweep3(worldAabbMin, worldAabbMax);
	SequentialImpulseConstraintSolver solver = new SequentialImpulseConstraintSolver();
        dynamicWorld = new DiscreteDynamicsWorld(dispatcher, overlappingPairCache, solver, collisionConfiguration);
	dynamicWorld.setGravity(new Vector3f(0,-10,0));
	dynamicWorld.getDispatchInfo().allowedCcdPenetration = 0f;
    }      
        
    public void setGround(){
        //initializes static ground body and adds to physics world
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
    }
    
    public void addDynamics(HashMap cell_vertices){
        //initilizes tetrahedrons dynamic body and adds to world
        Iterator iter1 = cell_vertices.keySet().iterator();
        Vector3f localInertia = new Vector3f(0,0,0);
        for(int cell_i=0;cell_i<cell_vertices.size();cell_i++){
            int c = 0;
            ArrayList<Vector3f> tetra = (ArrayList<Vector3f>)cell_vertices.get(cell_i);
            Vector3f cp1 = tetra.get(c);
            c++;
            Vector3f cp2 = tetra.get(c);
            c++;
            Vector3f cp3 = tetra.get(c);
            c++;
            Vector3f cp4 = tetra.get(c);
            
        
            CollisionShape collisionShape = new BU_Simplex1to4(cp1, cp2, cp3, cp4);
            float mass = 1.0f;
            collisionShape.calculateLocalInertia(mass, localInertia);
            Transform startTransform = new Transform();
            startTransform.setIdentity();
            startTransform.origin.set(cp1.x, cp1.y, cp1.z);
            DefaultMotionState ms = new DefaultMotionState(startTransform);
            RigidBodyConstructionInfo rbInfo = new RigidBodyConstructionInfo(mass, ms, collisionShape,localInertia);
            tetrahedron = new RigidBody(rbInfo);
            tetrahedron.setRestitution(0.1f);
            tetrahedron.setFriction(0.50f);
            tetrahedron.setDamping(0f, 0f);
            dynamicWorld.addRigidBody(tetrahedron);
            tetrahedrons.add(tetrahedron);
        
        }
    }
}
