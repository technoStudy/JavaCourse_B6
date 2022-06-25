package Day40.CarPackage;

public class Mercedes extends Car implements Diesel {

    public Mercedes(String model, int year) {
        super(model, year);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 5000 miles!");
    }

    @Override
    public void fuelUp() {
        System.out.println("Fuel up every 300 miles!");
    }

}
