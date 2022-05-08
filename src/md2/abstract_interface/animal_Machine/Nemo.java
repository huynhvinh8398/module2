package md2.abstract_interface.animal_Machine;

public class Nemo extends Animal implements  Swimable{
    @Override
    String Eat() {
        return "Nemo can eat";
    }

    @Override
    String sleep() {
        return "Nemo sleeps every day";
    }


    @Override
    public String swim() {
        return "Nemo can swimable";
    }
}
