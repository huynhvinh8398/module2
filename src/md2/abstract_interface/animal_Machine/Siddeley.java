package md2.abstract_interface.animal_Machine;

public class Siddeley extends Machine implements Flyable{
    @Override
    int speedup() {
        return 400;
    }

    @Override
    public String Flyable() {
        return "Siddeley can flyable";
    }
}
