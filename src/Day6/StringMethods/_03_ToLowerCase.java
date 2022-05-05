package Day6.StringMethods;

public class _03_ToLowerCase {

    public static void main(String[] args) {

        // Strings are immutable!
        // Which means once you create a String you cannot change the value of it!

        String message = "United States Of AMERICA";

        String lowerCasedMessage = message.toLowerCase();

        System.out.println(lowerCasedMessage);

    }

}
