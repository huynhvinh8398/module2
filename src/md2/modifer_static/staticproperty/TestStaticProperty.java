package md2.modifer_static.staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        car car1 = new car("Mazda 3", "skyactiv 3");
        System.out.println(car.numberOfCars);
        car car2 = new car("Mazda 6", "skyactiv 6");
        System.out.println(car.numberOfCars);
    }
}
