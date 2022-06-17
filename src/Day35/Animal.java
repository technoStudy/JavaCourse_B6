package Day35;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("ZzZzZzZzZzZzZz...");
    }

    public void eat() {
        System.out.println("Nom nom nom...");
    }

}
