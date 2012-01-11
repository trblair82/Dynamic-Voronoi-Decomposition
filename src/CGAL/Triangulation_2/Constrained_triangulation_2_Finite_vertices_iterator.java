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
  
public class Constrained_triangulation_2_Finite_vertices_iterator implements   Iterable<Constrained_triangulation_2_Vertex_handle>, Iterator<Constrained_triangulation_2_Vertex_handle>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Constrained_triangulation_2_Finite_vertices_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constrained_triangulation_2_Finite_vertices_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Constrained_triangulation_2_Finite_vertices_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Constrained_triangulation_2_Vertex_handle> iterator() {
      return this;
    }
    
    //we store an object of type Constrained_triangulation_2_Vertex_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Constrained_triangulation_2_Vertex_handle objectInstance = new Constrained_triangulation_2_Vertex_handle();
    public Constrained_triangulation_2_Vertex_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Constrained_triangulation_2_Finite_vertices_iterator() {
    this(CGAL_Triangulation_2JNI.new_Constrained_triangulation_2_Finite_vertices_iterator(), true);
  }

  public Constrained_triangulation_2_Vertex_handle slow_next() {
    return new Constrained_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Constrained_triangulation_2_Finite_vertices_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Constrained_triangulation_2_Vertex_handle r) {
    CGAL_Triangulation_2JNI.Constrained_triangulation_2_Finite_vertices_iterator_next(swigCPtr, this, Constrained_triangulation_2_Vertex_handle.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Constrained_triangulation_2_Finite_vertices_iterator_hasNext(swigCPtr, this);
  }

}
