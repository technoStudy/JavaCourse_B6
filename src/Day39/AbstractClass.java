package Day39;

public abstract class AbstractClass {

    /**
     *      ABSTRACT KEYWORD
     *          1- Abstract classes cannot be used to create objects!
     *          2- Abstract classes can have both abstract and non-abstract methods!
     *          3- Abstract methods don't have body BUT will require when inherited!
     */

    public void nonAbstractMethod() {
        System.out.println("Non abstract");
    }

    // Abstract methods don't have body!
    public abstract void abstractMethod();


    // Cannot create private abstract methods!
    // private abstract void privateAbsMethod();

    // Cannot create final abstract methods!
    // final public abstract void finalAbsMethod();

    // Cannot create static abstract methods!
    // public static abstract void staticAbsMethod();

}
