package md2.oobJava;
// khởi tạo lớp Car
public class Car {
    public String namecar;
    public String color;
    public int speed;

    // tạo lớp contrustor
    public Car(String namecar, String color, int speed) {
        this.namecar = namecar;
        this.color = color;
        this.speed = speed;

    }

    //khởi tạo 1 đối tượng Car
    public static void main(String[] args) {
        Car car1 = new Car("lambogini","red",200);
        System.out.println("namecar:"+ car1.namecar +" "+ "color:"+car1.color+" "+"speed:"+car1.speed);
    }

}











