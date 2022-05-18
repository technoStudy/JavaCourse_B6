package Day15;

import java.util.Scanner;

public class Task5_Continue {

    // get text from the user, print each letter in a new line
    // skip space or semi-column characters

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter input: ");
        String userInput = scanner.nextLine();

        char character;

        for (int i = 0; i < userInput.length(); i++) {
            character = userInput.charAt(i);

            if (character == ' ' || character == ';')
                continue;

            System.out.println(character);
        }

    }

}
