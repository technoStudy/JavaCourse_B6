package Day17.ArraysMethods;

import java.util.Arrays;

public class _04_ArraysSort {

    public static void main(String[] args) {

        int[] integerArray = new int[12];
        integerArray[0] = 98;
        integerArray[1] = 667;
        integerArray[2] = 9;
        integerArray[3] = 312;
        integerArray[4] = 9999;
        integerArray[5] = 43;
        integerArray[6] = 111;
        integerArray[7] = 9;
        integerArray[8] = 68;
        integerArray[9] = 398;
        integerArray[10] = 1;
        integerArray[11] = 53;

        System.out.println(Arrays.toString(integerArray));

        Arrays.sort(integerArray);

        System.out.println(Arrays.toString(integerArray));

        System.out.println("Min number in ARRAY: " + integerArray[0]);
        System.out.println("Max number in ARRAY: " + integerArray[integerArray.length-1]);

    }

}
