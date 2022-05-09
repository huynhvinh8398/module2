package md2.stack;

public class MyStack {
    //Thuộc tính
    private int arr[];
    private int size;
    private int index = 0;
    //phương thức khởi tạo
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    // cài đặt phương thức push()
    public void push (int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    //cài đặt phương thức pop()
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    //cài đặt phương thức size()
    public int size() {
        return index;
    }
    //cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (index==0){
            return  true;
        }
        return false;
    }
    // cài đặt phương thức isFull()
    public boolean isFull() {
        if (index==size){
            return true;
        }
        return false;
    }
}
