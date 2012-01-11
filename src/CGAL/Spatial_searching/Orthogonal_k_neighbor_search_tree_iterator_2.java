/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;

  import CGAL.Kernel.Point_2;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Orthogonal_k_neighbor_search_tree_iterator_2 implements   Iterable<Point_2>, Iterator<Point_2>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Orthogonal_k_neighbor_search_tree_iterator_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Orthogonal_k_neighbor_search_tree_iterator_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Orthogonal_k_neighbor_search_tree_iterator_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Point_2> iterator() {
      return this;
    }
    
    //we store an object of type Point_2 to avoid
    //creation and allocation of a java object at each iteration.
    private Point_2 objectInstance = new Point_2();
    public Point_2 next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Orthogonal_k_neighbor_search_tree_iterator_2() {
    this(CGAL_Spatial_searchingJNI.new_Orthogonal_k_neighbor_search_tree_iterator_2(), true);
  }

  public Point_2 slow_next() {
    return new Point_2(CGAL_Spatial_searchingJNI.Orthogonal_k_neighbor_search_tree_iterator_2_slow_next(swigCPtr, this), true);
  }

  public void next(Point_2 r) {
    CGAL_Spatial_searchingJNI.Orthogonal_k_neighbor_search_tree_iterator_2_next(swigCPtr, this, Point_2.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Spatial_searchingJNI.Orthogonal_k_neighbor_search_tree_iterator_2_hasNext(swigCPtr, this);
  }

}
