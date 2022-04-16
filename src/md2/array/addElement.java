package md2.array;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int size = 20;
        int[] arr = new int[size];
        arr[0] = 3;
        arr[1] = -6;
        arr[2] = 4;
        arr[3] = 2;
        arr[4] = 5;
        int n = 3;
        System.out.println("Enter number");
        int x = scanner.nextInt();

        System.out.println("Enter index you want intersting");
        int index = scanner.nextInt();
        System.out.println("Truoc khi Thêm:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static int insert(int[] arr, int size, int n, int x, int index) {
        if (n >= size) {
            return n;
        }
        if(index < 0 || index > n) {
            return n ;
        }
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];

        }
        arr[index] = x;
        return n + 1;
    }
}

