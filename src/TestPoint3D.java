import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(1, 2, 3);
        System.out.println(p1);
        System.out.println(Arrays.toString(p2.getXYZ()));

        System.out.println();
        p1.setXYZ(5, 10, 15);
        p2.setXY(5, 10);
        p2.setZ(15);
        System.out.println(p1);
        System.out.println(p2);
    }
}
