package md2.arrayList.linkedlist;

import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numberNodes=0;

    public class Node {
        private Node next;
        private Object data;
        // phương thức khởi tạo
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public void add(int index, Object data) {
        Node temp =head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numberNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNodes++;
    }
    public void addLast(Object data) {
        if (head==null)
            addFirst(data);
   else {
       Node temp = head;
       while (temp.next != null )
           temp = temp.next;
       temp.next = new Node(data);
   }
    }
//    public void remove(int index) {
//        Node temp = head;
//        for (int i=0; )
//    }
}
