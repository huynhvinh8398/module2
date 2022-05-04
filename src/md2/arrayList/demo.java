package md2.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
     ArrayList <String> list = new ArrayList<String>(); //Cú pháp khai báo 1 arraylist
                                                        // có kiểu là String
        list.add("Huỳnh");
        list.add("Văn");
        list.add("Vinh");
        list.add("balo");
        list.add("alen");
        System.out.println("các phần tử tron list là:" +list);
        //Duyệt các phần tủ trong mảng
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        for (String str : list) {
//            System.out.println(str);
//        }
//        //các phương thức addAll(), removeAll(),retainAll() của lớp ArrayList
//        System.out.println("ví dụ sử dụng phương thức addAll()");
//        // thêm các phần tử của list và listA
//        ArrayList <String> listA = new ArrayList<String>();
//        listA.addAll(list);
//        System.out.println("ListA" + listA);
//        System.out.println("ví dụ sử dụng phương thức retainAll()");
//        //khởi tạo listB
//        ArrayList <String> listB = new ArrayList<String>();
//        listB.add("alo");
//        //Xoá những phần tử không thuộc listB khỏi listA
//        listB.retainAll(listB);
//        System.out.println("listA" +listA);
//        System.out.println("ví dụ sử dụng phương thức removeAll()");
//        // Xoá những phần tử thuộc listB khỏi list
//        list.removeAll(listB);
//        System.out.println("list: " + list);
//        //truy cập phần tử của ArrayList
//        System.out.println(list.get(2));
//        // cập nhật giá trị cho phần tử có chỉ số là 3 (java)
//       list.set(2,"alo");
//       System.out.println("list sau khi cập nhật"+list);
//       // clear list
//       list.clear();
//       // phương thức remove()xoá theo chỉ số và xoá tại giá trị
//        // remove phần tử có chỉ số index =1 ra khỏi list
//        list.remove("văn");

        Collections.sort(list);
        System.out.println("danh sách sắp xếp mảng"+list);
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(2);
        numbers.add(30);
        Collections.sort(numbers);
        System.out.println("danh sách sắp xếp mảng"+numbers);

    }
    }

