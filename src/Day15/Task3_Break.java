package Day15;

import java.util.Scanner;

public class Task3_Break {

    // get number from user
    // print from 0 until the number
    // if the count is larger than 10, stop

    // ex: 5 -> 0 1 2 3 4 5
    // ex: 10 -> 0 1 2 3 4 5 6 7 8 9 10
    // ex: 25 -> 0 1 2 3 4 5 6 7 8 9 10


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        for (int i = 0; i <= limit; i++) {

            if (i > 10)
                break;

            System.out.println(i);

        }

    }

}
