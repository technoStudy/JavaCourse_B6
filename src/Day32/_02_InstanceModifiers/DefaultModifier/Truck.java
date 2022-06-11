package Day32._02_InstanceModifiers.DefaultModifier;

public class Truck {

    String truckName;

    Truck(String truckName) {
        this.truckName = truckName;
    }

    void printTruckName() {
        System.out.println(truckName);
    }

    public static void test() {}

}
