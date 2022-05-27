package Day22;

import java.util.ArrayList;

public class Task1_ArrayList {

    // Create a Double ArrayList
    // Add some Doubles into ArrayList
    // Print all the elements of ArrayList (every element in a new line)

    public static void main(String[] args) {

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        // Adding 6 random doubles into arrayList
        for (int i = 0; i < 6; i++)
            doubleArrayList.add(Math.random() * 100);

        // Printing all the elements of arraylist using loop
        for (int i = 0; i < doubleArrayList.size(); i++)
            System.out.println(doubleArrayList.get(i));

    }

}
