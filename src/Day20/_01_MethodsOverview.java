package Day20;

public class _01_MethodsOverview {

    public static void main(String[] args) {

        String str = "TechnoStudy";
        str.length(); // this method returns integer value
        str.charAt(4); // this method accepts index as a parameter and returns char value


        printFive(); // this method will print 5 in the console
        printNumber(20);
        returnNumber(9);

    }


    public static void printFive() { // this method does not return a value
        System.out.println(5);       // this method has no parameters
    }

    public static void printNumber(int number) { // this method has "int number" as a parameter
        // int number = 20;
        System.out.println(number);
    }

    public static int returnNumber(int number) {
        return number;
    }

}
