package md2.array;

import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name Student: ");
        String students [] = new String[]{"Chistitan","Michael","Camila","Sienna","Tanya","Connor","Zachariah","Mallory","Zoe","Emily"};
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i=0; i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the studens in the list"+ input_name +"is"+i);
                   isExist = true;
                   break;
            }

        }
    if (!isExist){
        System.out.println("Not found"+input_name+"in the list");
    }
    }

}
