package md2.array;

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[]{1,2,2,4,5,6};
//
//        int size = arr.length;
//        int n = 5;
//
//        System.out.println("Trước khi xóa: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print("Enter number");
//        int number = scanner.nextInt();
//
//        n = deleteElement(arr, n, number);
//
//        System.out.println("Sau khi xóa: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//    public static int deleteElement(int[] arr, int n, int key) {
//        int position = searchElement(arr, key);
//        if (position == - 1 ) {
//            System.out.println("Không tìm thấy : ");
//        }
//        for (int i = position; i < n; i++) {
//            arr[i] = arr[i + 1];
//        }
//        return n - 1;
//    }
//    public static int searchElement(int[] arr, int x) {
//        for (int i = 0; i < arr.length; i++ ) {
//            if (arr[i] == x) {
//                return i;
//            }
//        }
//        return -1;
//    }
      Scanner scanner = new Scanner(System.in);
      int n,i,c;
      do {
          System.out.println("nhập vào số phần tử của mảng :");
          n = scanner.nextInt();

      } while (n<=0);
          int A[]= new int[n];
        System.out.println("Nhập các phần tử cho mảng :");
        for ( i=0; i<n;i++){
            System.out.print("nhập phần tử thứ"+i+":");
            A[i]= scanner.nextInt();
        }
        System.out.println("Nhập số nguyên k:");
        int k = scanner.nextInt();
           // Xoá phần tử k ra khỏi mảng
          // Vòng lặp for sẽ khởi tạo c= i=0
        // và duyệt i từ 0 đến n
        //nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1
        for (c=i=0;i<n;i++){
            if (A[i] != k) {
                A[c]=A[i];
                c++;
            }
        }
        n=c;   // lúc này số phần tử  trong mảng sẽ bằng c
        // hiển thị các phần tử trong mảng sau khi xoá k
        for (i=0;i<n;i++){
            System.out.print(A[i]+"\t");
        }
      }
}

