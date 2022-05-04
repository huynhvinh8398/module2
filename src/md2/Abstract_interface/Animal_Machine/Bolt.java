package md2.Abstract_interface.Animal_Machine;

public class Bolt extends Animal implements Barkable,Runable{
    @Override
    String Eat() {
        return "Both eats bones";
    }

    @Override
    String sleep() {
        return "Both sleeps every day";

    }

    @Override
    public String Bark() {
        return "Both bark : gâu gâu";
    }

    @Override
    public String Run() {
        return "Both run very fast ";
    }
}
