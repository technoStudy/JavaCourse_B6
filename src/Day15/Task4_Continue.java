package Day15;

import java.util.Scanner;

public class Task4_Continue {

    // get number from the user, print all the numbers from 0 to the number from user
    // skip even numbers using continue

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter limit: ");
        int limit = scanner.nextInt();

        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }

    }

}
