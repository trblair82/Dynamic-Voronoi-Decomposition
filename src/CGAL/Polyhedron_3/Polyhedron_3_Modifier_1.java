/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polyhedron_3;
 
public class Polyhedron_3_Modifier_1 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Polyhedron_3_Modifier_1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polyhedron_3_Modifier_1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Polyhedron_3JNI.delete_Polyhedron_3_Modifier_1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Polyhedron_3_Modifier_base get_modifier() {
    return new Polyhedron_3_Modifier_base(CGAL_Polyhedron_3JNI.Polyhedron_3_Modifier_1_get_modifier(swigCPtr, this), true);
  }

  public Polyhedron_3_Modifier_1() {
    this(CGAL_Polyhedron_3JNI.new_Polyhedron_3_Modifier_1(), true);
  }

}
