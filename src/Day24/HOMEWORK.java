package Day24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HOMEWORK {

    // Homework
    // create an arrayList of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(3);


        int duplicateCount = 0;

        Set<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> duplicatedValues = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            boolean isAdded = hashSet.add(arrayList.get(i));
            if (!isAdded) {
                duplicateCount++;
                duplicatedValues.add(arrayList.get(i));
            }
        }

        System.out.println("Number of duplicated values: " + duplicateCount);
        System.out.println("Duplicated Values: " + duplicatedValues);

    }


    /**
     [1, 3, 1, 5, 4, 2, 3] -> arrayList
     [1, 3, ] -> hashSet


     */

}
