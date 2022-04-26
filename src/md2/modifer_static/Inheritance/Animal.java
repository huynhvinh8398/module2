package md2.modifer_static.Inheritance;

public class Animal {
    
    public void eat() {
        System.out.println("động vật có thể ăn");
    }
    public void sleep() {
        System.out.println("động vật có thể ngủ");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("con chó có thể sủa");
    }
}
class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.bark();
    }
}

