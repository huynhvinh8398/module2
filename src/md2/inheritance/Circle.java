package md2.inheritance;

public class Circle extends Shape {
    private double radius =1.0;

    // tạo hàm constructor
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color,boolean filled){
        super(color, filled);
        this.radius = radius;

    }
    // tạo phương thức set và get

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI* radius*2;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
