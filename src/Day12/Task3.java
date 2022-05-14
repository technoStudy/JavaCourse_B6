package Day12;

import java.util.Scanner;

public class Task3 {

    //                          TASK
    // if temperature is less than 15 set message to "Cold Weather" otherwise set it to "Good Weather"
    // USE TERNARY OPERATOR
    // get temperature from user


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        int temp = scanner.nextInt();

        String message = temp < 15 ? "Cold Weather" : "Good Weather";
        System.out.println(message);

    }

}
