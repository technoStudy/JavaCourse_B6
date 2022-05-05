package Day4.TypeCasting;

public class ImplicitCastingTask {

    //                      TASK
    //  Create a variable short | convert short to long   | print long
    //  Create a variable float | convert float to double | print double
    //  Create a variable byte  | convert byte to float   | print float

    public static void main(String[] args) {

        short shortNumber = 120;
        long longNumber = shortNumber;
        System.out.println(longNumber);

        float floatNumber = 543.21F;
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);

        byte byteNumber = 6;
        float floatNumber2 = byteNumber;
        System.out.println(floatNumber2);

    }

}
