package Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {

    // Task
    // create list of 5 numbers from user input(you need to get 5 numbers from user input and add them to list)
    // sort the list in reverse order and print it

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

       for (int i = 0; i < 5; i++) {
           System.out.print("Enter a number: ");
           numbers.add(scanner.nextInt());
       }

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

    }

}
