package Day4;

public class StringDataType {

    public static void main(String[] args) {

        int number = 3;
        double example = 432.432;
        boolean isOkay = true;

        String schoolName = "Techno Study";

        System.out.println("schoolName");
        System.out.println(schoolName);

        String name = "Halit";
        String lastName = "Kocaaga";

        System.out.println(name);
        System.out.println(lastName);

        System.out.println(name + " " + lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        String question = "How old are you?";
        String answer = "I'm ";
        int age = 25;

        System.out.println(question + "\n" + answer + age);
        // If at least 1 String exist inside parenthesis everything else will be converted to String!

        int number1 = 10;
        int number2 = 20;

        System.out.println(number1 + number2); // Math will happen here

    }

}
