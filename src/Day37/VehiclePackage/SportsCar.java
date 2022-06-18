package Day37.VehiclePackage;

public class SportsCar extends Vehicle {

    public SportsCar(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void speedUpTo60() {
        System.out.println("Sports car speeding up to 60 in 3 seconds!");
    }

    @Override
    public void breakDownTo0() {
        System.out.println("Sports car breaking to 0 in 4.7 seconds!");
    }

}
