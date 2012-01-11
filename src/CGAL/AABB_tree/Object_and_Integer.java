/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.AABB_tree;
import CGAL.Polyhedron_3.Polyhedron_3_Halfedge_handle;
public class Object_and_Integer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Object_and_Integer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Object_and_Integer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_AABB_treeJNI.delete_Object_and_Integer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Object_and_Integer() {
    this(CGAL_AABB_treeJNI.new_Object_and_Integer__SWIG_0(), true);
  }

  public Object_and_Integer(Object first, int second) {
    this(CGAL_AABB_treeJNI.new_Object_and_Integer__SWIG_1(Object.getCPtr(first), first, second), true);
  }

  public Object_and_Integer(Object_and_Integer p) {
    this(CGAL_AABB_treeJNI.new_Object_and_Integer__SWIG_2(Object_and_Integer.getCPtr(p), p), true);
  }

  public void setFirst(Object value) {
    CGAL_AABB_treeJNI.Object_and_Integer_first_set(swigCPtr, this, Object.getCPtr(value), value);
  }

  public Object getFirst() {
    long cPtr = CGAL_AABB_treeJNI.Object_and_Integer_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Object(cPtr, false);
  }

  public void setSecond(int value) {
    CGAL_AABB_treeJNI.Object_and_Integer_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_AABB_treeJNI.Object_and_Integer_second_get(swigCPtr, this);
  }

}
