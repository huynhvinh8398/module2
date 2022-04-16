package md2.array;

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        arr[0] = 6;
        arr[1] = 4;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 4;
        arr[5] = 1;
        arr[6] = 2;
        arr[7] = 1;
        int size = arr.length;
        int n = 8;

        System.out.println("Trước khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("Enter number");
        int number = scanner.nextInt();

        n = deleteElement(arr, n, number);

        System.out.println("Sau khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
    public static int deleteElement(int[] arr, int n, int key) {
        int position = searchElement(arr, key);
        if (position == - 1 ) {
            System.out.println("Không tìm thấy : ");
        }
        for (int i = position; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

