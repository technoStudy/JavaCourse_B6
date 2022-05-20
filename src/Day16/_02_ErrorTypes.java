package Day16;

public class _02_ErrorTypes {

    public static void main(String[] args) {

        // Compile Time Errors - Syntax Errors

//        name = "Halit"; - Compile Time error --> Data Type missing

        String name = "Halit";

//        System.out.println(Halit); - Compile Time Error --> double quotes are missing

//        System.out.println(Name);  - Java is key sensitive language so "Name" is wrong

//        int number = 5.7;


        // Run Time Error - occurs after you run the code

        String str = "Hello";
        System.out.println(str.charAt(10));

    }

}
