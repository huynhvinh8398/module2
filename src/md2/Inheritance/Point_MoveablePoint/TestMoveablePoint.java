package md2.Inheritance.Point_MoveablePoint;

import java.util.Arrays;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setSpeed(5,6);
        System.out.println(Arrays.toString(moveablePoint.getSpeed()));
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
