package md2.Abstract_interface.Animal_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String howtoEat() {
        return "gà ăn được";
    }

    @Override
    public String makeSoud() {
        return "gà kêu o ó ó";
    }
}
