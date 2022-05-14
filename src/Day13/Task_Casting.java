package Day13;

import java.util.Scanner;

public class Task_Casting {

    // Get 2 numbers from user as a String
    // Convert this numbers to int
    // Sum two integers and print the result

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String number1 = scanner.nextLine();
        System.out.print("Please enter a number: ");
        String number2 = scanner.nextLine();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int sum = num1 + num2;

        System.out.println(sum);

    }

}
