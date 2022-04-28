package md2.Abstract_interface.Animal_edible;

public class Orange extends Fruit{
    @Override
    public String howtoEat() {
        return "cam "+ super.howtoEat();
    }
}
