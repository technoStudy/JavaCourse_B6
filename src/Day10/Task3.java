package Day10;

import java.util.Scanner;

public class Task3 {

    //          TASK
    // Get an integer from user
    // if it is greater than 0 - print POSITIVE
    // if it is equal to 0 - print ZERO
    // if it is less than 0 - print NEGATIVE

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();

        if (userNumber > 0) {
            System.out.println("POSITIVE");
        }

        if (userNumber == 0) {
            System.out.println("ZERO");
        }

        if (userNumber < 0) {
            System.out.println("NEGATIVE");
        }

    }

}
