package Day21;

public class Task1_MethodOverloading {

    //                                      TASK
    // create a multiply method, that takes two integers and returns their product as integer
    // overload multiply method, that takes three integers and returns their product as integer
    // overload multiply method, that takes two doubles and returns their product as double
    // overload multiply method, that takes three doubles and returns their product as double
    // overload multiply method, that takes one double and one integer and returns their product as double
    // overload multiply method, that takes one integer and one double and returns their product as double


    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static int multiply(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }

    public static double multiply(double number1, double number2) {
        return  number1 * number2;
    }

    public static double multiply(double number1, double number2, double number3) {
        return number1 * number2 * number3;
    }

    public static double multiply(double number1, int number2) {
        return number1 * number2;
    }

    public static double multiply(int number1, double number2) {
        return number1 * number2;
    }

}
