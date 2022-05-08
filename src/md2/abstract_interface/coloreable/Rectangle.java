package md2.abstract_interface.coloreable;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width , double height){
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        if(width > 0 ){
            this.width = width;
        }else {
            System.out.println("Chiều dài nhập vào không hợp lệ!");
        }
    }

    public void setHeight(double height) {
        if(height > 0 ){
            this.height = height;
        }else {
            System.out.println("Chiều rộng nhập vào không hợp lệ!");
        }
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2 * ( width + height );
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{color='" + getColor() + "',filled=" + isFilled() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
