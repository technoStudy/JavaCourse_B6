package Day19;

public class Task2_MethodParameters {

    // Create a method that takes two numbers (as parameters) and prints out their sum
    // sumOfTwoNumbers(10, 20); -> 30

    public static void main(String[] args) {
        sumOfTwoNumbers(10, 20);
    }


    public static void sumOfTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Sum: " + sum);
    }

}
