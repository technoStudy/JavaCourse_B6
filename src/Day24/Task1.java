package Day24;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    // Task
    // Part 1:
    // create a String[] array of student name in your group, duplicate some names
    // add all the elements from String[] to Set

    // Part 2:
    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, String... elements) {}

    public static void main(String[] args) {

        String[] studentsArray = {"Ozan", "Burcu", "Talal", "Ali", "Gizem", "Gizem"};

        Set<String> studentsSet = new HashSet<>();

        for (int i = 0; i < studentsArray.length; i++)
            studentsSet.add(studentsArray[i]);

        System.out.println(studentsSet);



        Set<String> hashSet = new HashSet<>();

        addAll(hashSet, "TechnoStudy", "Java", "Selenium", "Coding");

        System.out.println(hashSet);

    }


    public static void addAll(Set<String> hashSet, String... elementsToAddSet) {

        for (int i = 0; i < elementsToAddSet.length; i++)
            hashSet.add(elementsToAddSet[i]);

    }

}
