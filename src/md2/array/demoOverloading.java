package md2.array;

public class demoOverloading {
    public static void main(String[] args) {
        System.out.println(sum (1.0f,2));

    }
    public static int sum (int a, int b){
        return a+b;
    }
    public static double sum (double a, double b){
        return a+b;
    }
}
