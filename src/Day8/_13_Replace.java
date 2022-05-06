package Day8;

public class _13_Replace {

    public static void main(String[] args) {

        String myString = "Hello World";

        String replacedString = myString.replace('l', '$');
        System.out.println(replacedString);

        String replacedWithHi = myString.replace("Hello", "Hi");
        System.out.println(replacedWithHi);

        System.out.println(myString);

    }

}
