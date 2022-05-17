package Day14;

import java.util.Scanner;

public class _03_DoWhileLoop {

    public static void main(String[] args) {

        int correctPin = 8787;

        Scanner scanner = new Scanner(System.in);
        int pinNumber;

        do {
            System.out.print("Please enter pin number: ");
            pinNumber = scanner.nextInt();
        } while (pinNumber != correctPin);

        System.out.println("You're logged in!");

    }

}
