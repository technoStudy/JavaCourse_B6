package Day28;

public class Dog {

    // Properties of a dog - Fields
    String breed;
    String size;
    int age;
    String color;
    boolean isSleeping;


    // Behaviours of a dog - Methods
    void eat() {
        System.out.println("The dog is eating!");
    }

    void sleep() {
        isSleeping = true;
    }

    void wakeUp() {
        isSleeping = false;
    }

    void snoring() {
        if (isSleeping)
            System.out.println("ZzZzZzZzZzZz......");
    }


}
