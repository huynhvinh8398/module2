package md2.array;

import java.util.Scanner;

public class findText {
    public static void main(String[] args) {
        String chuoi;
        char kytu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kì");
        chuoi = scanner.nextLine();

        // duyệt từ đầu đến cuối chuỗi
        for (int i=0;i<chuoi.length(); i++){
        // Nếu kí tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (chuoi.charAt(i) == kytu){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự" +kytu +"trongchuoi"+chuoi+"=" + count);
    }
}
