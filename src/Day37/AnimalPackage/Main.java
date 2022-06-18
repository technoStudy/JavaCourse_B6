package Day37.AnimalPackage;

public class Main {

    public static void main(String[] args) {

            Cat cat = new Cat();
            cat.name = "Arya";
            cat.age = 2;

            cat.eat();
            cat.sleep();

            System.out.println("**********************************");

            Dog dog = new Dog();
            dog.name = "Charlie";
            dog.age = 5;

            dog.eat();
            dog.sleep();

    }

}
