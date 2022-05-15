package md2.throww;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int data = 5 / 0;
        } catch (ArithmeticException e) {
            //In ra màn hình tên ngoại lệ
            System.out.println(e);
        }
        System.out.println("Phép chia cho 0");
    }
    }

