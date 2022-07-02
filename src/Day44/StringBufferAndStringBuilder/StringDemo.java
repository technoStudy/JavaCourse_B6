package Day44.StringBufferAndStringBuilder;

public class StringDemo {

    public static void main(String[] args) {

        String str = "TechnoStudy";

        // string methods returns new String object instead of updating the String
        str.toUpperCase(); // this method will not update original String (str) because Strings are immutable!

        System.out.println(str);

    }

}
