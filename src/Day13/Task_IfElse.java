package Day13;

import java.util.Scanner;

public class Task_IfElse {

    //                      TASK
    // Take two numbers from the user and print the greatest number

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();


        if (firstNumber != secondNumber) {

            if (firstNumber > secondNumber) {
                System.out.println("The greatest number is: " + firstNumber);
            } else {
                System.out.println("The greatest number is: " + secondNumber);
            }

        }

    }

}
