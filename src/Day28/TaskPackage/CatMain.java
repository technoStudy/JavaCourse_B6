package Day28.TaskPackage;

public class CatMain {

    public static void main(String[] args) {

        Cat arya = new Cat();

        arya.eyeColor = "Brown";
        arya.age = 1;

        arya.meow();

        System.out.println("Arya's eye color: " + arya.eyeColor);
        System.out.println("Arya's age: " + arya.age);

        arya.printProperties();

    }

}
