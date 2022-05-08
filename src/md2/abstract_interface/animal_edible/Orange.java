package md2.abstract_interface.animal_edible;

public class Orange extends Fruit{
    @Override
    public String howtoEat() {
        return "cam "+ super.howtoEat();
    }
}
