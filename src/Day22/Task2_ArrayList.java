package Day22;

import java.util.ArrayList;

public class Task2_ArrayList {

    // Create an Integer ArrayList
    // Initialize with random values (loop - Math)
    // Update all the elements with number 5 (loop)

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++)
            integerArrayList.add((int) (Math.random() * 1000));

        System.out.println(integerArrayList);

        for (int i = 0; i < integerArrayList.size(); i++)
            integerArrayList.set(i, 5);

        System.out.println(integerArrayList);

    }

}
