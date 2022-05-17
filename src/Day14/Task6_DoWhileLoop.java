package Day14;

public class Task6_DoWhileLoop {

    // print all the odd numbers from 1 to 30 (do-while loop)

    public static void main(String[] args) {

        int counter = 1;

        do {
            System.out.println(counter);
            counter += 2;
        } while (counter < 30);

    }

}
