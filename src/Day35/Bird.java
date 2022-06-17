package Day35;

public class Bird extends Animal {

    double sizeOfWings;
    String color;

    public Bird(String name, int age, String color, double sizeOfWings) {
        super(name, age);
        this.color = color;
        this.sizeOfWings = sizeOfWings;
    }

    public void sing() {
        System.out.println("Bird is singing!");
    }

    public void fly() {
        System.out.println("Bird is flying!");
    }

}
