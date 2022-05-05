package Day7;

public class _07_LastIndexOf {

    public static void main(String[] args) {

        String message = "Hello from TechnoStudy";

        int indexOfO = message.indexOf('o'); // 4

        int indexOfLastO = message.lastIndexOf('o'); // 16

        System.out.println("Index of first O letter " + indexOfO);
        System.out.println("Index of last O letter " + indexOfLastO);

    }

}
