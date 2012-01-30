/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.block.simulation;

/**
 *
 * @author trblair
 */
import CGAL.Kernel.Point_3;
import java.util.Iterator;
import com.bulletphysics.collision.broadphase.*;
import com.bulletphysics.collision.dispatch.*;
import com.bulletphysics.collision.shapes.*;
import com.bulletphysics.dynamics.*;
import com.bulletphysics.collision.shapes.BU_Simplex1to4;
import com.bulletphysics.dynamics.constraintsolver.SequentialImpulseConstraintSolver;
import com.bulletphysics.linearmath.*;
import com.bulletphysics.linearmath.Transform;
import com.bulletphysics.util.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import javax.vecmath.*;


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
    
    public void addDynamics(ArrayList cell_vertices){
        //initilizes tetrahedrons dynamic body and adds to world
        Iterator iter1 = Delaunay.voronoi_cells.iterator();
        
        Vector3f localInertia = new Vector3f(0,0,0);
        while(iter1.hasNext()){
            int c = 0;
            HashMap cell = (HashMap)iter1.next();
            ArrayList vc = (ArrayList)cell.get("vertices");
            
            Vector3f origin = new Vector3f();
            ObjectArrayList vec = new ObjectArrayList();
            for(int i = 0;i<vc.size();i++){
                Point_3 temp = (Point_3)vc.get(i);
                Vector3f end = new Vector3f((float)temp.x(),(float)temp.y(),(float)temp.z());
                origin.x+=end.x;origin.y+=end.y;origin.z+=end.z;
                vec.add(end);
            }
            
            
            ObjectArrayList testL = new ObjectArrayList();
            ConvexHullShape cell_shape = new ConvexHullShape(testL);
            
            float mass = 2.0f;
            
            origin.x = origin.x/vec.size();
            origin.y = origin.y/vec.size();
            origin.z = origin.z/vec.size();
            
            
            float3 originf = new float3(origin.x,origin.y,origin.z);
            ObjectArrayList true_points = new ObjectArrayList();
            for(int i = 0;i<vec.size();i++){
                Vector3f point = (Vector3f)vec.get(i);
                float3 pointf = new float3(point.x,point.y,point.z);
                float3 finalp = float3.Subtract(pointf, originf);
                Vector3f finalv = new Vector3f(finalp.x,finalp.y,finalp.z);
                true_points.add(finalv);
                cell_shape.addPoint(finalv);
            }
            Transform cell_transform = new Transform();
            cell_transform.setIdentity();
            cell_transform.origin.set(origin);
//            cell_transform.transform(origin);
            
//            ConvexHullShape cell_shape = new ConvexHullShape(true_points);
            cell_shape.calculateLocalInertia(mass, localInertia);
            boolean test =cell_shape.isConvex();
            
            DefaultMotionState ms = new DefaultMotionState(cell_transform);
            RigidBodyConstructionInfo rbInfo = new RigidBodyConstructionInfo(mass, ms, cell_shape,localInertia);
            tetrahedron = new RigidBody(rbInfo);
            tetrahedron.setRestitution(0.1f);
            tetrahedron.setFriction(0.50f);
            tetrahedron.setDamping(0.0f, 0.0f);
            dynamicWorld.addRigidBody(tetrahedron);
            tetrahedrons.add(tetrahedron);
        
        }
    }
}
