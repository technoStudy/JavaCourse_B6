package Day20;

public class _03_MethodsOverview {

    public static void main(String[] args) {

        int result = sumThreeIntegers(20, 30, 40);
        System.out.println(result);

        int total = sumFourDoubles(5.2, 7.7, 9.4, 4.6);
        System.out.println(total);

    }


    // This method will accept 3 integers as parameters and return the sum of these numbers!
    public static int sumThreeIntegers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }


    // quick task: write method which accepts 4 doubles as parameters
    // and sum these doubles and return the result as integer
    public static int sumFourDoubles(double d1, double d2, double d3, double d4) {
        int sum = (int) (d1 + d2 + d3 + d4);
        return sum;
    }

}
