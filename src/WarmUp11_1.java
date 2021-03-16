/*
 * Create a Point2D class below the has two private integer fields x and y.
 * Allow the user to specify the values of x and y at instantiation
 * time. Create a toString method that will print out the point as (x,y)
 *
 * Now create a Point3D class below that will inherit from the Point2D class
 * and add a new private integer field named z. Allow the user to specify
 * the values of x, y and z at instantiation time. Create a toString method
 * that will print out the point as (x,y,z)
 */
public class WarmUp11_1 {
    public static void main(String args[])
    {
        Point2D point2D = new Point2D(5,8);
        System.out.println(point2D);
        Point3D point3D = new Point3D(4,8,2);
        System.out.println(point3D);

    }
}
