package Day5;

import java.util.Scanner;

public class _01_UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // letting Java know that we'll read user input and we'll read it from terminal
        String userInput = scanner.nextLine(); // we're asking user the enter text and storing that text inside a String
        System.out.println(userInput);

    }

}
