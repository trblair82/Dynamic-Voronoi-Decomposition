/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

public class Constrained_Delaunay_triangulation_plus_2_Constraint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Constrained_Delaunay_triangulation_plus_2_Constraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constrained_Delaunay_triangulation_plus_2_Constraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Constrained_Delaunay_triangulation_plus_2_Constraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Constrained_Delaunay_triangulation_plus_2_Constraint() {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2_Constraint__SWIG_0(), true);
  }

  public Constrained_Delaunay_triangulation_plus_2_Constraint(Constrained_Delaunay_triangulation_plus_2_Vertex_handle first, Constrained_Delaunay_triangulation_plus_2_Vertex_handle second) {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2_Constraint__SWIG_1(Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(first), first, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(second), second), true);
  }

  public Constrained_Delaunay_triangulation_plus_2_Constraint(Constrained_Delaunay_triangulation_plus_2_Constraint p) {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2_Constraint__SWIG_2(Constrained_Delaunay_triangulation_plus_2_Constraint.getCPtr(p), p), true);
  }

  public void setFirst(Constrained_Delaunay_triangulation_plus_2_Vertex_handle value) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Constraint_first_set(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(value), value);
  }

  public Constrained_Delaunay_triangulation_plus_2_Vertex_handle getFirst() {
    long cPtr = CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Constraint_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Constrained_Delaunay_triangulation_plus_2_Vertex_handle(cPtr, false);
  }

  public void setSecond(Constrained_Delaunay_triangulation_plus_2_Vertex_handle value) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Constraint_second_set(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(value), value);
  }

  public Constrained_Delaunay_triangulation_plus_2_Vertex_handle getSecond() {
    long cPtr = CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Constraint_second_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Constrained_Delaunay_triangulation_plus_2_Vertex_handle(cPtr, false);
  }

}
