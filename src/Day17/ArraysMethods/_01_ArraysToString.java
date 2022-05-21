package Day17.ArraysMethods;

import java.util.Arrays;

public class _01_ArraysToString {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[100];

        arrayOfInts[0] = 100;
        arrayOfInts[99] = 9999;

//        to print whole array we use ToString method
        System.out.println(Arrays.toString(arrayOfInts));

    }

}
