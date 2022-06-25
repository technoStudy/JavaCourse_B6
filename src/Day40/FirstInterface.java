package Day40;

public interface FirstInterface {

    /**
     * "public" keyword is unnecessary, because all methods by default public
     * "abstract" keyword is unnecessary, because all methods by default abstract
     *
     * All methods in Interface is abstract
     *
     * We cannot create objects of Interfaces
     *
     * All variables in Interfaces are by default "public", "static" and "final"
     *
     * When you inherit from Interface you must Override(Implement) all the methods!!!
     *
     */


    // public keyword is unnecessary
    public void method();

    // abstract keyword is unnecessary
    abstract void method2();

    void method3();  // -> public abstract void method3();


    public int number = 1;
    static boolean isTrue = true;
    final double decimalNumber = 5.5;

    char character = 'T';  // -> public static final char character = 'T';


    /**
     - Like Abstract classes, Interfaces cannot be used to create objects!
     - Interface methods do not have body (body provided by "implementing" class!
     - On implementation of Interface all methods should be Overridden

     - An Interface cannot have a constructor!
     - Interfaces cannot be declared as private or protected!
     */

}
