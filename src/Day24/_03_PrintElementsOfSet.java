package Day24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _03_PrintElementsOfSet {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("D");
        stringSet.add("E");


        // We can print all the elements of Set using -FOR EACH LOOP-
        for (String element : stringSet)
            System.out.println(element);



        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        // printing elements of ArrayList
        for (String element : arrayList)
            System.out.println(element);




        // print following array using for each loop
        int[] array = {7, 4, 9, 2, 5, 1, 8};

        for (int element : array)
            System.out.println(element);


    }

}
