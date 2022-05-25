package Day20;

public class Task_MethodsWithReturnType_Homework {

//    -1-Create a method which checks if length of string is at least 8 characters,
//    it returns true or false (Return Type should be boolean)
//
//    -2-Create a method which checks if character is letter (Return Type should be boolean)
//
//    -3-Create a method which counts letters in given string (Return Type should be int)
//    example input: "abcde123"
//    example output: 5
//
//    -4-create a method which checks if character is digit (Return Type should be boolean)
//    hint: character >= '0' && character <= '9' (digits)
//
//
//    P.S: Return Type parameters could be different for example:
//    public static boolean method(String str){}
//    you can have a method like this.

    public static boolean checkIfLengthIs8(String str) {
//        boolean is8 = str.length() >= 8;
//        return is8;

        return str.length() >= 8;

    }

    // (a-z) or (A-Z)
    public static boolean checkIfLetter(char character) {
        boolean isLetter = false;
        if ((character >= 'a' && character <= 'z')  || (character >= 'A' && character <= 'Z'))
            isLetter = true;

        return isLetter;
    }


    public static int countLetters(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (checkIfLetter(character))
                count++;
        }
        return count;
    }


    public static boolean isDigit(char character) {
        return (character >= '0' && character <= '9');
    }

}
