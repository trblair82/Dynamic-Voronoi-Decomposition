/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator implements   Iterable<Constrained_Delaunay_triangulation_plus_2_Face_handle>, Iterator<Constrained_Delaunay_triangulation_plus_2_Face_handle>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Constrained_Delaunay_triangulation_plus_2_Face_handle> iterator() {
      return this;
    }
    
    //we store an object of type Constrained_Delaunay_triangulation_plus_2_Face_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Constrained_Delaunay_triangulation_plus_2_Face_handle objectInstance = new Constrained_Delaunay_triangulation_plus_2_Face_handle();
    public Constrained_Delaunay_triangulation_plus_2_Face_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator() {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator(), true);
  }

  public Constrained_Delaunay_triangulation_plus_2_Face_handle slow_next() {
    return new Constrained_Delaunay_triangulation_plus_2_Face_handle(CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Constrained_Delaunay_triangulation_plus_2_Face_handle r) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator_next(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Face_handle.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_plus_2_Finite_faces_iterator_hasNext(swigCPtr, this);
  }

}
