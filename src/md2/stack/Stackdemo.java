package md2.stack;

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("tiger");
        animals.push("dog");
        animals.push("cat");
        animals.push("pig");
        System.out.println("Các phần tử trong Stack" +animals);

    }

}
