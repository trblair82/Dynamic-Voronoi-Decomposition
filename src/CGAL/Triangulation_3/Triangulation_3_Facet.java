/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_3;

public class Triangulation_3_Facet {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Triangulation_3_Facet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Triangulation_3_Facet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_3JNI.delete_Triangulation_3_Facet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Triangulation_3_Facet() {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Facet__SWIG_0(), true);
  }

  public Triangulation_3_Facet(Triangulation_3_Cell_handle first, int second) {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Facet__SWIG_1(Triangulation_3_Cell_handle.getCPtr(first), first, second), true);
  }

  public Triangulation_3_Facet(Triangulation_3_Facet p) {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Facet__SWIG_2(Triangulation_3_Facet.getCPtr(p), p), true);
  }

  public void setFirst(Triangulation_3_Cell_handle value) {
    CGAL_Triangulation_3JNI.Triangulation_3_Facet_first_set(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(value), value);
  }

  public Triangulation_3_Cell_handle getFirst() {
    long cPtr = CGAL_Triangulation_3JNI.Triangulation_3_Facet_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Triangulation_3_Cell_handle(cPtr, false);
  }

  public void setSecond(int value) {
    CGAL_Triangulation_3JNI.Triangulation_3_Facet_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_Triangulation_3JNI.Triangulation_3_Facet_second_get(swigCPtr, this);
  }

}
