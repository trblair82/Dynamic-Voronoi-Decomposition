/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polyhedron_3;

  import CGAL.Kernel.Point_3;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Polyhedron_3_Point_iterator implements   Iterable<Point_3>, Iterator<Point_3>  {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Polyhedron_3_Point_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polyhedron_3_Point_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Polyhedron_3JNI.delete_Polyhedron_3_Point_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Point_3> iterator() {
      return this;
    }
    
    //we store an object of type Point_3 to avoid
    //creation and allocation of a java object at each iteration.
    private Point_3 objectInstance = new Point_3();
    public Point_3 next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Polyhedron_3_Point_iterator() {
    this(CGAL_Polyhedron_3JNI.new_Polyhedron_3_Point_iterator(), true);
  }

  public Point_3 slow_next() {
    return new Point_3(CGAL_Polyhedron_3JNI.Polyhedron_3_Point_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Point_3 r) {
    CGAL_Polyhedron_3JNI.Polyhedron_3_Point_iterator_next(swigCPtr, this, Point_3.getCPtr(r), r);
  }

  public boolean hasNext() {
    return CGAL_Polyhedron_3JNI.Polyhedron_3_Point_iterator_hasNext(swigCPtr, this);
  }

}
