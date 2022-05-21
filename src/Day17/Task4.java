package Day17;

public class Task4 {

    // declare an array of bytes
    // initialize it with size 3
    // give each element a random value (use random method)
    // print all elements

    public static void main(String[] args) {

        byte[] bytes = new byte[3];

//        WHEN YOU SEE REPEAT LIKE THIS ALWAYS THINK ABOUT LOOP!!!

//        bytes[0] = (byte) (Math.random() * 127);
//        bytes[1] = (byte) (Math.random() * 127);
//        bytes[2] = (byte) (Math.random() * 127);

        // initializing array with random values
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (Math.random() * 127);
        }

        // print array
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

    }

}
