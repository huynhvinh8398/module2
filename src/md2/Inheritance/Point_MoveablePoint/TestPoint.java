package md2.Inheritance.Point_MoveablePoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(4);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point);
    }
}
