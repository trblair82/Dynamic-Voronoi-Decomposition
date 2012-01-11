/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;
import CGAL.Kernel.Point_2; import CGAL.Java.JavaData; import java.util.Iterator; import java.util.Collection;
public class K_neighbor_search_tree_with_info_2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public K_neighbor_search_tree_with_info_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(K_neighbor_search_tree_with_info_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_K_neighbor_search_tree_with_info_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public K_neighbor_search_tree_with_info_2() {
    this(CGAL_Spatial_searchingJNI.new_K_neighbor_search_tree_with_info_2__SWIG_0(), true);
  }

  public K_neighbor_search_tree_with_info_2(Iterator<Point_with_info_2> range) {
    this(CGAL_Spatial_searchingJNI.new_K_neighbor_search_tree_with_info_2__SWIG_1(range), true);
  }

  public void insert(Point_with_info_2 c) {
    CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_insert__SWIG_0(swigCPtr, this, Point_with_info_2.getCPtr(c), c);
  }

  public void insert(Iterator<Point_with_info_2> range) {
    CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_insert__SWIG_1(swigCPtr, this, range);
  }

  public K_neighbor_search_tree_iterator_with_info_2 iterator() {
    return new K_neighbor_search_tree_iterator_with_info_2(CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_iterator(swigCPtr, this), true);
  }

  public void clear() {
    CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_clear(swigCPtr, this);
  }

  public int size() {
    return CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_size(swigCPtr, this);
  }

  public void search(Collection<Point_with_info_2> out, Fuzzy_sphere_with_info_2 fsphere) {
    CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_search__SWIG_0(swigCPtr, this, out, Fuzzy_sphere_with_info_2.getCPtr(fsphere), fsphere);
  }

  public void search(Collection<Point_with_info_2> out, Fuzzy_iso_box_with_info_2 fbox) {
    CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_search__SWIG_1(swigCPtr, this, out, Fuzzy_iso_box_with_info_2.getCPtr(fbox), fbox);
  }

  public void build() {
    CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_build(swigCPtr, this);
  }

  public boolean same_internal_object(K_neighbor_search_tree_with_info_2 other) {
    return CGAL_Spatial_searchingJNI.K_neighbor_search_tree_with_info_2_same_internal_object(swigCPtr, this, K_neighbor_search_tree_with_info_2.getCPtr(other), other);
  }

}
