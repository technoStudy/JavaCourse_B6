package Day5;

import java.util.Scanner;

public class _03_ReadingBooleanInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a cat person? (true or false)");
        boolean catPerson = scanner.nextBoolean();

        System.out.println("You are a cat person -> " + catPerson);

    }

}
