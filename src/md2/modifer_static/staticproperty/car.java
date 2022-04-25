package md2.modifer_static.staticproperty;

public class car {
    private String name;
    private String engine;
    public static int numberOfCars;

    // contructor
    public car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

}
