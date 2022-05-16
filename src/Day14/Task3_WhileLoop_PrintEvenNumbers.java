package Day14;

public class Task3_WhileLoop_PrintEvenNumbers {

    /*

                            TASK
        Print all the even numbers from 0 to 100(hundred is not included)
        Use While Loop!

     */

    public static void main(String[] args) {

        int counter = 0;

        while (counter < 100) {
            System.out.println(counter);
            counter += 2;
        }

    }

}
