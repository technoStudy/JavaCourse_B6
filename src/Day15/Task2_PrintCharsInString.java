package Day15;

import java.util.Scanner;

public class Task2_PrintCharsInString {

    // INTERVIEW QUESTION
    // Write program to print chars from a String

    // 1- Get a String from user
    // 2- Print each char from string

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter input: ");
        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }


//        String str = "Hey"; // length = 3, lastIndex = 2
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));

    }

}
