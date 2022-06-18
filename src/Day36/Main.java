package Day36;

public class Main {

    public static void main(String[] args) {

        /**
         *
         * Which class is parent class of all classes?
         *
         * methods come from Object class(toString, hashCode...)
         * We don't have these methods in EveryClassExtendsObjectClass
         * but we still have some methods which are coming from Object class
         *
         * ****** Every Java Class inherits from OBJECT class!
         */

        EveryClassExtendsObjectClass e = new EveryClassExtendsObjectClass();

        e.toString();
        e.hashCode();

    }

}
