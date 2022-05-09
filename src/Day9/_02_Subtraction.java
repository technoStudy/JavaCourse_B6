package Day9;

public class _02_Subtraction {

    public static void main(String[] args) {

        // Subtraction using only values
        System.out.println(5 - 2);

        int x = 55;
        int y = 33;

        // Subtraction using only variables
        System.out.println(x - y);

        int result = x - y;
        System.out.println(result);

        // Subtraction using variable and value
        System.out.println(x - 10);

        // put "-" in the beginning of your variable, you'll get negative value
        System.out.println(-result);

        // java will convert ints into strings!!!
        System.out.println("result: " + x + y); // Math will not happen here!!!

    }

}
