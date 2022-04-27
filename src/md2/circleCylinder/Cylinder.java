package md2.circleCylinder;

public class Cylinder extends Circle {
   private double height ;
   // Tạo hàm constructor
    public Cylinder(){

    }
    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height = height;
    }
    // tạo hàm get và set

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + " "+"volume="+getVolume()+
                '}';
    }


}
