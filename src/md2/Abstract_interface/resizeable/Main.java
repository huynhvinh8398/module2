package md2.Abstract_interface.resizeable;

public class Main
      {
          public static void main(String[] args) {
              Shape[] shapes = new Shape[3];
              shapes[0] = new Circle(2);
              System.out.println("Diện tích hình tròn ban đầu: " + ((Circle) shapes[0]).getArea());
              ((Circle) shapes[0]).resize(3);

              shapes[1] = new Rectangle(2, 4);
              System.out.println("Diện tích hình chữ nhật ban đầu: " + ((Rectangle) shapes[1]).getArea());
              ((Rectangle) shapes[1]).resize(2);

              shapes[2] = new Square(4);
              System.out.println("Diện tích hình vuông ban đầu: " + ((Square) shapes[2]).getArea());
              ((Square) shapes[2]).resize(4);

              for(Shape shape : shapes) {
                  if(shape instanceof Circle){
                      System.out.printf("Diện tích hình tròn sau khi tăng kích thước là:%.2f%n " , ((Circle) shape).getArea());
                  }else if(shape instanceof Rectangle && !(shape instanceof Square)){
                      System.out.printf("Diện tích hình chữ nhật sau khi tăng kích thước là:%.2f%n " , ((Rectangle) shape).getArea());
                  }else {
                      System.out.printf("Diện tích hình vuông sau khi tăng kích thước là:%.2f%n " , ((Square) shape).getArea());
                  }
              }
          }
}
