package Day39.AnimalPack;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping 16 hours a day!");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving quietly!");
    }

}
