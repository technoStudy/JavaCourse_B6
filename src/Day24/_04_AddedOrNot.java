package Day24;

import java.util.HashSet;
import java.util.Set;

public class _04_AddedOrNot {

    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(3);
        integerSet.add(9876);
        integerSet.add(35);
        integerSet.add(0);
        integerSet.add(123445);

        // if add method can add the element into set - it will return true
        boolean isAdded = integerSet.add(7);
        System.out.println(isAdded);

        // if add method cannot add the element into set - it will return false
        boolean isAdded2 = integerSet.add(35);
        System.out.println(isAdded2);

        System.out.println(integerSet);

    }

}
