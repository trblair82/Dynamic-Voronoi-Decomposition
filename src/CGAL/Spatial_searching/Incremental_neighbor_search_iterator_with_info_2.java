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
  
public class Incremental_neighbor_search_iterator_with_info_2 implements   Iterable<Point_with_info_with_transformed_distance_2>, Iterator<Point_with_info_with_transformed_distance_2>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Incremental_neighbor_search_iterator_with_info_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Incremental_neighbor_search_iterator_with_info_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Incremental_neighbor_search_iterator_with_info_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Point_with_info_with_transformed_distance_2> iterator() {
      return this;
    }
    
    //we store an object of type Point_with_info_with_transformed_distance_2 to avoid
    //creation and allocation of a java object at each iteration.
    private Point_with_info_with_transformed_distance_2 objectInstance = new Point_with_info_with_transformed_distance_2();
    public Point_with_info_with_transformed_distance_2 next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Incremental_neighbor_search_iterator_with_info_2() {
    this(CGAL_Spatial_searchingJNI.new_Incremental_neighbor_search_iterator_with_info_2(), true);
  }

  public Point_with_info_with_transformed_distance_2 slow_next() {
    return new Point_with_info_with_transformed_distance_2(CGAL_Spatial_searchingJNI.Incremental_neighbor_search_iterator_with_info_2_slow_next(swigCPtr, this), true);
  }

  public void next(Point_with_info_with_transformed_distance_2 r) {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_iterator_with_info_2_next(swigCPtr, this, Point_with_info_with_transformed_distance_2.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Spatial_searchingJNI.Incremental_neighbor_search_iterator_with_info_2_hasNext(swigCPtr, this);
  }

}
