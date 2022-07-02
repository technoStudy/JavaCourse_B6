package Day44.StringBufferAndStringBuilder;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("TechnoStudy");

        str.append(" - JAVA"); // Does not return a new object, it'll update existing object!

        System.out.println(str);

        String strConverted = str.toString(); // Can convert StringBuffer into String
        System.out.println(strConverted);

        /**
         * StringBuffer is Synchronized (Thread-Safe)
         * StringBuffer is slower, because it's thread-safe
         */

    }

}
