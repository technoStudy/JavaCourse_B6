package Day10;

public class _01_ComparisonOperators {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 2;

        // Equality Operator
        System.out.println(a == b);
        System.out.println(a == c);

        // Inequality Operator
        System.out.println(a != b);
        System.out.println(a != c);

        // Greater than
        System.out.println(a > b);
        System.out.println(c > a);

        // Smaller than
        System.out.println(a < b);
        System.out.println(a < c);

        // Greater than or equal
        System.out.println(a >= b);
        System.out.println(a >= c);

        // Smaller than or equal
        System.out.println(a <= c);
        System.out.println(c <= b);


        boolean aLessThanC = a < c;
        System.out.println(aLessThanC);

    }

}
