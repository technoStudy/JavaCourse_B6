package Day15;

public class _03_ContinueKeyword {

    public static void main(String[] args) {
        // i = 6
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue; // continue will move to next iteration

            System.out.println(i); // when i = 5 this part of the code will be skipped
        }

    }

}
