package Day14;

import java.util.Scanner;

public class Task5_WhileLoop {

    // ask the user for pin number
    // if the pin number is incorrect keep asking the user for pin number
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787


    public static void main(String[] args) {

        int correctPin = 8787;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter pin number: ");
        int pinNumber = scan.nextInt();

        while (pinNumber != correctPin) {

            System.out.print("Your input is invalid, please try again: ");
            pinNumber = scan.nextInt();

        }

        System.out.println("You're logged in!");

    }


}
