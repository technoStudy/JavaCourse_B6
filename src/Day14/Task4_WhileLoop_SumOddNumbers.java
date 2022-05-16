package Day14;

public class Task4_WhileLoop_SumOddNumbers {

    /*

                            TASK
        Sum all the odd numbers from 1 to 100 (1 + 3 + 5 ....)
        Use While Loop!

     */


    public static void main(String[] args) {

        int counter = 1;
        int total = 0; // 0 + 1 + 3 + 5 .......

        while (counter < 100) {

            total = total + counter;
            counter += 2;

        }

        System.out.println("Total for all the odd number from 1 to 100: " + total);

    }

}
