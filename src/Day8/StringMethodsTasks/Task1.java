package Day8.StringMethodsTasks;

public class Task1 {

    //                  TASK

    // Create following String:
    // String hello = "Hi world,Hello world";

    // part1: check string "Hi world,Hello world" starts with "Hi"

    // part2: check whether second part of the string starts with Hello (after comma)

    public static void main(String[] args) {

        String hello = "Hi world,Hello world";

        boolean stringStartsWithHi = hello.startsWith("Hi");
        System.out.println(stringStartsWithHi);

        boolean secondPartStartsWithHello = hello.startsWith("Hello", 9);
        System.out.println(secondPartStartsWithHello);


        // first find index of comma
        int indexOfComma = hello.indexOf(',');

        // for toOffset we say indexOfComma+1 because we want to start after comma
        boolean secondPart = hello.startsWith("Hello", indexOfComma+1);

    }

}
