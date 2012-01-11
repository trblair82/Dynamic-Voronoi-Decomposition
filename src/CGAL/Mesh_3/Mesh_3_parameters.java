/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;

public class Mesh_3_parameters {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Mesh_3_parameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_parameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_parameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_3_parameters() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_parameters(), true);
  }

  public void set_lloyd(double time_limit, int max_iteration_number, double convergence, double freeze_bound) {
    CGAL_Mesh_3JNI.Mesh_3_parameters_set_lloyd(swigCPtr, this, time_limit, max_iteration_number, convergence, freeze_bound);
  }

  public void set_odt(double time_limit, int max_iteration_number, double convergence, double freeze_bound) {
    CGAL_Mesh_3JNI.Mesh_3_parameters_set_odt(swigCPtr, this, time_limit, max_iteration_number, convergence, freeze_bound);
  }

  public void set_perturb(double time_limit, double sliver_bound) {
    CGAL_Mesh_3JNI.Mesh_3_parameters_set_perturb(swigCPtr, this, time_limit, sliver_bound);
  }

  public void set_exude(double time_limit, double sliver_bound) {
    CGAL_Mesh_3JNI.Mesh_3_parameters_set_exude(swigCPtr, this, time_limit, sliver_bound);
  }

  public Mesh_3_parameters clone() {
    return new Mesh_3_parameters(CGAL_Mesh_3JNI.Mesh_3_parameters_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_3_parameters other) {
    CGAL_Mesh_3JNI.Mesh_3_parameters_clone__SWIG_1(swigCPtr, this, Mesh_3_parameters.getCPtr(other), other);
  }

}
