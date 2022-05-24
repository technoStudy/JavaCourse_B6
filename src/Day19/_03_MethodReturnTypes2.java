package Day19;

public class _03_MethodReturnTypes2 {

    public static void main(String[] args) {
        int total = sumOfTwoNumbers(5, 15);
        System.out.println(total);
    }


    public static int sumOfTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

}
