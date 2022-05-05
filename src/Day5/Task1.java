package Day5;

import java.util.Scanner;

public class Task1 {

    // Ask user to enter their hometown and print out

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Where is your hometown?");
        String userHometown = scanner.nextLine();

        System.out.println("Your hometown: " + userHometown);

    }

}
