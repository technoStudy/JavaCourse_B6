package Day5;

import java.util.Scanner;

public class _04_ReadingNumericInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int userInt = scanner.nextInt();

        System.out.println("Integer from user: " + userInt);


        System.out.println("Please enter a byte");
        byte userByte = scanner.nextByte();

        System.out.println("Byte from user: " + userByte);

    }

}
