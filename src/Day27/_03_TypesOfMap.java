package Day27;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _03_TypesOfMap {

    public static void main(String[] args) {

        // HashMap -- Unordered Map
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("String1", 100);
        hashMap.put("String2", 200);
        hashMap.put("String3", 300);
        hashMap.put("String4", 400);

        System.out.println(hashMap);


        // TreeMap -- Using Key's natural order to store entries (1, 2, 3..) (A-Z)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Google", 13245532);
        treeMap.put("Apple", 764323245);
        treeMap.put("Microsoft", 786920202);
        treeMap.put("UnitedHealthGroup", 99993921);

        System.out.println(treeMap);


        // LinkedHashMap -- Insertion Order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Z", 5242);
        linkedHashMap.put("F", 1234);
        linkedHashMap.put("A", 4444);
        linkedHashMap.put("K", 8865);

        System.out.println(linkedHashMap);

    }

}
