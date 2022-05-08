package md2.abstract_interface.coloreable;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }else {
            System.out.println("Bán kính không hợp lệ!");
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return  Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{color='" + getColor() + "', filled=" + isFilled() +
                ", radius=" + radius +
                '}';
    }
}
