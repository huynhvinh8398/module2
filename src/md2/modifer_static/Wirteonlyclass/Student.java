package md2.modifer_static.Wirteonlyclass;

public class Student {
    private String name = "John";
    private String classes = "C02";
    // hàm constructor
    public Student(){

    }
    // Tạo setter
    public  void  setName(String name) {
        this.name = name;
    }
    public void  setClasses(String classes) {
        this.classes=classes;
    }

    public String toString() {
        return ("Student{" + "name='" + name + '\'' + ", classes='" + classes + '\'' + '}');
    }
}
