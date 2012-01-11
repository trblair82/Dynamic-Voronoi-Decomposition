/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;
import CGAL.Kernel.Point_2; import CGAL.Java.JavaData;
public class Fuzzy_sphere_with_info_2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Fuzzy_sphere_with_info_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Fuzzy_sphere_with_info_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Fuzzy_sphere_with_info_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Fuzzy_sphere_with_info_2(Point_with_info_2 center, double radius, double epsilon) {
    this(CGAL_Spatial_searchingJNI.new_Fuzzy_sphere_with_info_2__SWIG_0(Point_with_info_2.getCPtr(center), center, radius, epsilon), true);
  }

  public Fuzzy_sphere_with_info_2(Point_with_info_2 center, double radius) {
    this(CGAL_Spatial_searchingJNI.new_Fuzzy_sphere_with_info_2__SWIG_1(Point_with_info_2.getCPtr(center), center, radius), true);
  }

  public boolean contains(Point_with_info_2 c) {
    return CGAL_Spatial_searchingJNI.Fuzzy_sphere_with_info_2_contains(swigCPtr, this, Point_with_info_2.getCPtr(c), c);
  }

  public Fuzzy_sphere_with_info_2 clone() {
    return new Fuzzy_sphere_with_info_2(CGAL_Spatial_searchingJNI.Fuzzy_sphere_with_info_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Fuzzy_sphere_with_info_2 other) {
    CGAL_Spatial_searchingJNI.Fuzzy_sphere_with_info_2_clone__SWIG_1(swigCPtr, this, Fuzzy_sphere_with_info_2.getCPtr(other), other);
  }

}
