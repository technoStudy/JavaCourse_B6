package Day26;

import java.util.HashMap;
import java.util.Set;

public class _02_Map {

    /**

        * In Map data is stored in Key-Value format
        * Key cannot be duplicated, values can be duplicated!

     */

    public static void main(String[] args) {

        // Map contains Employee Name and Salary Information
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 110_000);
        salaries.put("Mike", 115_000);
        salaries.put("Rita", 140_000);
        salaries.put("Emily", 95_000);
        salaries.put("John", 135_000); // This is duplicated key, we cannot duplicate keys in MAP!
        salaries.put("Alex", 140_000); // This is duplicated value, we can store duplicated values in MAP!


        System.out.println("Salaries map: " + salaries);


        // putIfAbsent() -- will add a new entry if key doesn't exist
        // if the exists in that scenario it'll not update value
        salaries.putIfAbsent("Halit", 75_000);
        System.out.println(salaries);
        salaries.putIfAbsent("Rita", 300_000);
        System.out.println(salaries);


        // get() -- can access values by their keys
        System.out.println("Alex's salary: " + salaries.get("Alex"));

        // keySet() -- method will return all the keys from map
        Set<String> keys = salaries.keySet();

        // Printing all the values of Map
        for (String key : keys)
            System.out.println(key + " = " + salaries.get(key));

    }

}
