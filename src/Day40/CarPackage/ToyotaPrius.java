package Day40.CarPackage;

public class ToyotaPrius extends Car implements Diesel, Electric {

    public ToyotaPrius(String model, int year) {
        super(model, year);
    }

    @Override
    public void fuelUp() {
        System.out.println("Fuel up every 600 miles!");
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 10000 miles!");
    }

    @Override
    public void charge() {
        System.out.println("Charger every 2000 miles!");
    }

    @Override
    public void changeBattery() {
        System.out.println("Change battery every 50000 miles!");
    }
}
