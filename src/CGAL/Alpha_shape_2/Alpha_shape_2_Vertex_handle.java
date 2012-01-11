/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Alpha_shape_2;
import CGAL.Kernel.Point_2;
public class Alpha_shape_2_Vertex_handle {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Alpha_shape_2_Vertex_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Alpha_shape_2_Vertex_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Alpha_shape_2_Vertex_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Alpha_shape_2_Vertex_handle() {
    this(CGAL_Alpha_shape_2JNI.new_Alpha_shape_2_Vertex_handle(), true);
  }

  public Point_2 point() {
    return new Point_2(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_point__SWIG_0(swigCPtr, this), true);
  }

  public void point(Point_2 ref) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_point__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public void set_point(Point_2 c) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_set_point(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean equals(Alpha_shape_2_Vertex_handle v) {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_equals(swigCPtr, this, Alpha_shape_2_Vertex_handle.getCPtr(v), v);
  }

  public Alpha_shape_2_Vertex_handle clone() {
    return new Alpha_shape_2_Vertex_handle(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Alpha_shape_2_Vertex_handle other) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_clone__SWIG_1(swigCPtr, this, Alpha_shape_2_Vertex_handle.getCPtr(other), other);
  }

  public Vertex_range get_range() {
    return new Vertex_range(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_get_range(swigCPtr, this), true);
  }

  public void set_range(Vertex_range range) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Vertex_handle_set_range(swigCPtr, this, Vertex_range.getCPtr(range), range);
  }

}
