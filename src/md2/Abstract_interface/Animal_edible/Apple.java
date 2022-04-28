package md2.Abstract_interface.Animal_edible;

public class Apple extends Fruit{
    @Override
    public String howtoEat() {
        return "táo " + super.howtoEat();
    }
}
