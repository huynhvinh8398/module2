package md2.modifer_static.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3, "red");
        circle1.getRadius();
        System.out.println("bán kính hình tròn" + circle1.getRadius());
        circle1.getArea();
        System.out.println("dien tích là" + circle1.getArea());
    }
}
