package Day41;

public class _01_WhatAreExceptions {

    public static void main(String[] args) {

        // Throws an exception because you cannot uppercase null value
        sayHello(null);

        // Throws an exception because index 15 is out bound
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbersArray[15]);

        System.out.println("Test");

    }


    public static void sayHello(String name) {
        System.out.println("Hello " + name.toUpperCase());
    }

}
