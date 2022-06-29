package Day42.CustomExceptions;

public class Demo {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3,4 ,5};

        printArray(numbers, 10);

    }

    public static void printArray(int[] array, int index) {

        if (index >= array.length)
            throw new YouAreWrongBro();

        System.out.println(array[index]);

    }

}
