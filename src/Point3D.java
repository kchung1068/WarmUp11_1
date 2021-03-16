public class Point3D extends Point2D {
    private int z;
    public Point3D(int x, int y, int z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }


    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z +  ")";

    }
}

