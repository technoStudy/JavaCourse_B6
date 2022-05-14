package Day12;

import java.util.Scanner;

public class _03_SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int roleNumber = scanner.nextInt();

        switch (roleNumber) { // the switch statement will only check equality of case

            case 1:
                System.out.println("You are an ADMIN!");
                break; // after printing, break will move outside of switch
            case 2:
                System.out.println("You are a TEACHER!");
                break;
            case 3:
                System.out.println("You are a STUDENT!");
                break;
            default:
                System.out.println("You are a GUEST!");

        }

        if (roleNumber == 1) {
            System.out.println("You are an ADMIN!");
        } else if (roleNumber == 2) {
            System.out.println("You are a TEACHER!");
        } else if (roleNumber == 3) {
            System.out.println("You are a STUDENT!");
        } else {
            System.out.println("You are a GUEST!");
        }

    }

}
