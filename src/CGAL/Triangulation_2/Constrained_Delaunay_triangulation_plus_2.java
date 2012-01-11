/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Kernel.Point_2; import java.util.Iterator; import java.util.Collection;
public class Constrained_Delaunay_triangulation_plus_2 extends Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2 {
  private long swigCPtr;

  public Constrained_Delaunay_triangulation_plus_2(long cPtr, boolean cMemoryOwn) {
    super(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constrained_Delaunay_triangulation_plus_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Constrained_Delaunay_triangulation_plus_2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Constrained_Delaunay_triangulation_plus_2() {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2__SWIG_0(), true);
  }

  public Constrained_Delaunay_triangulation_plus_2(Iterator<Constraint> range) {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2__SWIG_1(range), true);
  }

  public int number_of_enclosing_constraints(Constrained_Delaunay_triangulation_plus_2_Vertex_handle c1, Constrained_Delaunay_triangulation_plus_2_Vertex_handle c2) {
    return CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_number_of_enclosing_constraints(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c1), c1, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c2), c2);
  }

  public Constrained_Delaunay_triangulation_plus_2_Constraint_iterator constraints() {
    return new Constrained_Delaunay_triangulation_plus_2_Constraint_iterator(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_constraints(swigCPtr, this), true);
  }

  public Constrained_Delaunay_triangulation_plus_2_Subconstraint_iterator subconstraints() {
    return new Constrained_Delaunay_triangulation_plus_2_Subconstraint_iterator(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_subconstraints(swigCPtr, this), true);
  }

  public Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator vertices_in_constraint(Constrained_Delaunay_triangulation_plus_2_Vertex_handle va, Constrained_Delaunay_triangulation_plus_2_Vertex_handle vb) {
    return new Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_vertices_in_constraint(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(va), va, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(vb), vb), true);
  }

  public Constrained_Delaunay_triangulation_plus_2_Context context(Constrained_Delaunay_triangulation_plus_2_Vertex_handle c1, Constrained_Delaunay_triangulation_plus_2_Vertex_handle c2) {
    return new Constrained_Delaunay_triangulation_plus_2_Context(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_context__SWIG_0(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c1), c1, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c2), c2), true);
  }

  public void context(Constrained_Delaunay_triangulation_plus_2_Vertex_handle c1, Constrained_Delaunay_triangulation_plus_2_Vertex_handle c2, Constrained_Delaunay_triangulation_plus_2_Context ret) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_context__SWIG_1(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c1), c1, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c2), c2, Constrained_Delaunay_triangulation_plus_2_Context.getCPtr(ret), ret);
  }

  public Constrained_Delaunay_triangulation_plus_2_Context_iterator contexts(Constrained_Delaunay_triangulation_plus_2_Vertex_handle va, Constrained_Delaunay_triangulation_plus_2_Vertex_handle vb) {
    return new Constrained_Delaunay_triangulation_plus_2_Context_iterator(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_contexts(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(va), va, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(vb), vb), true);
  }

}
