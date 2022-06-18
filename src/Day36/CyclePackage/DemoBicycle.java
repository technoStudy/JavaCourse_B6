package Day36.CyclePackage;

public class DemoBicycle {

    public static void main(String[] args) {

        RaceBike raceBike = new RaceBike(24, 26);
        System.out.println("RaceBike's gear: " + raceBike.gear);
        System.out.println("Race Bike's wheelSize: " + raceBike.wheelSize);

        raceBike.speedUp(10);
        System.out.println("RaceBike speed after speedUp method: " + raceBike.speed);

        raceBike.applyBreak(3);
        System.out.println("RaceBike speed after applyBreak method: " + raceBike.speed);



        KidsBike kidsBike = new KidsBike(1, 4);
        System.out.println("Kids Bike's gear: " + kidsBike.gear);
        System.out.println("Kids Bike's numberOfWheels: " + kidsBike.numberOfWheels);

        kidsBike.speedUp(3);
        System.out.println(kidsBike.speed);

        kidsBike.applyBreak(2);
        System.out.println(kidsBike.speed);



        ElectricBike electricBike = new ElectricBike(18, "ion battery", 500);
        System.out.println("Electric Bike's gear: " + electricBike.gear);
        System.out.println("Electric Bike's batteryType: " + electricBike.batteryType);
        System.out.println("Electric Bike's batteryCapacity: " + electricBike.batteryCapacity);

        electricBike.speedUp(45);
        System.out.println("Electric Bike speed: " + electricBike.speed);

        electricBike.applyBreak(100);
        System.out.println("Electric Bike speed: " + electricBike.speed);

    }

}
