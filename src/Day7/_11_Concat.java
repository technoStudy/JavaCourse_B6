package Day7;

public class _11_Concat {

    public static void main(String[] args) {

        String message = "Hello " + "World!";
        System.out.println(message);

        String first = "Object ";
        String second = "Oriented ";
        String third = "Programming";

        String combinedString = first.concat(second); // first + second
        System.out.println(combinedString);

        String combineThreeString = first.concat(second.concat(third)); // first + second + third
        System.out.println(combineThreeString);

    }

}
