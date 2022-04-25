package md2.modifer_static.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    // constructor
    Circle() {

    }

    Circle(double r, String red) {
        this.radius = r;
    }

    // tạo phương thức
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
