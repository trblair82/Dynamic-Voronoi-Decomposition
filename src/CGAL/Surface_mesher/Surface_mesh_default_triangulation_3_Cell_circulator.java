/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Surface_mesher;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Surface_mesh_default_triangulation_3_Cell_circulator implements   Iterable<Surface_mesh_default_triangulation_3_Cell_handle>, Iterator<Surface_mesh_default_triangulation_3_Cell_handle>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Surface_mesh_default_triangulation_3_Cell_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Surface_mesh_default_triangulation_3_Cell_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Surface_mesherJNI.delete_Surface_mesh_default_triangulation_3_Cell_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Surface_mesh_default_triangulation_3_Cell_handle> iterator() {
      return this;
    }
    
    //we store an object of type Surface_mesh_default_triangulation_3_Cell_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Surface_mesh_default_triangulation_3_Cell_handle objectInstance = new Surface_mesh_default_triangulation_3_Cell_handle();
    public Surface_mesh_default_triangulation_3_Cell_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Surface_mesh_default_triangulation_3_Cell_circulator() {
    this(CGAL_Surface_mesherJNI.new_Surface_mesh_default_triangulation_3_Cell_circulator(), true);
  }

  public Surface_mesh_default_triangulation_3_Cell_handle slow_next() {
    return new Surface_mesh_default_triangulation_3_Cell_handle(CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_Cell_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Surface_mesh_default_triangulation_3_Cell_handle r) {
    CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_Cell_circulator_next(swigCPtr, this, Surface_mesh_default_triangulation_3_Cell_handle.getCPtr(r), r);
  }

  public Surface_mesh_default_triangulation_3_Cell_handle prev() {
    return new Surface_mesh_default_triangulation_3_Cell_handle(CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_Cell_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Surface_mesherJNI.Surface_mesh_default_triangulation_3_Cell_circulator_hasNext(swigCPtr, this);
  }

}
