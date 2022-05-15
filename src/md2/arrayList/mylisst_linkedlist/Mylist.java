package md2.arrayList.mylisst_linkedlist;

import java.util.Arrays;

public class Mylist<E> {
    private int size;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];
     //phương thức khởi tạo 2 lớp
    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public Mylist(int capacity) {
        elements  = new Object[capacity];
    }
    // phương thức kiểm tra add
    public boolean add(E element) {
        if (size == elements.length) {
            return false ;
        }
        elements[size++] = element; //  elements[size] = element , sau do size+=1 ;
        return true ;
    }
    //phương thức add
    public void add(int index, E element) {
        checkIndex(index);
        if(size == elements.length){
            ensureCapacity();
        }
//        if(size != elements.length){
//            System.arraycopy(elements, index, elements, index+1, size-index);
//        }
//        elements[index] = element;
//        size++;
        for (int i = size; i > index; i--)
            elements[i] = elements[i - 1];
        elements[index] = element;
        size++;
    }
    public void ensureCapacity() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

//    @Override
//    public Mylist clone() {
//        Mylist<E> clone = new Mylist<E>(elements.length);
//        for (E e : (E[]) elements) {
//            clone.add(e);
//        }
//        return clone;
//    }
   //phương thức tìm kiếm chuỗi kí tự có trả true k có trả về false
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }
    //phương thức trả về vị trí nếu k có trả về -1
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return i;
        return -1;
    }
//phương thức trả về chỉ số cuối của kí tự k tìm thấy trả về -1
    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }


    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) elements[index]; // vi moi element la  1 object
    }

    public void printMyList() {
        int i = 0;
        for (E e : (E[]) elements) {
            System.out.println("Element " + i + " : " + e);
            i++;
        }
    }

    }


