package Day4.TypeCasting;

public class ImplicitCasting {

    // Implicit Casting (Automatic) - Widening Casting
    // byte -> short -> int -> long -> float -> double

    public static void main(String[] args) {

        byte byteNumber = 10;
        short shortNumber = byteNumber;
        System.out.println(shortNumber);

        short shortNumber2 = 2222;
        int integerNumber = shortNumber2;
        System.out.println(integerNumber);

        // Task | Create a variable integer | convert int to long
        int integerNumber2 = 534231;
        long longNumber = integerNumber2;
        System.out.println(longNumber);


        short x = 5;
        int y = 3 + x;
        System.out.println(y);


        float floatNumber = 5.34F;
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);

        double doubleNumber2 = 5;
        System.out.println(doubleNumber2);

        short toFloat = 8;
        float fromShort = toFloat;
        System.out.println(fromShort);

        int toDouble = 654321;
        double fromInteger = toDouble;
        System.out.println(fromInteger);


        double a = 2.1;
        double b = a + 3; // double b = 2.1 + 3.0;
        System.out.println(b);

    }


}
