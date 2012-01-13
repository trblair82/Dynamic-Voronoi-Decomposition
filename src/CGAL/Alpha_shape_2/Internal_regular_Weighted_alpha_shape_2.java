/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Alpha_shape_2;
import CGAL.Kernel.Weighted_point_2; import CGAL.Kernel.Oriented_side; import java.util.Iterator; import java.util.Collection;
public class Internal_regular_Weighted_alpha_shape_2 extends Internal_Triangulation_2_Internal_regular_Weighted_alpha_shape_2 {
  private long swigCPtr;

  public Internal_regular_Weighted_alpha_shape_2(long cPtr, boolean cMemoryOwn) {
    super(CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Internal_regular_Weighted_alpha_shape_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Internal_regular_Weighted_alpha_shape_2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Internal_regular_Weighted_alpha_shape_2() {
    this(CGAL_Alpha_shape_2JNI.new_Internal_regular_Weighted_alpha_shape_2(), true);
  }

  public int number_of_hidden_vertices() {
    return CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_number_of_hidden_vertices(swigCPtr, this);
  }

  public Weighted_alpha_shape_2_Hidden_vertices_iterator hidden_vertices() {
    return new Weighted_alpha_shape_2_Hidden_vertices_iterator(CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_hidden_vertices(swigCPtr, this), true);
  }

  public Weighted_point_2 weighted_circumcenter(Weighted_alpha_shape_2_Face_handle c) {
    return new Weighted_point_2(CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_weighted_circumcenter__SWIG_0(swigCPtr, this, Weighted_alpha_shape_2_Face_handle.getCPtr(c), c), true);
  }

  public void weighted_circumcenter(Weighted_alpha_shape_2_Face_handle c, Weighted_point_2 ret) {
    CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_weighted_circumcenter__SWIG_1(swigCPtr, this, Weighted_alpha_shape_2_Face_handle.getCPtr(c), c, Weighted_point_2.getCPtr(ret), ret);
  }

  public Weighted_point_2 dual(Weighted_alpha_shape_2_Face_handle c) {
    return new Weighted_point_2(CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_dual__SWIG_0(swigCPtr, this, Weighted_alpha_shape_2_Face_handle.getCPtr(c), c), true);
  }

  public void dual(Weighted_alpha_shape_2_Face_handle c, Weighted_point_2 ret) {
    CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_dual__SWIG_1(swigCPtr, this, Weighted_alpha_shape_2_Face_handle.getCPtr(c), c, Weighted_point_2.getCPtr(ret), ret);
  }

  public Oriented_side power_test(Weighted_alpha_shape_2_Face_handle c1, Weighted_point_2 c2) {
    return Oriented_side.swigToEnum(CGAL_Alpha_shape_2JNI.Internal_regular_Weighted_alpha_shape_2_power_test(swigCPtr, this, Weighted_alpha_shape_2_Face_handle.getCPtr(c1), c1, Weighted_point_2.getCPtr(c2), c2));
  }

}