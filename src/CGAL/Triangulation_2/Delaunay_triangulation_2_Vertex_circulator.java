/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  import CGAL.Kernel.Point_2;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Delaunay_triangulation_2_Vertex_circulator implements   Iterable<Delaunay_triangulation_2_Vertex_handle>, Iterator<Delaunay_triangulation_2_Vertex_handle>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Delaunay_triangulation_2_Vertex_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_triangulation_2_Vertex_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Delaunay_triangulation_2_Vertex_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Delaunay_triangulation_2_Vertex_handle> iterator() {
      return this;
    }
    
    //we store an object of type Delaunay_triangulation_2_Vertex_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Delaunay_triangulation_2_Vertex_handle objectInstance = new Delaunay_triangulation_2_Vertex_handle();
    public Delaunay_triangulation_2_Vertex_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Delaunay_triangulation_2_Vertex_circulator() {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Vertex_circulator(), true);
  }

  public Delaunay_triangulation_2_Vertex_handle slow_next() {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Vertex_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Delaunay_triangulation_2_Vertex_handle r) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Vertex_circulator_next(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(r), r);
  }

  public Delaunay_triangulation_2_Vertex_handle prev() {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Vertex_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Vertex_circulator_hasNext(swigCPtr, this);
  }

}
