package Day9;

public class _06_Increment {

    public static void main(String[] args) {

        int x = 1;
//        x = x + 1;
        x++; // same as line 8
        System.out.println(x);

        int y = 1;
        int m = y++; // int m = y; y = y + 1;
        System.out.println(m);
        System.out.println(y);


        int k = 1;
        int l = ++k; // k = k + 1;  int l = k;
        System.out.println(k);
        System.out.println(l);



        int f = 1;
        System.out.println(f); // print 1
        System.out.println(f++); // will print f(1), and then increase value of f by 1
        System.out.println(f); // the result will be 2


        int p = 1;
        System.out.println(p); // print 1
        System.out.println(++p); // increase p by 1, and then print p(2)

    }

}
