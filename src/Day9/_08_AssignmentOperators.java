package Day9;

public class _08_AssignmentOperators {

    public static void main(String[] args) {

        int x = 1; // simple assignment of value
        int y = x; // assignment of variable X's value to y


        x = x + 4; // assigning new value to X, old value of x plus 4
        System.out.println(x);

        int z = 1;
        z += 4; // z = z + 4; | increase value of z by 4

        int k = 10;
        k += 10; // k = k + 10; | increase value of k by 10
        System.out.println(k);


        int j = 35;
        j -= 25; // j = j - 25; | decrease value of j by 25
        System.out.println(j);

        int l = 1;
        l -= 2; // l = l - 2; | decrease value of l by 2
        System.out.println(l);

        int a = 10;
        a *= 5; // a = a * 5; | multiply value of a by 5
        System.out.println(a);

        int b = 90;
        b /= 9; // b = b / 9; | divide value of b by 9
        System.out.println(b);

        int p = 99;
        p %= 10; // p = remainder from division 99/10
        System.out.println(p);

    }

}
