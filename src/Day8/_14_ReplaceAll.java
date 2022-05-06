package Day8;

public class _14_ReplaceAll {

    public static void main(String[] args) {

        // difference between replace and replaceAll
        // replace accepts chars and Strings
        // replaceALl accepts regex(regular expression) - range of characters

        String phoneNumber = "My number is 0123456789324567321304";

        String replacedNumber = phoneNumber.replaceAll("[3-6]", "#");
        System.out.println(replacedNumber);

        String replacedNumber2 = phoneNumber.replaceAll("[0-9]", "*");
        System.out.println(replacedNumber2);

        System.out.println(phoneNumber.replaceAll("[a-z]", "@"));

        // [A-Z]  range of all capital letter
        // [A-z]  range of all letters

    }

}
