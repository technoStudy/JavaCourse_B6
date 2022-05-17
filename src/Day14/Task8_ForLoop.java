package Day14;

public class Task8_ForLoop {

    // write a java program which calculates the sum of numbers [0 to 5];
    // using for-loop

    // 0 + 1 + 2 + 3 + 4 + 5

    public static void main(String[] args) {

        int sum = 0;

//        sum = sum + 0;
//        sum = sum + 1;
//        sum = sum + 2;
//        sum = sum + 3;
//        sum = sum + 4;
//        sum = sum + 5;

        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

    }


}
