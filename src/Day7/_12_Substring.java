package Day7;

public class _12_Substring {

    public static void main(String[] args) {

        String message = "IntelliJ is cool!";

        // to create a substring starting from index 12
        String substring1 = message.substring(12);
        System.out.println(substring1);

        // to create a substring starting from index 2 and ending index 10(index 10 is not included)
        String substring2 = message.substring(2, 10);
        System.out.println(substring2);

    }

}
