package md2.oobJava;

import sun.nio.cs.FastCharsetProvider;

// Tạo lớp Fan
public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // getter cho các thuộc tính
    public int getSLOW() {
        return this.SLOW;
    }

    public int getMEDIUM() {
        return this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public double getRadius() {
        return this.radius;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public String getColor() {
        return this.color;
    }

    // setter cho các thuộc tính
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // phương thức khởi tạo mặt định
    public Fan() {

    }

    // phương thức toString()
    public String toString() {
        return ("speed:"
                + speed + "color:"
                + color + "radius:"
                + radius
                + (isOn() ? "fan is on" : "fan is off"));
    }

    //viết chương trình khởi tạo đối tượng
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();
        System.out.println(fan2.toString());
    }
}
