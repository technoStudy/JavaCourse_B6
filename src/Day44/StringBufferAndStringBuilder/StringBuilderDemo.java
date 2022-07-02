package Day44.StringBufferAndStringBuilder;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("TechnoStudy");

        str.append(" - Java"); // Does not return a new object, instead it'll update existing object!

        System.out.println(str);

        String strConverted = str.toString();
        System.out.println(strConverted);

        /**
         * String builder is not Thread-safe, but it's faster than StringBuffer
         */

    }

}
