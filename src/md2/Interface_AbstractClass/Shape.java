package md2.Interface_AbstractClass;

public abstract class Shape {
     abstract double Area();
    abstract double Perimeter();
}
class Circle extends Shape {
    double radius;
    // constructor
    Circle(){
        this.radius =radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double Area() {
        return Math.PI*radius*radius;
    }

    @Override
    double Perimeter() {
        return Math.PI*2*radius;
    }

    public void display() {
        System.out.println("Area: " +Area());
        System.out.println("Perimeter: "+Perimeter());
    }

}
