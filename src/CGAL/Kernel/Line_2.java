/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Line_2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Line_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Line_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Line_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Line_2(double a, double b, double c) {
    this(CGAL_KernelJNI.new_Line_2__SWIG_0(a, b, c), true);
  }

  public Line_2(Point_2 p, Point_2 q) {
    this(CGAL_KernelJNI.new_Line_2__SWIG_1(Point_2.getCPtr(p), p, Point_2.getCPtr(q), q), true);
  }

  public Line_2(Point_2 p, Direction_2 d) {
    this(CGAL_KernelJNI.new_Line_2__SWIG_2(Point_2.getCPtr(p), p, Direction_2.getCPtr(d), d), true);
  }

  public Line_2(Point_2 p, Vector_2 v) {
    this(CGAL_KernelJNI.new_Line_2__SWIG_3(Point_2.getCPtr(p), p, Vector_2.getCPtr(v), v), true);
  }

  public Line_2(Segment_2 s) {
    this(CGAL_KernelJNI.new_Line_2__SWIG_4(Segment_2.getCPtr(s), s), true);
  }

  public Line_2(Ray_2 r) {
    this(CGAL_KernelJNI.new_Line_2__SWIG_5(Ray_2.getCPtr(r), r), true);
  }

  public double a() {
    return CGAL_KernelJNI.Line_2_a(swigCPtr, this);
  }

  public double b() {
    return CGAL_KernelJNI.Line_2_b(swigCPtr, this);
  }

  public double c() {
    return CGAL_KernelJNI.Line_2_c(swigCPtr, this);
  }

  public Point_2 point(int c) {
    return new Point_2(CGAL_KernelJNI.Line_2_point__SWIG_0(swigCPtr, this, c), true);
  }

  public void point(int c, Point_2 ret) {
    CGAL_KernelJNI.Line_2_point__SWIG_1(swigCPtr, this, c, Point_2.getCPtr(ret), ret);
  }

  public Point_2 projection(Point_2 c) {
    return new Point_2(CGAL_KernelJNI.Line_2_projection__SWIG_0(swigCPtr, this, Point_2.getCPtr(c), c), true);
  }

  public void projection(Point_2 c, Point_2 ret) {
    CGAL_KernelJNI.Line_2_projection__SWIG_1(swigCPtr, this, Point_2.getCPtr(c), c, Point_2.getCPtr(ret), ret);
  }

  public double x_at_y(double c) {
    return CGAL_KernelJNI.Line_2_x_at_y(swigCPtr, this, c);
  }

  public double y_at_x(double c) {
    return CGAL_KernelJNI.Line_2_y_at_x(swigCPtr, this, c);
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Line_2_is_degenerate(swigCPtr, this);
  }

  public boolean is_horizontal() {
    return CGAL_KernelJNI.Line_2_is_horizontal(swigCPtr, this);
  }

  public boolean is_vertical() {
    return CGAL_KernelJNI.Line_2_is_vertical(swigCPtr, this);
  }

  public Oriented_side oriented_side(Point_2 c) {
    return Oriented_side.swigToEnum(CGAL_KernelJNI.Line_2_oriented_side(swigCPtr, this, Point_2.getCPtr(c), c));
  }

  public boolean has_on(Point_2 c) {
    return CGAL_KernelJNI.Line_2_has_on(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean has_on_positive_side(Point_2 c) {
    return CGAL_KernelJNI.Line_2_has_on_positive_side(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public boolean has_on_negative_side(Point_2 c) {
    return CGAL_KernelJNI.Line_2_has_on_negative_side(swigCPtr, this, Point_2.getCPtr(c), c);
  }

  public Vector_2 to_vector() {
    return new Vector_2(CGAL_KernelJNI.Line_2_to_vector__SWIG_0(swigCPtr, this), true);
  }

  public void to_vector(Vector_2 ref) {
    CGAL_KernelJNI.Line_2_to_vector__SWIG_1(swigCPtr, this, Vector_2.getCPtr(ref), ref);
  }

  public Direction_2 direction() {
    return new Direction_2(CGAL_KernelJNI.Line_2_direction__SWIG_0(swigCPtr, this), true);
  }

  public void direction(Direction_2 ref) {
    CGAL_KernelJNI.Line_2_direction__SWIG_1(swigCPtr, this, Direction_2.getCPtr(ref), ref);
  }

  public Line_2 opposite() {
    return new Line_2(CGAL_KernelJNI.Line_2_opposite__SWIG_0(swigCPtr, this), true);
  }

  public void opposite(Line_2 ref) {
    CGAL_KernelJNI.Line_2_opposite__SWIG_1(swigCPtr, this, Line_2.getCPtr(ref), ref);
  }

  public Line_2 perpendicular(Point_2 c) {
    return new Line_2(CGAL_KernelJNI.Line_2_perpendicular__SWIG_0(swigCPtr, this, Point_2.getCPtr(c), c), true);
  }

  public void perpendicular(Point_2 c, Line_2 ret) {
    CGAL_KernelJNI.Line_2_perpendicular__SWIG_1(swigCPtr, this, Point_2.getCPtr(c), c, Line_2.getCPtr(ret), ret);
  }

  public boolean equals(Line_2 r) {
    return CGAL_KernelJNI.Line_2_equals(swigCPtr, this, Line_2.getCPtr(r), r);
  }

  public String toString() {
    return CGAL_KernelJNI.Line_2_toString(swigCPtr, this);
  }

  public Line_2 clone() {
    return new Line_2(CGAL_KernelJNI.Line_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Line_2 other) {
    CGAL_KernelJNI.Line_2_clone__SWIG_1(swigCPtr, this, Line_2.getCPtr(other), other);
  }

}