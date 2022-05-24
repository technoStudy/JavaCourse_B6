package Day19;

public class Task3_MethodReturnTypes {

    // create a method that takes two numbers and returns their product


    public static void main(String[] args) {
        int product = multiplyTwoNumbers(10, 9);
        System.out.println(product);
    }


    public static int multiplyTwoNumbers(int number1, int number2) {
        int product = number1 * number2;
        return product;
    }

}
