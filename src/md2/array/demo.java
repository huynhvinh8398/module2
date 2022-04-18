package md2.array;

public class demo {
public static void selectionSort(int[] arr){
   for (int i=0; i< arr.length-1;i++){
       int min = i;
       for (int j = i + 1; j < arr.length; j++) {
           if (arr[j]<arr[min]){
               min = j;
           }
       }
           int temp = arr[min];
           arr[min] = arr[i];
           arr[i] = temp;
       }
   }
    public static void printArray(int [] arr){
        for(int i: arr){
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,7,3,2,15};
        System.out.println("Trước khi sắp xếp: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Sau khi sắp xếp: ");
        for(int i:arr) {
            System.out.print(i + " ");

        }
    }
}