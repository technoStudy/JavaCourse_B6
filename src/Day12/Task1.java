package Day12;

import java.util.Scanner;

public class Task1 {


    //                  TASK
    // ask number from user between  0  and 5
    // generate a random number between 0 - 5
    // check if the user number and random number are equal
    // if equals print "you win" else "you lose"

    // Note: if number user provide is between 0 - 5 run program, else print "Invalid"


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 5: ");
        int userNumber = scanner.nextInt();

        // 0 <---------------> 6 | 0, 1, 2, 3, 4, 5
        int randomNumber = (int) (Math.random() * 6);


        if (userNumber >= 0 && userNumber <= 5) {

            if (userNumber == randomNumber) {
                System.out.println("You WIN!");
            } else {
                System.out.println("You LOSE! Because random number is: " + randomNumber);
            }

        } else {
            System.out.println("INVALID!");
        }


    }

}
