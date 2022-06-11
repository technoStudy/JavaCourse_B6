package Day32._02_InstanceModifiers.PublicModifier;

public class Car {

    public String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public void printCarName() {
        System.out.println(carName);
    }

}
