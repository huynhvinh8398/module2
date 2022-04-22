package md2.oobJava;


import java.util.Scanner;
    // Tạo lớp QuadraticEquation
public  class quadraticEquation {

    private static double a;
    private static double b;
    private  static double c;
    // định nghĩa phương thức get
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
// định nghĩa phương thức get trả về delta
    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

        //contructor
        public quadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        // định nghĩa phương thức getRoot1 và getRoot2
        public double getRoot1(){
            return  (-this.b+Math.sqrt(this.getDiscriminant()));

        }
        public  double getRoot2(){
        return (-this.b- Math.sqrt(this.getDiscriminant()));
        }
        public double uniqueExqerience(){
        return -this.b/(2*this.a);
        }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 số a,b,c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        quadraticEquation quadratic = new quadraticEquation(a,b,c);
        if (quadratic.getDiscriminant()>0){
            System.out.println("phương trình có 2 nghiệm"+ quadratic.getRoot1()+"and"+ quadratic.getRoot2());
        }else if (quadratic.getDiscriminant()==0){
            System.out.println("phương trình có nghiêm kép"+quadratic.uniqueExqerience());
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }


}