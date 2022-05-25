package Day20;

public class Task_VoidMethods_Homework {

//    ||This Part Should be in Main Method||
//
//     -Create an array of size 5, assign some random values from 1 to 10
//     -(use random class and for loop to assign values)
//
//
//    ||You should create public static void methods for each (Parameter should be int Array for methods)||
//
//     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
//     -2-Create a method that prints the sum of an array
//     -3-Create a method that prints the max element of an array
//
//    P.S: Return type should be void because we are not returning anything just printing

    public static void main(String[] args) {

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++)
            intArray[i] = (int) (Math.random() * 10) + 1;

        printArray(intArray);
        System.out.println();
        sumOfArray(intArray);
        maxElementOfArray(intArray);

    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum: " + sum);
    }


    public static void maxElementOfArray(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue)
                maxValue = arr[i];
        }
        System.out.println("max: " + maxValue);
    }

}
