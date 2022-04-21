package md2.oobJava;


import java.util.Scanner;

public  class quadraticEquation {

    private static double a;
    private static double b;
    private  static double c;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 số a,b,c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        quadraticEquation quadratic = new quadraticEquation(a,b,c);
        if (quadratic.getDelta()>0){
            System.out.println("phương trình có 2 nghiệm"+(-b+(Math.sqrt(b*b-4*a*c)/2*a)+"and"+(-b-(Math.sqrt(b*b-4*a*c)/2*a))));
        }else if (quadratic.getDelta()==0){
            System.out.println("phương trình có nghiêm kép"+(-b/2*a));
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
    //contructor
    public quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }
}