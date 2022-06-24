package Day38.Polymorphism.CompileTime;

public class Calculation {

    public static void sum(int number1, int number2) {
        System.out.println("Sum of 2 integers: " + (number1 + number2));
    }

    // Overload
    public static void sum(int number1, int number2, int number3) {
        System.out.println("Sum of 3 integers: " + (number1 + number2 + number3));
    }

    // Overload
    public static void sum(double number1, double number2) {
        System.out.println("Sum of 2 doubles: " + (number1 + number2));
    }

    // Overload
    public static void sum(double number1, double number2, double number3) {
        System.out.println("Sum of 3 doubles: " + (number1 + number2 + number3));
    }

}
