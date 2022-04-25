package md2.oobJava;
// tạo lớp demoStatic
public class demoStatic {

    public static String name = "ferari";        // khai báo biến static (static property)
    public static String getColor(){                // khai báo phương static (method static)
        return "red";
    }
    static {
        System.out.println("Khối static: hello !");     // khối static
    }
    public static void main(String[] args) {
        System.out.println("Tên xe là: " + demoStatic.name);            // truy xuất biến static
        System.out.println("màu xe: " + demoStatic.getColor());   // gọi phương thức static

    }
}








