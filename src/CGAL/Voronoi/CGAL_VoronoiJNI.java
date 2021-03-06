/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Voronoi;
import CGAL.Kernel.Point_3;
import CGAL.Triangulation_3.Delaunay_triangulation_3;
import CGAL.Triangulation_3.Delaunay_triangulation_3_Cell_handle;
public class CGAL_VoronoiJNI {

    static {
      try {
          System.loadLibrary("CGAL_Voronoi");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Voronoi failed to load. \n" + e);
        throw e;
      }
    }
  
  public final static native void get_Voronoi(long jarg1, Delaunay_triangulation_3 jarg1_, long jarg2, Delaunay_triangulation_3_Cell_handle jarg2_, long jarg3, Point_3 jarg3_);
}
