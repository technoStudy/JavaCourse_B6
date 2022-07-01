package Day43;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorIntro {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("BMW");

        Iterator<String> it = cars.iterator();

        // To get the first element, we use next()
        // System.out.println(it.next());

        // Printing all the elements in ArrayLIst using Iterator
        while (it.hasNext()){
            System.out.println(it.next());
        }



        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(42);
        numbers.add(5);
        numbers.add(10);

        Iterator<Integer> iterator = numbers.iterator();

        // Remove elements from List using Iterator
        while (iterator.hasNext()) {
            if (iterator.next() < 10)
                iterator.remove();
        }

        System.out.println(numbers);



        // **********************************TASK********************************** //

        HashSet<String> names = new HashSet<>();
        names.add("Mike");
        names.add("Steven");
        names.add("Alex");
        names.add("Robin");
        names.add("Amanda");

        // Part1: Using iterator print all the elements 1 by 1
        Iterator<String> setIterator = names.iterator();

        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        // Part2: Iterate over set by using iterator and get every element
        //        If element starts with 'A' then remove element
        Iterator<String> setIterator2 = names.iterator();

        while (setIterator2.hasNext()) {
            if (setIterator2.next().startsWith("A"))
                setIterator2.remove();
        }

        System.out.println(names);

    }

}
