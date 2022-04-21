package md2.array;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập số cần chèn vào mảng:");
        int x = scanner.nextInt();

        System.out.println("Nhập vị trí cần chèn:");
        int index = scanner.nextInt();

        insert(arr, x, index);
        System.out.println(Arrays.toString(arr));
    }

    static void insert(int[] arr, int x, int index) {
        if (index >= arr.length - 1 || index <= -1) {
            System.out.println("vị trí cần chèn vượt nằm ngoài phạm vi mảng");
//            return;
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
    }
}

