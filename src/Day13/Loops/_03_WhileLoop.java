package Day13.Loops;

import java.util.Scanner;

public class _03_WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int total = 0;

        while (counter < 5) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            total = total + number;
            counter++;
        }

        System.out.println(total);

    }

}
