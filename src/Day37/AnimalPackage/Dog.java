package Day37.AnimalPackage;

public class Dog extends Animal {

    // Task
    // Override methods from parent class

    @Override
    public void eat() {
        System.out.println(name + " eating a bone!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " in sleep!");
        System.out.println("ZzZzZzZzZzZz...");
    }

}
