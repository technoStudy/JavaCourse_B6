package Day25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _01_TypesOfSet {

    public static void main(String[] args) {

        // HashSet -- Unordered Collection - Doesn't allow duplicates
        HashSet<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("France");
        countries.add("Turkey");
        countries.add("China");
        countries.add("Germany");
        countries.add("Mexico");
        countries.add("France");

        System.out.println(countries);


        // LinkedHashSet -- maintains insertion order - Doesn't allow duplicates
        LinkedHashSet<String> countriesLinkedHashSet = new LinkedHashSet<>();
        countriesLinkedHashSet.add("USA");
        countriesLinkedHashSet.add("France");
        countriesLinkedHashSet.add("Turkey");
        countriesLinkedHashSet.add("China");
        countriesLinkedHashSet.add("Germany");
        countriesLinkedHashSet.add("Mexico");
        countriesLinkedHashSet.add("France");

        System.out.println(countriesLinkedHashSet);


        // TreeSet -- ordered - it stores elements in ascending order - Doesn't allow duplicates
        TreeSet<String> countriesTreeSet = new TreeSet<>();
        countriesTreeSet.add("USA");
        countriesTreeSet.add("France");
        countriesTreeSet.add("Turkey");
        countriesTreeSet.add("China");
        countriesTreeSet.add("Germany");
        countriesTreeSet.add("Mexico");
        countriesTreeSet.add("France");

        System.out.println(countriesTreeSet);

    }

}
