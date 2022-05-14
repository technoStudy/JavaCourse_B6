package Day13.Loops;

import java.util.Scanner;

public class Task2 {

    // get limit from user
    // write a java program which calculates the sum of numbers [0 to limit];
    // using while-loop

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter limit: ");
        int limit = scn.nextInt();

        int counter = 0;
        int total = 0;

        while (counter <= limit) {
            total = total + counter;
            counter++;
        }

        System.out.println(total);

    }

}
