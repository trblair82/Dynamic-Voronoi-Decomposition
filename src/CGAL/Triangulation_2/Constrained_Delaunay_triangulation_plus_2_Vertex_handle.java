/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Java.JavaData; import CGAL.Kernel.Point_2;
public class Constrained_Delaunay_triangulation_plus_2_Vertex_handle {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Constrained_Delaunay_triangulation_plus_2_Vertex_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constrained_Delaunay_triangulation_plus_2_Vertex_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Constrained_Delaunay_triangulation_plus_2_Vertex_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Constrained_Delaunay_triangulation_plus_2_Vertex_handle() {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2_Vertex_handle(), true);
  }

  public Point_2 point() {
    return new Point_2(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_point__SWIG_0(swigCPtr, this), true);
  }

  public void point(Point_2 ref) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_point__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public void set_point(Point_2 c) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_set_point(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean equals(Constrained_Delaunay_triangulation_plus_2_Vertex_handle v) {
    return CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_equals(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(v), v);
  }

  public Constrained_Delaunay_triangulation_plus_2_Vertex_handle clone() {
    return new Constrained_Delaunay_triangulation_plus_2_Vertex_handle(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Constrained_Delaunay_triangulation_plus_2_Vertex_handle other) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_clone__SWIG_1(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(other), other);
  }

  public JavaData info() {
    return new JavaData(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_info(swigCPtr, this), false);
  }

  public void get_info(JavaData jd) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_get_info(swigCPtr, this, JavaData.getCPtr(jd), jd);
  }

  public void set_info(JavaData jd) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Vertex_handle_set_info(swigCPtr, this, JavaData.getCPtr(jd), jd);
  }

}
