package Day38.Polymorphism.Task;

public class Animal {

    public void run() {
        System.out.println("Animal is running!");
    }

    public void run(int meters) {
        System.out.println("Animal is running " + meters + " meters!");
    }

    public void run(int units, String unit) {
        System.out.println("Animal is running " + units + " " + unit);
    }

    public void makeSound() {}

}
