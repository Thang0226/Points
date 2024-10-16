public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {super.getX(), super.getY(), this.getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.setZ(z);
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.getZ() + ")";
    }
}
