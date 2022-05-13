package Day11;

public class _02_IfElseIf {

    // If the temp > 30, print hot
    // If the temp >= 18 && <= 30, print good weather
    // If the temp < 18, print cold

    public static void main(String[] args) {

        int temp = 5;

        if (temp > 30) {
            System.out.println("It's a hot day!");
        } else if (temp >= 18 && temp <= 30) {
            System.out.println("It's a good weather!");
        } else {
            System.out.println("It's a cold day!");
        }

    }

}
