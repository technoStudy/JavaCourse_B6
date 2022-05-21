package Day18;

import java.util.Arrays;

public class _01_ArraysRecap {

    public static void main(String[] args) {

        int[] myArray; // array declaration
        myArray = new int[5]; // array initialize

//        [0, 0, 0]
        int[] numbers = new int[3]; // declare and initialize array

        System.out.println(Arrays.toString(numbers));

//        [10, 20, 45, 7, 26]
        int[] ages = new int[5];
        ages[0] = 10; // updating the value at index 0
        ages[1] = 20;
        ages[2] = 45;
        ages[3] = 7;
        ages[4] = 26;

//        System.out.println(ages);  - you cannot print array like this, you need to use Arrays.toString method!
        System.out.println(Arrays.toString(ages));

        // to get value from array --> arrayName[index] -> ages[2]
        System.out.println(ages[3]); // print index 3 at ages array -> 7
        int someonesAge = ages[1]; // initialize a variable with element at index 3 for ages array

//        ["United States", "France", "Canada"]
        String[] countries = new String[3];
        countries[0] = "Unites States";
        countries[1] = "France";
        countries[2] = "Mexico";
//        countries[3] = "Turkey"; - we'll get an exception because there is no such index
        countries[2] = "Canada"; // updating mexico with new value which is Canada

        System.out.println(Arrays.toString(countries));


        // Initialize array with values!
        String[] programmingLanguages = {"Java", "Python", "C#", "JavaScript"};
        programmingLanguages[2] = "C"; // updating value in array

        // in order find size of array(number of elements) we need to use arrayName.length!
        System.out.println(programmingLanguages.length);


        String[] names = {"John", "Mark", "Emily", "Amy", "Halit"};
        int lengthOfNames = names.length;
        int lastIndexOfNames = names.length - 1;

    }

}
