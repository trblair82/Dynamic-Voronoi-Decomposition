/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Surface_mesher;

public class Surface_mesh_default_criteria_3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Surface_mesh_default_criteria_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Surface_mesh_default_criteria_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Surface_mesherJNI.delete_Surface_mesh_default_criteria_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Surface_mesh_default_criteria_3(double angle_bound, double radius_bound, double distance_bound) {
    this(CGAL_Surface_mesherJNI.new_Surface_mesh_default_criteria_3(angle_bound, radius_bound, distance_bound), true);
  }

}
