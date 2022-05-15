package md2.arrayList.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"Melinda");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        list.addLast(8);
        list.remove(5);
        list.printList();
        System.out.println("Index of Melinda is: "+ list.indexOf("Melinda"));

    }
    }

