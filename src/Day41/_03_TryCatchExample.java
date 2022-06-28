package Day41;

public class _03_TryCatchExample {

    public static void main(String[] args) {

        try {
            int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(numbersArray[15]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("WRONG INDEX");
        }

        System.out.println("Test");

    }
}
