package md2.arrayList.mylistthuchanh;

import java.util.Arrays;

public class Mylist <E> {
    // Thuộc tính
    private int size =0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements [];
    // phương thức khởi tạo
    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    //phương thức ensureCapa()
    public void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //phương thức add()
    public void add(E e) {
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    //phương thức get
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index" +i +"Size" + i);
        }
        return (E) elements [i];
    }


}
