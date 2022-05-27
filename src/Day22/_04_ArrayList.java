package Day22;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_ArrayList {

    public static void main(String[] args) {

        int[] array = new int[3]; // this is fixed-size array
        array[0] = 10; // initializing elements of array
        array[1] = 20;
        array[2] = 30;
        System.out.println(Arrays.toString(array)); // printing array
        int element = array[1]; // get element from array
        System.out.println(array[0]); // get element from array
        System.out.println(array.length); // get length of array


        // create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // arrayList.add() --- adding elements into arrayList
        arrayList.add(10); // index 0
        arrayList.add(20); // index 1
        arrayList.add(30); // index 2
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(90);

        // arrayList.get(index) --- getting element at a specific index
        int elementAtIndex4 = arrayList.get(4);
        System.out.println(elementAtIndex4);

        // arrayList.add(index, element) --- to add element to specific index
        arrayList.add(0, 100);

        // Printing an ArrayList
        System.out.println(arrayList);

        // Remove element at a specific index
        arrayList.remove(0);
        System.out.println(arrayList);

        // Remove a specific element from ArrayList
        // (will remove the first occurrence of element)
        Integer elementToRemove = 50;
        arrayList.remove(elementToRemove);
        System.out.println(arrayList);

        // arrayList.set(index, newValue)  --- for updating element in a specific index
        arrayList.set(2, 99);
        System.out.println(arrayList);

        // arrayList.size() --- returns the number of elements in the arrayList
        int numberOfElements = arrayList.size();
        System.out.println("Size of ArrayList: " + numberOfElements);

        // arrayList.clear() --- removes all elements from arrayList
        arrayList.clear();
        System.out.println(arrayList);

        // arrayList.isEmpty() --- returns boolean
        // checks if arrayList is empty or not
        boolean isArrayListEmpty = arrayList.isEmpty();
        System.out.println(isArrayListEmpty);

    }

}
