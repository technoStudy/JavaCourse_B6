package Day7.StringMethodsTasks;

public class Task1 {

    /*

                TASK
    Create 2 Strings:
        firstString = "123456789";
        secondString = "0123456789";


    Part1: find out the length of firstString
    Part2: find out the length of secondString

     */


    public static void main(String[] args) {

        String firstString = "123456789";
        String secondString = "0123456789";

        int lengthOfFirstString = firstString.length();

        System.out.println("Length of First String: " + lengthOfFirstString);

        int lengthOfSecondString = secondString.length();

        System.out.println("Length of Second String: " + lengthOfSecondString);

    }


}
