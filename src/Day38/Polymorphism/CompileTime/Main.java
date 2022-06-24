package Day38.Polymorphism.CompileTime;

public class Main {

    public static void main(String[] args) {

        /**
         * Compile Time Polymorphism (Static Polymorphism)
         *      -Achieved by "METHOD OVERLOADING"
         */

        Calculation.sum(5, 9);              // sums 2 integers
        Calculation.sum(6, 13, 17);         // sums 3 integers
        Calculation.sum(33.586, 12.7);      // sums 2 doubles
        Calculation.sum(8.4, 1.98, 4.44);   // sums 3 doubles

    }

}
