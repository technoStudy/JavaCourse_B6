package Day6.StringMethods;

public class _01_StartsWith {

    public static void main(String[] args) {

        String message = "Hello World"; // index always start from 0!!!

        boolean isMessageStartsWithHello = message.startsWith("Hello");
        System.out.println(isMessageStartsWithHello);

        boolean isSecondWordStartsWithW = message.startsWith("W", 6);
        System.out.println(isSecondWordStartsWithW);

    }

}
