package Day11.MathClass;

public class MathClassTask {

    //                  TASK
    // Create a random integer between 0-200
    // Create another random integer between 0-500

    // sum 2 integers and print the result

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 200);
        System.out.println("Random Number 1: " + randomNumber);
        int randomNumber2 = (int) (Math.random() * 500);
        System.out.println("Random Number 2: " + randomNumber2);

        int sum = randomNumber + randomNumber2;

        System.out.println(sum);


        // 10 <--------------------> 20
        int randomNumber3 =(int) (Math.random() * 10 + 10);

        // -10 <-------------------> 10 | bigNumber - smallNumber = length
        // 10 - (-10) = 20
        int randomNumber4 = (int) (Math.random() * 20 - 10);
//        -10 <----------------------> 10




    }

}
