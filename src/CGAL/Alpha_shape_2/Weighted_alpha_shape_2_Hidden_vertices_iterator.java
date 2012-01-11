/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Alpha_shape_2;

  import CGAL.Kernel.Weighted_point_2;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Weighted_alpha_shape_2_Hidden_vertices_iterator implements   Iterable<Weighted_alpha_shape_2_Vertex_handle>, Iterator<Weighted_alpha_shape_2_Vertex_handle>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Weighted_alpha_shape_2_Hidden_vertices_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Weighted_alpha_shape_2_Hidden_vertices_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Weighted_alpha_shape_2_Hidden_vertices_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Weighted_alpha_shape_2_Vertex_handle> iterator() {
      return this;
    }
    
    //we store an object of type Weighted_alpha_shape_2_Vertex_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Weighted_alpha_shape_2_Vertex_handle objectInstance = new Weighted_alpha_shape_2_Vertex_handle();
    public Weighted_alpha_shape_2_Vertex_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Weighted_alpha_shape_2_Hidden_vertices_iterator() {
    this(CGAL_Alpha_shape_2JNI.new_Weighted_alpha_shape_2_Hidden_vertices_iterator(), true);
  }

  public Weighted_alpha_shape_2_Vertex_handle slow_next() {
    return new Weighted_alpha_shape_2_Vertex_handle(CGAL_Alpha_shape_2JNI.Weighted_alpha_shape_2_Hidden_vertices_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Weighted_alpha_shape_2_Vertex_handle r) {
    CGAL_Alpha_shape_2JNI.Weighted_alpha_shape_2_Hidden_vertices_iterator_next(swigCPtr, this, Weighted_alpha_shape_2_Vertex_handle.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Alpha_shape_2JNI.Weighted_alpha_shape_2_Hidden_vertices_iterator_hasNext(swigCPtr, this);
  }

}
