package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class _02_ArraysRecap {

    public static void main(String[] args) {

        String[] arrayOfCars = {"Tesla", "Toyota", "Lexus", "Nissan", "Porsche"};

        System.out.println(arrayOfCars[0]); // Tesla
        System.out.println(arrayOfCars[1]); // Toyota
        System.out.println(arrayOfCars[2]); // Lexus
        System.out.println(arrayOfCars[3]); // Nissan
        System.out.println(arrayOfCars[4]); // Porsche

        // printing all elements using loop
        for (int i = 0; i <= arrayOfCars.length-1; i++)
            System.out.println(arrayOfCars[i]);



        int[] randomNumbers = new int[5];
//        randomNumbers[0] = (int) (Math.random() * 500);
//        randomNumbers[1] = (int) (Math.random() * 500);
//        randomNumbers[2] = (int) (Math.random() * 500);
//        randomNumbers[3] = (int) (Math.random() * 500);
//        randomNumbers[4] = (int) (Math.random() * 500);

        // initialize array with random values
        for (int i = 0; i <= randomNumbers.length-1; i++)
            randomNumbers[i] = (int) (Math.random() * 500);


        // Task
        // Create an int array with the size of 5
        // Initialize elements of Array by getting the values
        // from user

        int[] myIntArray = new int[5];

        Scanner scanner = new Scanner(System.in);

//        myIntArray[0] = scanner.nextInt();
//        myIntArray[1] = scanner.nextInt();
//        myIntArray[2] = scanner.nextInt();
//        myIntArray[3] = scanner.nextInt();
//        myIntArray[4] = scanner.nextInt();

        for (int i = 0; i <= myIntArray.length-1; i++) {
            System.out.print("Please enter a number: ");
            myIntArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(myIntArray));

    }

}
