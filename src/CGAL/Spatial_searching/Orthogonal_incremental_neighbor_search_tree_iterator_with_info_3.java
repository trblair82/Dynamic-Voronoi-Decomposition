/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3 implements   Iterable<Point_with_info_3>, Iterator<Point_with_info_3>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Point_with_info_3> iterator() {
      return this;
    }
    
    //we store an object of type Point_with_info_3 to avoid
    //creation and allocation of a java object at each iteration.
    private Point_with_info_3 objectInstance = new Point_with_info_3();
    public Point_with_info_3 next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3() {
    this(CGAL_Spatial_searchingJNI.new_Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3(), true);
  }

  public Point_with_info_3 slow_next() {
    return new Point_with_info_3(CGAL_Spatial_searchingJNI.Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3_slow_next(swigCPtr, this), true);
  }

  public void next(Point_with_info_3 r) {
    CGAL_Spatial_searchingJNI.Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3_next(swigCPtr, this, Point_with_info_3.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Spatial_searchingJNI.Orthogonal_incremental_neighbor_search_tree_iterator_with_info_3_hasNext(swigCPtr, this);
  }

}
