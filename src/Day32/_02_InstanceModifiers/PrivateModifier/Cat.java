package Day32._02_InstanceModifiers.PrivateModifier;

public class Cat {

    private String catName;

    public Cat() {
        catName = "Blah Blah";
    }

    private Cat(String catName) {
        this.catName = catName;
    }

    private void printCatName() {
        System.out.println(catName);
    }

}