/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Polygon_2_Vertex_iterator implements   Iterable<Point_2>, Iterator<Point_2>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Polygon_2_Vertex_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polygon_2_Vertex_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Polygon_2_Vertex_iterator(swigCPtr);
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
  
  public Polygon_2_Vertex_iterator() {
    this(CGAL_KernelJNI.new_Polygon_2_Vertex_iterator(), true);
  }

  public Point_2 slow_next() {
    return new Point_2(CGAL_KernelJNI.Polygon_2_Vertex_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Point_2 r) {
    CGAL_KernelJNI.Polygon_2_Vertex_iterator_next(swigCPtr, this, Point_2.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_KernelJNI.Polygon_2_Vertex_iterator_hasNext(swigCPtr, this);
  }

}
