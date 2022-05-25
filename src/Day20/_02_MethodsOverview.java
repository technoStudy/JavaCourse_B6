package Day20;

public class _02_MethodsOverview {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        printIntArray(intArray);

        int[] intArray2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printIntArray(intArray2);

        char[] charArray = {'s', 'v', 'L', 'u', 'Y'};
        printCharArray(charArray);

    }


    // we can print any int array using this method
    public static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }


    // quick task: write a method which will print any char array
    public static void printCharArray(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

}
