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
  
public class Delaunay_triangulation_2_Finite_edges_iterator implements   Iterable<Delaunay_triangulation_2_Edge>, Iterator<Delaunay_triangulation_2_Edge>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Delaunay_triangulation_2_Finite_edges_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_triangulation_2_Finite_edges_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Delaunay_triangulation_2_Finite_edges_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Delaunay_triangulation_2_Edge> iterator() {
      return this;
    }
    
    //we store an object of type Delaunay_triangulation_2_Edge to avoid
    //creation and allocation of a java object at each iteration.
    private Delaunay_triangulation_2_Edge objectInstance = new Delaunay_triangulation_2_Edge();
    public Delaunay_triangulation_2_Edge next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Delaunay_triangulation_2_Finite_edges_iterator() {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Finite_edges_iterator(), true);
  }

  public Delaunay_triangulation_2_Edge slow_next() {
    return new Delaunay_triangulation_2_Edge(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_edges_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Delaunay_triangulation_2_Edge r) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_edges_iterator_next(swigCPtr, this, Delaunay_triangulation_2_Edge.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_edges_iterator_hasNext(swigCPtr, this);
  }

}
