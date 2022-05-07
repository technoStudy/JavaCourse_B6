package Day8.StringMethodsTasks;

import java.util.Scanner;

public class Task3 {

    //              TASK

    // Get a String from user
    // print the character at index 0

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userText = scanner.nextLine();

        System.out.println(userText.charAt(0));

    }

}
