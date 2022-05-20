package Day16.Arrays;

public class _01_JavaArrayIntro {

    public static void main(String[] args) {

        // Arrays are fixed-size which means once you define the size
        // of the array you cannot change it!!!!!!!!!!!

        int examResult = 95;

        int variable; // how to declare a variable
        variable = 10; // how to initialize

        // [90, 75, 88, 97, 100]
        int[] examResults = new int[5]; // how to create an Array
        examResults[0] = 90;
        examResults[1] = 75;
        examResults[2] = 88;
        examResults[3] = 97;
        examResults[4] = 100;
//        examResults[5] = 50; we'll get an exception

        // How to print element of an Array
        System.out.println(examResults[0]); // get the element at index 0
        System.out.println(examResults[3]);

    }

}
