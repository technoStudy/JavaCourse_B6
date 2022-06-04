package Day26;

import java.util.HashMap;
import java.util.Set;

public class Task_Map {

    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2

    public static void main(String[] args) {

        HashMap<Integer, String> zipAndCity = new HashMap<>();
        zipAndCity.put(7010, "Cliffside Park");
        zipAndCity.put(8536, "Plainboro");
        zipAndCity.put(1234, "Brooklyn");

        Set<Integer> keys = zipAndCity.keySet();

        for (Integer key : keys)
            System.out.println(key + " => " + zipAndCity.get(key));

    }

}
