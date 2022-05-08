package md2.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        // hàm add(): thêm 1 phần tử
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("fish");
        animals.add("chicken");
        System.out.println("các phần tử trong ArrayList:" + animals);
        System.out.println("độ dài mảng size: " +animals.size());
        //hàm get():Truy xuất đến các phần tử trong mảng
        String tr = animals.get(2);
        System.out.println("phần tử ở vị trí 2:" + tr);
        //Duyệt các phần tủ trong mảng
        for (String animal : animals) {
            System.out.println(animal);
        }

    }
}

