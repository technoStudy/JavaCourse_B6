package Day19;

public class Task4_PrintArray {

    // Create a method which takes String array as a parameter
    // and prints all the elements

    public static void main(String[] args) {
        String[] cars = {"BMW", "Toyota", "Honda", "Lexus", "Tesla"};
        printArray(cars);
    }


    // I can print any String Array using this method
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
