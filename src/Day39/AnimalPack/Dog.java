package Day39.AnimalPack;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bone!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is snoring while it's a sleep!");
    }

    @Override
    public void move() {
        System.out.println("Dog is running!");
    }

}
