package Day21;

public class Task2_Varargs {

    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {

        System.out.println(multiply(1.5, 83.9, 7.4, 4.12));

    }


    public static double multiply(double... varargs) {
        double product = 1;
        for (int i = 0; i < varargs.length; i++)
            product *= varargs[i];

        return product;
    }

}
