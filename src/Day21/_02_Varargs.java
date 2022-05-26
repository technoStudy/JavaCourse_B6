package Day21;

public class _02_Varargs {

    public static void main(String[] args) {

        sum(5, 10, 20, 30, 40, 50);

    }

    public static int sum(int... varargs) { // A variable argument represented by (...) three dots!
        // int[] varargs = {5, 10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < varargs.length; i++)
            sum += varargs[i];

        return sum;
    }



/**     Instead of using all the overloaded methods below we can use varargs, check the method above!!!  **/

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

}
