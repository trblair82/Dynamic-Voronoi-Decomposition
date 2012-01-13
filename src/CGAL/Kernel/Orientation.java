/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public enum Orientation {
  NEGATIVE(-1),
  RIGHT_TURN(-1),
  CLOCKWISE(-1),
  ZERO(0),
  COPLANAR(0),
  COLLINEAR(0),
  LEFT_TURN(1),
  COUNTERCLOCKWISE(1),
  POSITIVE(1);

  public final int swigValue() {
    return swigValue;
  }

  public static Orientation swigToEnum(int swigValue) {
    Orientation[] swigValues = Orientation.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (Orientation swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + Orientation.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private Orientation() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private Orientation(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private Orientation(Orientation swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
