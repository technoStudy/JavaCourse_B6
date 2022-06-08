package Day29.PetManagementSystem;

import java.util.Arrays;

public class Fish {

    String color;
    int age;
    String type;
    String[] listOfNeeds;

    Owner owner;


    void printProperties() {
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("List of needs: " + Arrays.toString(listOfNeeds));
    }

}
