package md2.Abstract_interface.Animal_Machine;

public class Main {
    public static void main(String[] args) {
         Animal [] animals = new Animal[3];
         animals[0] = new Bolt();
         animals[1] = new AngryBird();
         animals[2] = new Nemo();
        for (Animal animal : animals) {
            if(animal instanceof Barkable){
                Barkable barkable = (Bolt) animal;
                System.out.println(barkable.Bark());
                Runable runable = (Bolt) animal;
                System.out.println(runable.Run());
            }
            if (animal instanceof Flyable ){
                Flyable flyable = (Flyable) animal;
                System.out.println(flyable.Flyable());
            }
            if (animal instanceof Swimable){
                Swimable swimable = (Swimable) animal;
                System.out.println(swimable.swim());
            }
        }
        Machine [] machines = new Machine[2];
        machines[0]= new McQueen();
        machines[1] = new Siddeley();
        for (Machine machine: machines){
            if (machine instanceof Runable){
                Runable runable = (Runable) machine;
                System.out.println(runable.Run());
            }
            if (machine instanceof Flyable){
                Flyable flyable = (Flyable) machine;
                System.out.println(flyable.Flyable());
            }

        }
    }
}
