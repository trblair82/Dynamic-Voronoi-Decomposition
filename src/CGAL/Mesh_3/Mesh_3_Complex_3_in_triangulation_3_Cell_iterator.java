/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Mesh_3_Complex_3_in_triangulation_3_Cell_iterator implements   Iterable<Mesh_3_regular_triangulation_3_Cell_handle>, Iterator<Mesh_3_regular_triangulation_3_Cell_handle>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Mesh_3_Complex_3_in_triangulation_3_Cell_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_Complex_3_in_triangulation_3_Cell_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_Complex_3_in_triangulation_3_Cell_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Mesh_3_regular_triangulation_3_Cell_handle> iterator() {
      return this;
    }
    
    //we store an object of type Mesh_3_regular_triangulation_3_Cell_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Mesh_3_regular_triangulation_3_Cell_handle objectInstance = new Mesh_3_regular_triangulation_3_Cell_handle();
    public Mesh_3_regular_triangulation_3_Cell_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Mesh_3_Complex_3_in_triangulation_3_Cell_iterator() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_Complex_3_in_triangulation_3_Cell_iterator(), true);
  }

  public Mesh_3_regular_triangulation_3_Cell_handle slow_next() {
    return new Mesh_3_regular_triangulation_3_Cell_handle(CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_Cell_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Mesh_3_regular_triangulation_3_Cell_handle r) {
    CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_Cell_iterator_next(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Mesh_3JNI.Mesh_3_Complex_3_in_triangulation_3_Cell_iterator_hasNext(swigCPtr, this);
  }

}