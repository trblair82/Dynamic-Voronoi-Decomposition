/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Plane_3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Plane_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Plane_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Plane_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Plane_3() {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_0(), true);
  }

  public Plane_3(double a, double b, double c, double d) {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_1(a, b, c, d), true);
  }

  public Plane_3(Point_3 p, Point_3 q, Point_3 r) {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_2(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, Point_3.getCPtr(r), r), true);
  }

  public Plane_3(Point_3 p, Vector_3 v) {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_3(Point_3.getCPtr(p), p, Vector_3.getCPtr(v), v), true);
  }

  public Plane_3(Point_3 p, Direction_3 d) {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_4(Point_3.getCPtr(p), p, Direction_3.getCPtr(d), d), true);
  }

  public Plane_3(Line_3 l, Point_3 p) {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_5(Line_3.getCPtr(l), l, Point_3.getCPtr(p), p), true);
  }

  public Plane_3(Ray_3 r, Point_3 p) {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_6(Ray_3.getCPtr(r), r, Point_3.getCPtr(p), p), true);
  }

  public Plane_3(Segment_3 s, Point_3 p) {
    this(CGAL_KernelJNI.new_Plane_3__SWIG_7(Segment_3.getCPtr(s), s, Point_3.getCPtr(p), p), true);
  }

  public double a() {
    return CGAL_KernelJNI.Plane_3_a(swigCPtr, this);
  }

  public double b() {
    return CGAL_KernelJNI.Plane_3_b(swigCPtr, this);
  }

  public double c() {
    return CGAL_KernelJNI.Plane_3_c(swigCPtr, this);
  }

  public double d() {
    return CGAL_KernelJNI.Plane_3_d(swigCPtr, this);
  }

  public Point_3 projection(Point_3 c) {
    return new Point_3(CGAL_KernelJNI.Plane_3_projection__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c), true);
  }

  public void projection(Point_3 c, Point_3 ret) {
    CGAL_KernelJNI.Plane_3_projection__SWIG_1(swigCPtr, this, Point_3.getCPtr(c), c, Point_3.getCPtr(ret), ret);
  }

  public Plane_3 opposite() {
    return new Plane_3(CGAL_KernelJNI.Plane_3_opposite__SWIG_0(swigCPtr, this), true);
  }

  public void opposite(Plane_3 ref) {
    CGAL_KernelJNI.Plane_3_opposite__SWIG_1(swigCPtr, this, Plane_3.getCPtr(ref), ref);
  }

  public Point_3 point() {
    return new Point_3(CGAL_KernelJNI.Plane_3_point__SWIG_0(swigCPtr, this), true);
  }

  public void point(Point_3 ref) {
    CGAL_KernelJNI.Plane_3_point__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public Vector_3 orthogonal_vector() {
    return new Vector_3(CGAL_KernelJNI.Plane_3_orthogonal_vector__SWIG_0(swigCPtr, this), true);
  }

  public void orthogonal_vector(Vector_3 ref) {
    CGAL_KernelJNI.Plane_3_orthogonal_vector__SWIG_1(swigCPtr, this, Vector_3.getCPtr(ref), ref);
  }

  public Line_3 perpendicular_line(Point_3 c) {
    return new Line_3(CGAL_KernelJNI.Plane_3_perpendicular_line__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c), true);
  }

  public void perpendicular_line(Point_3 c, Line_3 ret) {
    CGAL_KernelJNI.Plane_3_perpendicular_line__SWIG_1(swigCPtr, this, Point_3.getCPtr(c), c, Line_3.getCPtr(ret), ret);
  }

  public Direction_3 orthogonal_direction() {
    return new Direction_3(CGAL_KernelJNI.Plane_3_orthogonal_direction__SWIG_0(swigCPtr, this), true);
  }

  public void orthogonal_direction(Direction_3 ref) {
    CGAL_KernelJNI.Plane_3_orthogonal_direction__SWIG_1(swigCPtr, this, Direction_3.getCPtr(ref), ref);
  }

  public Vector_3 base1() {
    return new Vector_3(CGAL_KernelJNI.Plane_3_base1__SWIG_0(swigCPtr, this), true);
  }

  public void base1(Vector_3 ref) {
    CGAL_KernelJNI.Plane_3_base1__SWIG_1(swigCPtr, this, Vector_3.getCPtr(ref), ref);
  }

  public Vector_3 base2() {
    return new Vector_3(CGAL_KernelJNI.Plane_3_base2__SWIG_0(swigCPtr, this), true);
  }

  public void base2(Vector_3 ref) {
    CGAL_KernelJNI.Plane_3_base2__SWIG_1(swigCPtr, this, Vector_3.getCPtr(ref), ref);
  }

  public Point_2 to_2d(Point_3 c) {
    return new Point_2(CGAL_KernelJNI.Plane_3_to_2d__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c), true);
  }

  public void to_2d(Point_3 c, Point_2 ret) {
    CGAL_KernelJNI.Plane_3_to_2d__SWIG_1(swigCPtr, this, Point_3.getCPtr(c), c, Point_2.getCPtr(ret), ret);
  }

  public Point_3 to_3d(Point_2 c) {
    return new Point_3(CGAL_KernelJNI.Plane_3_to_3d__SWIG_0(swigCPtr, this, Point_2.getCPtr(c), c), true);
  }

  public void to_3d(Point_2 c, Point_3 ret) {
    CGAL_KernelJNI.Plane_3_to_3d__SWIG_1(swigCPtr, this, Point_2.getCPtr(c), c, Point_3.getCPtr(ret), ret);
  }

  public Oriented_side oriented_side(Point_3 c) {
    return Oriented_side.swigToEnum(CGAL_KernelJNI.Plane_3_oriented_side(swigCPtr, this, Point_3.getCPtr(c), c));
  }

  public boolean has_on(Point_3 c) {
    return CGAL_KernelJNI.Plane_3_has_on__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_positive_side(Point_3 c) {
    return CGAL_KernelJNI.Plane_3_has_on_positive_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_negative_side(Point_3 c) {
    return CGAL_KernelJNI.Plane_3_has_on_negative_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on(Line_3 c) {
    return CGAL_KernelJNI.Plane_3_has_on__SWIG_1(swigCPtr, this, Line_3.getCPtr(c), c);
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Plane_3_is_degenerate(swigCPtr, this);
  }

  public boolean equals(Plane_3 p) {
    return CGAL_KernelJNI.Plane_3_equals(swigCPtr, this, Plane_3.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Plane_3_toString(swigCPtr, this);
  }

  public Plane_3 clone() {
    return new Plane_3(CGAL_KernelJNI.Plane_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Plane_3 other) {
    CGAL_KernelJNI.Plane_3_clone__SWIG_1(swigCPtr, this, Plane_3.getCPtr(other), other);
  }

}