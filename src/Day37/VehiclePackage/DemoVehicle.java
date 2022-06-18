package Day37.VehiclePackage;

public class DemoVehicle {

    public static void main(String[] args) {

        SportsCar vehicle1 = new SportsCar("Mercedes", "c63", 2019);
        System.out.println(vehicle1.make);
        System.out.println(vehicle1.model);
        System.out.println(vehicle1.year);

        vehicle1.speedUpTo60();
        vehicle1.breakDownTo0();


        System.out.println("***********************************");


        Truck vehicle2 = new Truck("Ford", "F150", 1990);
        System.out.println("Make: " + vehicle2.make + "\n" + "Model: " + vehicle2.model + "\n" + "Year: " + vehicle2.year);

        vehicle2.speedUpTo60();
        vehicle2.breakDownTo0();

    }

}
