package md2.stack_queue.stackreverse;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static Stack<Integer> reverseOfInterger() {
        //tạo mảng bằng nhập size và phần tử từ bàn phím
        int size, element;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào kích thước mảng:");
        size = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            element = Integer.parseInt((scanner.nextLine()));
            stack.push(element);
        }
        //Tạo một mảng mới và đưa những phần tử từ mảng đã lấy ra
        //từ stack sang mảng newstack
         Stack<Integer> newStack = new Stack<>();
        for (int i = 0; i < size; i++) {
            newStack.push(stack.pop());
        }

        return newStack;
    }
//    public Stack<String>

    public static void main(String[] args) {
        System.out.println(reverseOfInterger());

    }
}
