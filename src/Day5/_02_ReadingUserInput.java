package Day5;

import java.util.Scanner;

public class _02_ReadingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String userName = scanner.nextLine();

        System.out.println("What's your age?");
        String userAge = scanner.nextLine();


        System.out.println("Your name: " + userName);
        System.out.println("Your age: " + userAge);

    }

}
