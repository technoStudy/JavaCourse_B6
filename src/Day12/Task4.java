package Day12;

import java.util.Scanner;

public class Task4 {

    /*
         Note: get exam results from user as string

    Write a Java program to evaluate exam result of student

    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail

    For anything else print this is not a valid result
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter exam result: ");
        String examResult = scanner.nextLine().toUpperCase();

        switch (examResult) {

            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "F":
                System.out.println("FAILED!!!!!");
                break;
            default:
                System.out.println("This is not valid result!");

        }


    }

}
