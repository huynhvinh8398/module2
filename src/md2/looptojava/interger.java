package md2.looptojava;

import java.util.Scanner;

public class interger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Numbers : ");
        int numbers = scanner.nextInt();
        for (int i = 0; i < numbers; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
//                count++ ;
            }
        }
    }

    // kiểm tra nếu trả về true : là số nguyên tố;
//                      false: không phải là sô nguyên tố;
    public static boolean isPrimeNumber(int n) {
        // số nguyên tố nhập vào < 2 kh phải là số nguyên tố;
        if (n < 2) {
            return false;
        }


        // check số nguyên tố khi n >= 2;
        // khai báo N = 2; check số ngto
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}