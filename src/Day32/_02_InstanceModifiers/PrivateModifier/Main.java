package Day32._02_InstanceModifiers.PrivateModifier;

public class Main {

    public static void main(String[] args) {

//        We cannot do this because the constructor is private
//        Cat cat1 = new Cat("Red");

        Cat cat = new Cat();

//        Not Accessible - because field is private
//        cat.catName;

//        Not Accessible - because method is private
//        cat.printCatName();

    }

}
