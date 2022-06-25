package Day39.AnimalPack;

public class DemoAnimal {

    public static void main(String[] args) {

//        Animal animal = new Animal();

        Animal animal1 = new Cat("Red", 2);
        animal1.eat();
        animal1.sleep();
        animal1.move();

        System.out.println("************************");

        Animal animal2 = new Dog("Jackie", 5);
        animal2.eat();
        animal2.sleep();
        animal2.move();


    }

}
