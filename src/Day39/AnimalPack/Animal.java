package Day39.AnimalPack;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

}
