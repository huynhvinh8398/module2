package md2.array;

public class smallValueArray {
public static void main(String[] args) {
    int [] arr = {3,5,2,3,7};
    int index = minValue(arr);
    System.out.println("Giá trị nhỏ nhất trong mảng: "+arr[index]);
}
public static int minValue (int [] array){
         int index = 0;
         for (int i = 1 ; i<array.length;i++){
             if (array[i]<array[index]){
                 index = i;
             }
    }
         return index;
}
}