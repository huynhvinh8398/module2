package md2.circleCylinder;

public class Circle {
    private double radius;
    private String color;
    // tạo hàm constructor
    public  Circle() {

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    // tạo phương thức set và get
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


}
