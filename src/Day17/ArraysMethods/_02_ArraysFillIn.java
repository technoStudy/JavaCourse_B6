package Day17.ArraysMethods;

import java.util.Arrays;

public class _02_ArraysFillIn {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Arrays.fill(numbers, 99); // change all the values with 99

        System.out.println(Arrays.toString(numbers));



        String[] names = new String[5];

        System.out.println(Arrays.toString(names));

        Arrays.fill(names, "John"); // it will fill your array with "John" values

        System.out.println(Arrays.toString(names));

    }

}
