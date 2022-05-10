package Day9;

public class _07_Decrement {

    public static void main(String[] args) {

        // decrement: decreases value by 1

        int x = 5;
        x--;
        System.out.println(x);

        int y = 10;
        System.out.println(--y);

        int c = 15;
        // post-decrement, value is returned first and then it's decreased by 1
        System.out.println(c--); // print 15
        System.out.println(c);

    }

}
