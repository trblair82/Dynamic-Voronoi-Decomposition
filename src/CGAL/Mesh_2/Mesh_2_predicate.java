/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;

public class Mesh_2_predicate {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Mesh_2_predicate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_2_predicate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_2JNI.delete_Mesh_2_predicate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_2_predicate() {
    this(CGAL_Mesh_2JNI.new_Mesh_2_predicate__SWIG_0(), true);
  }

  public Mesh_2_predicate(Object jobj, String fname, String input_type_1, String input_type_2, String output_type) {
    this(CGAL_Mesh_2JNI.new_Mesh_2_predicate__SWIG_1(jobj, fname, input_type_1, input_type_2, output_type), true);
  }

}