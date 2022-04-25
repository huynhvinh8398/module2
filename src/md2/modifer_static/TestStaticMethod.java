package md2.modifer_static;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticStudent.change(); // gọi phương thức change()
        // Tạo đối tượng
        StaticStudent student1 = new StaticStudent(111, "Hoang");
        StaticStudent student2 = new StaticStudent(222, "Khanh");
        StaticStudent student3 = new StaticStudent(333, "Nam");
        // gọi phương thức display
        student1.display();
        student2.display();
        student3.display();

    }
}
