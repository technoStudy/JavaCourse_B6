package Day11.MathClass;

public class MathClass {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println(Math.abs(c)); // convert negative number to positive (returns absolute value)

        System.out.println(Math.max(a, b)); // compare two values and return the greatest value
        System.out.println(Math.min(a, b)); // compare two values and return the smallest value


        // round: round direction is automatic - nearest
        System.out.println(Math.round(3.4)); // returns int
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.6));


        // ceil: round direction is always up - bigger
        System.out.println(Math.ceil(7.1)); // returns double
        System.out.println(Math.ceil(7.2));
        System.out.println(Math.ceil(7.9));


        // floor: round direction is always down - smaller
        System.out.println(Math.floor(5.1)); // returns double
        System.out.println(Math.floor(5.999999));


        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(3, 4));


        System.out.println("Random double between 0 and 1: " + Math.random()); // return random double between 0 and 1
//        0 <----------------------> 1

        System.out.println(Math.random() * 100);
//        0 <----------------------> 100

        int randomNumber = (int) (Math.random() * 100); // before converting random double to int you need to multiply
        System.out.println(randomNumber);

    }

}
