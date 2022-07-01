package Day43.ExceptionsRecap.Task2;

public class StaticMethodClass {

    public static void main(String[] args) {

        System.out.println(returnFirstChar("Hey"));
        System.out.println(returnFirstChar("")); // index out of bound exception
        System.out.println(returnFirstChar(null)); // null pointer exception

    }

    public static char returnFirstChar(String str) {

        char firstCharacter = '0';

        try {
            firstCharacter = str.charAt(0);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("You cannot enter empty String! Returning 0!");
        } catch (NullPointerException ex) {
            System.out.println("You cannot enter null value! Returning 0!");
        }

        return firstCharacter;

    }

}
