package md2.abstract_interface.animal_Machine;

public class McQueen extends  Machine implements Runable{
    @Override
    int speedup() {
        return 200;
    }

    @Override
    public String Run() {
        return "McQueen run very fast";
    }
}
