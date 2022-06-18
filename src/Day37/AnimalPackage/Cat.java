package Day37.AnimalPackage;

public class Cat extends Animal {

    /**
     *      - Overriding happens in multiple classes
     *      - To achieve overriding, classes should have parent-child relationship
     *      - When Overriding:
     *          Method name and parameters should be same with super method
     *
     *      ***** We cannot override static methods - static methods belong to class!
     */


    @Override // Annotation
    public void eat() {
        System.out.println("Cat is catching a mouse!");
        System.out.println("Cat is eating the mouse!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping!");
        System.out.println("Don't make any noise, because " + name + " will get angry!");
    }

}
