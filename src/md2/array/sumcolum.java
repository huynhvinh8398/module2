package md2.array;

import java.util.Scanner;

public class sumcolum {
    public static void main(String[] args) {
        // khai báo tạo ma trận
       int m,n;
       int sum =0;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cột: ");
        m = scanner.nextInt();
        System.out.print("Nhập vào số hàng :");
        n = scanner.nextInt();
        System.out.print("Nhập vào số cột bất kì :");
        int colum = scanner.nextInt();
        int arr[][]= new int[m][n];
        // in ra ma trận
        for (int i=0; i<m; i++){
            for (int j=0;j<n;j++){
                System.out.print("A["+i+"]"+"["+j+"]"+"=");
                arr[i][j]= scanner.nextInt();
            }
        }
          for (int i=0; i<m;i++){
              for (int j=0; j<n;j++){
                  System.out.print(arr[i][j]+"\t");
              }
              System.out.print("\n");
          }
          // tính tổng cột bất kì
           for (int i=0; i<m;i++){
               for (int j=0; j<n;j++){
                   if (j ==colum){
                       sum+= arr[i][j];
                   }
               }
           }
        System.out.println("Tổng"+ sum);
    }
}
