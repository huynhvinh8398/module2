package md2.abstract_interface.animal_edible;

public class Apple extends Fruit{
    @Override
    public String howtoEat() {
        return "táo " + super.howtoEat();
    }
}
