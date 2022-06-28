package Day42.ExceptionTypes;

import java.util.Scanner;

public class UncheckedExceptions {

    public static void main(String[] args) {

        String str = "TechnoStudy";

        Scanner scanner = new Scanner(System.in);
        int lastIndex = scanner.nextInt();

        // Unchecked Exceptions appears on Runtime!
        // System.out.println(str.charAt(20)); - No compile error

        try {
            for (int i = 0; i < lastIndex; i++)
                System.out.println(str.charAt(i));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("The index you enter is not valid, you can enter only up to 11!");
        }

    }

}
