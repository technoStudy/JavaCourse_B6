package Day42;

import java.util.Scanner;

public class Task {

    // Using scanner get a number from user as a String
    // Convert this String number into an Integer
    // Handle possible exceptions

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String userInput = scanner.nextLine();

        try {
            int userNumber = Integer.parseInt(userInput);
            System.out.println(userNumber);
        } catch (NumberFormatException ex) {
            System.out.println("Your input is invalid!");
        }

    }

}
