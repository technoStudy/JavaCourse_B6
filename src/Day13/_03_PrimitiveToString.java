package Day13;

public class _03_PrimitiveToString {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        System.out.println(x + y);

        // Wrapper Class
        String xConvertedToString = Integer.toString(x); // String x = "1";
        String yConvertedToString = Integer.toString(y); // String y = "2";

        System.out.println(xConvertedToString + yConvertedToString);

        byte z = 5;

        String zConvertedToString = Byte.toString(z);

    }

}
