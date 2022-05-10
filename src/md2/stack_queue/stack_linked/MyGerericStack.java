package md2.stack_queue.stack_linked;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class MyGerericStack<T> {
    private LinkedList<T> stack;
    //phương thức khởi tạo
    public MyGerericStack() {
        stack = new LinkedList();
    }
    // phương thức push
    public void push(T element) {
        stack.addFirst(element);
    }
    //phương thức pop
    public T pop() {
       if (isEmpty()) {
           throw new EmptyStackException();
       }
       return stack.removeFirst();
    }
    //phương thức size
    public int size() {
        return stack.size();
    }
    // phương thức isEmpty
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
