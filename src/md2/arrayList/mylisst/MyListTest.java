package md2.arrayList.mylisst;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<String> listNames = new Mylist<>(10);
        listNames.add("a");
        listNames.add("b");
        listNames.add("c");
        listNames.add("d");
        listNames.add(3, "e");
        //  listNames.clear();
        listNames.printMyList();
        listNames.remove(3);
        listNames.printMyList();


        Mylist<Number> listNumber = new Mylist<>(10);
        listNumber.add(1,1);
        listNumber.add(2,2);
        listNumber.add(3,3);
        listNumber.add(4,4);
        listNumber.add(5,5);
        listNumber.printMyList();
        if (listNumber.contains(3)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
        if (listNumber.contains(6)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
    }
}
