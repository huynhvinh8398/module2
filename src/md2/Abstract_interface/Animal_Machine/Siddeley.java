package md2.Abstract_interface.Animal_Machine;

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
