package Day38.Polymorphism.Task;

public class DemoAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Horse();

        animal1.makeSound();

        animal2.makeSound();

        animal3.makeSound();

        System.out.println("********************************");

        animal1.run();

        animal1.run(10);

        animal1.run(20, "miles");

    }

}