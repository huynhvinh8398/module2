package md2.looptojava;

import java.util.Scanner;

public class hienThiHinh {
    public static void main(String[] args) {
        int print = 1;
        int height;
        int width;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isossceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter you print: ");
        print = input.nextInt();
//        while (print!=0){
//            System.out.println("Menu");
//            System.out.println("1. Print the rectangle");
//            System.out.println("2. Print the square triangle");
//            System.out.println("3. Print isossceles triangle");
//            System.out.println("4. Enter you print: ");
//            print = input.nextInt();
//
//        }
        Scanner sc = new Scanner(System.in);
//        System.out.print("height = ");
//        height = sc.nextInt();
//        System.out.print("width = ");
//        width = sc.nextInt();
//        for (int i=1; i<=height;i++){
//            for (int j=1; j<=width;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//        sc.close();
   /* vẽ hình tam giác vuông cạnh dưới */
//        System.out.println("\n\nNhap vao chieu cao tam giac: ");
//        height = sc.nextInt();
//        for (int i=1;i<=height;++i){
//            for (int j=1;j<=i;++j){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        /* vẽ hình tam giác vuông ngược*/
        System.out.println("\n\nNhap vao chieu cao tam giac: ");
        height = sc.nextInt();
        for (int i=height;i>=-1;--i){
            for (int j =1; j<=i;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    /* vẽ hình tam giác cân */

    }
}
