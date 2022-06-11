package Day32._02_InstanceModifiers.ProtectedModifier;

public class Person {

    protected String name;

    protected Person(String name) {
        this.name = name;
    }

    protected void printPersonName() {
        System.out.println(name);
    }

}
