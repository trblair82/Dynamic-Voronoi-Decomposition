/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;
import CGAL.Kernel.Point_2; import CGAL.Java.JavaData;
public class Incremental_neighbor_search_with_info_2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Incremental_neighbor_search_with_info_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Incremental_neighbor_search_with_info_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Incremental_neighbor_search_with_info_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Incremental_neighbor_search_with_info_2(Incremental_neighbor_search_tree_with_info_2 tree, Point_2 query) {
    this(CGAL_Spatial_searchingJNI.new_Incremental_neighbor_search_with_info_2__SWIG_0(Incremental_neighbor_search_tree_with_info_2.getCPtr(tree), tree, Point_2.getCPtr(query), query), true);
  }

  public Incremental_neighbor_search_with_info_2(Incremental_neighbor_search_tree_with_info_2 tree, Point_2 query, double eps) {
    this(CGAL_Spatial_searchingJNI.new_Incremental_neighbor_search_with_info_2__SWIG_1(Incremental_neighbor_search_tree_with_info_2.getCPtr(tree), tree, Point_2.getCPtr(query), query, eps), true);
  }

  public Incremental_neighbor_search_with_info_2(Incremental_neighbor_search_tree_with_info_2 tree, Point_2 query, double eps, boolean search_nearest) {
    this(CGAL_Spatial_searchingJNI.new_Incremental_neighbor_search_with_info_2__SWIG_2(Incremental_neighbor_search_tree_with_info_2.getCPtr(tree), tree, Point_2.getCPtr(query), query, eps, search_nearest), true);
  }

  public Incremental_neighbor_search_iterator_with_info_2 iterator() {
    return new Incremental_neighbor_search_iterator_with_info_2(CGAL_Spatial_searchingJNI.Incremental_neighbor_search_with_info_2_iterator(swigCPtr, this), true);
  }

  public Point_with_info_2 value() {
    return new Point_with_info_2(CGAL_Spatial_searchingJNI.Incremental_neighbor_search_with_info_2_value(swigCPtr, this), true);
  }

}
