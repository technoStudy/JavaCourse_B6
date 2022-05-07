package Day8.StringMethodsTasks;

public class Task2 {

    //              TASK
    // Create the following string:
    // String message = "Hello, how are you?";

    // check whether message String is a question or not!

    public static void main(String[] args) {

        String message = "Hello, how are you?";

        boolean isMessageAQuestion = message.endsWith("?");

        System.out.println(isMessageAQuestion);

    }

}
