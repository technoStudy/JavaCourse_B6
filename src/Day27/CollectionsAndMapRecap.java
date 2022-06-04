package Day27;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsAndMapRecap {

    public static void main(String[] args) {

        // ********************* ArrayList ************************** \\

        // ArrayList is a dynamic-sized array
        // Arraylist maintains insertion order for elements

        // String[] array = new String[10]; -- fixed size!!!!

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("TechnoStudy"); // add element into arraylist
        arrayList.add(0, "Java"); // add element into a specific index
        arrayList.size(); // will return size of arraylist
        arrayList.indexOf("Java"); // will return index of object(element)
        arrayList.isEmpty(); // will return boolean
        arrayList.set(0, "Python"); // will update value in arraylist
        arrayList.remove(0); // will remove element at specific index
        arrayList.get(0); // will return element at specific index
        arrayList.contains("TechnoStudy"); // will return boolean

        System.out.println(arrayList); // will print arrayList


        // ********************* Set ************************** \\

        // Sets are unordered collections
        // Sets don't allow duplicate values

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10); // will add element
        hashSet.add(20);
        hashSet.add(30);
        // hashSet.add(10); - cannot add duplicate values
        // hashSet.add(0, 100) - cannot add element to specific index (no index)
        hashSet.remove(10); // will remove object
        hashSet.isEmpty(); // will return boolean
        hashSet.contains(20); // will return boolean
        hashSet.size(); // will return number of elements in set
        hashSet.clear(); // will remove all the elements

        // TreeSet: Stores elements in natural order (1, 2, 3...) or (A-Z)
        // HashSet: Unordered Set
        // LinkedHashSet: Stores elements in insertion order


        // ********************* Map ************************** \\

        // Maps are key-value paired

        // TreeMap: Using key's natural order
        // HashMap: Unordered map
        // LinkedHashMap: Using insertion order

    }

}
