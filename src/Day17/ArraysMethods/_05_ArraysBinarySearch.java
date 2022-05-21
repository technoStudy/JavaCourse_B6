package Day17.ArraysMethods;

import java.util.Arrays;

public class _05_ArraysBinarySearch {

    public static void main(String[] args) {

        // if you want to use binarySearch Array should sorted

        int[] numbers = {12, 43, 5, 22, 33, 86};

        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers, 12));

    }

}
