package md2.abstract_interface.animal_Machine;

public class AngryBird extends Animal implements Flyable {
    @Override
    String Eat() {
        return "AngryBird can eat";
    }

    @Override
    String sleep() {
        return "AngryBird sleeps every day";
    }

    @Override
    public String Flyable() {
        return "AngryBird can flyable";
    }
}
