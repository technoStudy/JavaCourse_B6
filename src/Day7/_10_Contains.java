package Day7;

public class _10_Contains {

    public static void main(String[] args) {

        String message = "Hello World";

        boolean messageContainsH = message.contains("H");
        boolean messageContainsWorld = message.contains("World");
        boolean messageContainsSpace = message.contains(" ");
        boolean messageContainsZ = message.contains("Z");

        System.out.println("String contains 'H' -> " + messageContainsH);
        System.out.println("String contains 'World' -> " + messageContainsWorld);
        System.out.println("String contains ' ' -> " + messageContainsSpace);
        System.out.println("String contains 'Z' -> " + messageContainsZ);

    }

}
