import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(1, 2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Arrays.toString(p2.getXY()));
        System.out.println();

        p1.setXY(5, 10);
        p2.setX(5);
        p2.setY(10);
        System.out.println(p1);
        System.out.println(p2);
    }
}
