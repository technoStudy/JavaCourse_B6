package Day30;

public class Car {

    /**
        Instance Members (Fields and Methods)
            - instance members belongs to objects
            - to access instance members we need to create an object
            - for each object 1 copy (of each instance variable) will be created
     */

    String make;
    String model;
    int year;

    void buyCar() {
        numberOfCarsInInventory++;
    }


    /**
        Static Members
            - static members belongs to class itself
            - to access static fields we need to call with class name
            - there will be only 1 copy for static variables
     */

    static int numberOfCarsInInventory = 0;

    static void printNumberOfCars() {
        System.out.println(numberOfCarsInInventory);
    }

}
