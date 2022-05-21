package Day18;

import java.util.Arrays;

public class _03_MultiDimensionalArray {

    public static void main(String[] args) {

        // 1 dimensional array
        int[] arrayOfOddNumbers = {1, 3, 5, 7, 9}; // list of integers
        int[] arrayOfEvenNumbers = {0, 2, 4, 6, 8};

        int[][] listOfLists = {arrayOfOddNumbers, arrayOfEvenNumbers};

        // 2 dimensional array
        int[][] arrayOfArrays = { {1, 3, 5, 7, 9}, {0, 2, 4, 6, 8} };

        System.out.println(Arrays.deepToString(arrayOfArrays));

//        { {11, 22}, {0, 0}, {0, 0}, {0, 0} }
        int[][] multiDArray = new int[4][2];

        multiDArray[0][0] = 11;
        multiDArray[0][1] = 22;

        System.out.println(Arrays.deepToString(multiDArray));


        // [ {4, 5, 6},  {1, 2, 3},  {7, 8}  ]
        int[][] multiDArray2 = {  {4, 5, 6}, {1, 2, 3}, {7, 8}  }; // new int[3][3]

        System.out.println(multiDArray2[2][0]);

        System.out.println(Arrays.deepToString(multiDArray2));

    }

}
