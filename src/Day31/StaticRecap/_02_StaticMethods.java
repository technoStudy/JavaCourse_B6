package Day31.StaticRecap;

public class _02_StaticMethods {

    int nonStatic = 10;
    static int staticNumber = 20;

    public static void staticMethod() {
//        System.out.println(nonStatic); - this will give an error because we cannot access non-static fields without objects!!
        System.out.println(staticNumber); // Able to access because it is a static field!
//        nonStaticMethod(); - this will give an error because we cannot access non-static methods without objects!!
        staticMethod2(); // Able to access because this is a static method!
    }

    public static void staticMethod2() {
        System.out.println("This is a static method!");
    }

    public void nonStaticMethod() {
        staticMethod2(); // static method available
        nonStaticMethod2(); // non-static method available
        System.out.println(nonStatic); // non-static variable available
        System.out.println(staticNumber); // static variables available
    }

    public void nonStaticMethod2() {
        System.out.println("Non Static");
    }

}
