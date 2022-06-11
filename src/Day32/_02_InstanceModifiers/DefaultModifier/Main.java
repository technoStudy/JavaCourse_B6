package Day32._02_InstanceModifiers.DefaultModifier;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck("F150");

        System.out.println(truck.truckName);

        truck.printTruckName();

    }

}
