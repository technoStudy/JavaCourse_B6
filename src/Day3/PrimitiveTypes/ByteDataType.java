package Day3.PrimitiveTypes;

public class ByteDataType {

    public static void main(String[] args) {

//        int age = 30; - we don't have to use int to store someone's age
        byte age = 30;

        byte myFirstByte = 77;
        byte mySecondByte = -21;

        System.out.println(myFirstByte);
        System.out.println(mySecondByte);

        byte maxValue = 127; // if you put 128, it will make the byte out of range
        byte minValue = -128;

        System.out.println(maxValue);
        System.out.println(minValue);

    }

}
