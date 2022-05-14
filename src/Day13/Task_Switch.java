package Day13;

import java.util.Scanner;

public class Task_Switch {

    //         TASK
    // get number from the user
    // print "ok" if number is 5
    // print "maybe" if number is 3
    // print "no" if number is 1
    // print "dunno" if anything else
    // use switch case


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = scanner.nextInt();

        switch (num) {

            case 5:
                System.out.println("OK");
                break;
            case 3:
                System.out.println("Maybe");
                break;
            case 1:
                System.out.println("No");
                break;
            default:
                System.out.println("Dunno");

        }

    }


}
