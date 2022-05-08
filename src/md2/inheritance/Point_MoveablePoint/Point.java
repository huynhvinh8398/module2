package md2.inheritance.Point_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    //tạo hàm constructor
    public Point(){};
    public Point(float x, float y){
        this.x = x;
        this.y =y;
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
        return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
