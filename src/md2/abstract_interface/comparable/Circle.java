package md2.abstract_interface.comparable;

public  abstract class Circle {
    private double radius =1.0;
    private String color = "red";
    private boolean filled = false;
      // tạo hàm constructor
      public Circle(double radius) {

      }
    public Circle(double radius,String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {

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
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "Area="+ getArea()+
                '}';
    }
}
