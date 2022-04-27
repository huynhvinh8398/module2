package md2.Inheritance.Point2D_3D;

import java.util.Arrays;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    // tạo hàm constructor
    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Tạo phương thức get và set
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
//       float array [] = {x,y};
//       return array;
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y + "Array =: " + Arrays.toString(getXY()) +
                '}';
    }
}
