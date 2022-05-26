package Day21;

public class _01_MethodOverloading {

        /*

        Method Overloading: Method overloading is a concept in Java which we can
        create multiple methods with SAME NAME(but different parameters) in SAME CLASS
        and all method can work in different ways!

         */

    public static void main(String[] args) {

        System.out.println("Sum of 2 integers: " + sum(10, 20));
        System.out.println("Sum of 3 integers: " + sum(10, 20, 30));

        System.out.println("Sum of 2 doubles: " + sum(5.6, 4.1));
        System.out.println("Sum of 3 doubles: " + sum(5.3, 11.8, 0.98));

//        sum(5, 10, 15, 20) -> we cannot do this because we don't have overloaded method for 4 parameters!
    }


    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    public static double sum(double number1, double number2, double number3) {
        return number1 + number2 + number3;
    }

}
