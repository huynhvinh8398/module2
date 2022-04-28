package md2.Abstract_interface.Animal_edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animal1 = new Animal[2];
        animal1[0] = new Chicken();
        animal1[1] = new Tiger();
        for (Animal animal : animal1) {
            System.out.println(animal.makeSoud());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit :fruits ) {
            System.out.println(fruit.howtoEat());
        }
    }
}
