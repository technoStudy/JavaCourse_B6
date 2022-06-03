package Day25;

import java.util.HashSet;

public class _02_SetIsUnordered {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Even though the output is [1, 2, 3]
        // that doesn't mean HashSet is ordered!!!!!
        System.out.println(numbers);

    }

}
