/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_3;

public enum Locate_type {
  VERTEX(0),
  EDGE,
  FACET,
  CELL,
  OUTSIDE_CONVEX_HULL,
  OUTSIDE_AFFINE_HULL;

  public final int swigValue() {
    return swigValue;
  }

  public static Locate_type swigToEnum(int swigValue) {
    Locate_type[] swigValues = Locate_type.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Locate_type swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Locate_type.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Locate_type() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Locate_type(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Locate_type(Locate_type swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

