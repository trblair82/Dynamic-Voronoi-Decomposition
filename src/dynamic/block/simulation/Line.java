/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic.block.simulation;

import java.util.ArrayList;

/**
 * @author Koen Samyn
 */
public class Line {
    public static void intersectPlane(ArrayList<Intersection> result,
            float3 lp1, float3 lp2, float3 p1, float3 p2, float3 p3)
    {
        float3 e1 = float3.Subtract(p2,p1);
        float3 e2 = float3.Subtract(p3, p1);

        float3 normal = float3.Cross(e1,e2);
        intersectPlane(result, lp1,lp2,p1,normal);
    }

    public static void intersectPlane(ArrayList<Intersection> result,
            float3 lp1, float3 lp2, float3 p1, float3 normal)
    {
        float3 ldir = float3.Subtract(lp2,lp1);
        float numerator = float3.Dot(normal,ldir);
        if ( Math.abs(numerator) > 0.000001f)
        {
            float3 p1tolp1 = float3.Subtract(p1,lp1);
            float t = float3.Dot(normal, p1tolp1) / numerator;
            float3 intersection = float3.LinearCombination(1, lp1, t, ldir);
            result.add( new Intersection( intersection, t));
        }
    }
}


