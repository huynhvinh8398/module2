package md2.Abstract_interface.Animal_Machine;

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
