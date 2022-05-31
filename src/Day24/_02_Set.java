package Day24;

import java.util.HashSet;
import java.util.Set;

public class _02_Set {

    public static void main(String[] args) {

        // Creating Set
        Set<Integer> integerSet = new HashSet<>();

        // Adding elements into Set (Cannot store duplicate values)
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(10);

        // Printing Set
        System.out.println(integerSet);

        // set.size() -- returns number of elements in Set
        System.out.println("Size of Set: " + integerSet.size());

        // set.isEmpty() -- checks if the set is empty or not
        System.out.println("Is Set empty? " + integerSet.isEmpty());

        // set.contains() -- returns boolean
        System.out.println("Is Set contains number 10? " + integerSet.contains(10));

        // set.remove(object)
        integerSet.remove(20);
        System.out.println(integerSet);

        // set.clear()
        integerSet.clear();
        System.out.println(integerSet);

        // set.get(1); DON"T HAVE GET METHOD IN SET

    }

}
