package Day10;

import java.util.Scanner;

public class Task2 {

    //          TASK
    // get an int from user
    // if it is greater than 100, print "PASSED"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int userNumber = scanner.nextInt();

        if (userNumber > 100) {
            System.out.println("PASSED");
        }

    }

}
