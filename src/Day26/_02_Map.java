package Day26;


import java.util.Collection;
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

        // values() -- method will return all the values from map
        Collection<Integer> values = salaries.values();
        System.out.println("Printing all the values of map: " + values);

        // Printing values one by one
        for (Integer element : values)
            System.out.println(element);

        // size()
        int sizeOfMap = salaries.size();
        System.out.println("Size of Map: " + sizeOfMap);

        // isEmpty
        boolean isEmpty = salaries.isEmpty();
        System.out.println(isEmpty);

        // containsKey() -- return boolean - checks if map contains key or not
        boolean isMapContainsAlex = salaries.containsKey("Alex");
        System.out.println("Map contains \"Alex\": " + isMapContainsAlex);

        // containsValue() -- return boolean - checks if map contains value
        boolean isMapContains500000 = salaries.containsValue(500_000);
        System.out.println("Map contains \"500000\": " + isMapContains500000);

        // clear() -- removes all the entries from map
        salaries.clear();
        System.out.println("Salaries map after clear(): " + salaries);

    }

}
