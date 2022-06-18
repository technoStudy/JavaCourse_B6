package Day36.CyclePackage;

public class ElectricBike extends Bicycle {

    String batteryType;
    int batteryCapacity;
    boolean batteryUsage;
    int batteryLevel;

    public ElectricBike(int gear, String batteryType, int batteryCapacity) {
        super(gear);
        this.batteryType = batteryType;
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(int charge) {
        batteryLevel += charge;
    }

}
