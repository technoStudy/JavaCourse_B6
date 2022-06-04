package Day27;

import java.util.HashMap;

public class _01_MapRecapTask {

    //        HashMap<String, Integer> hashMap = new HashMap<>();
    //        hashMap.put("One", 1);
    //        hashMap.put("Two", 2);
    //        hashMap.put("Three", 3);
    //        hashMap.put("Four", 4);
    //        hashMap.put("Five", 5);

    // Map is given above:
    // check, does this map contain key "Six"
    // if it does not contain key "Six", put as "Six" = 6

    // part 2: check does this map contain key "Three"
    // if it contains key "Three", change the value of it to 33


    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        // Solution 1
        hashMap.putIfAbsent("Six", 6);
        System.out.println(hashMap);

        // Solution 2
        boolean containsKeySix = hashMap.containsKey("Six");
        if (!containsKeySix) {
            hashMap.put("Six", 6);
        }

        // Solution 3 - not recommended
        Integer value = hashMap.get("Six");
        if (value == null) {
            hashMap.put("Six", 6);
        }


        // ****************** PART 2 *********************

        if (hashMap.containsKey("Three")) {
            hashMap.put("Three", 33); // update value for key "Three"
        }


    }

}
