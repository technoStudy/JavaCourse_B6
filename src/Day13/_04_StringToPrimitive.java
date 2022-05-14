package Day13;

public class _04_StringToPrimitive {

    public static void main(String[] args) {

        String number1 = "12345";
        String number2 = "50";

        System.out.println(number1 + number2);

        int number1ConvertedToInt = Integer.parseInt(number1);
        int number2ConvertedToInt = Integer.parseInt(number2);

        System.out.println(number1ConvertedToInt + number2ConvertedToInt);

        String number3 = "5";
        byte number3ConvertedToByte = Byte.parseByte(number3);

    }

}
