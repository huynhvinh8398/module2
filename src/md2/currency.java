package md2;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd*23000;
        System.out.print("Giá trị VND:" +quydoi);
        int $for = 1;
    }
}
