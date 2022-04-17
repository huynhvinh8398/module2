package md2.array;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list1 = new int[4];
        int[] list2 = new int[4];

        System.out.println("Enter input value into array 1: ");

        for (int i = 0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }
        System.out.println("Enter input value into array 2: ");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = scanner.nextInt();
        }
        int i = list1.length + list2.length;
        int[] arr = new int[i];
        int count = 0;
        for (int j = 0 ;j < list1.length; j++) {
            arr[j] = list1[j];
            count++;
        }
        for (int j = 0; j < list2.length ; j++) {
            arr[count++] = list1[j];
        }
        for (int j = 0; j < arr.length ; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}

