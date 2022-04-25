package md2.modifer_static;

public class StaticStudent {
    private int rollno;
    private String name;
    private static String college = "BBDIT";     //biến static
    // contructor

    StaticStudent(int r, String n) {
        rollno = r;
        name = n;
    }

    // tạo static method
    static void change() {
        college = "CODEGYM";
    }

    // phương thức display
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
