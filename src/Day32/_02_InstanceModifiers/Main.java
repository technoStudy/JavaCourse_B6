package Day32._02_InstanceModifiers;

import Day32._02_InstanceModifiers.DefaultModifier.Truck;
import Day32._02_InstanceModifiers.PublicModifier.Car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Tesla");

        System.out.println(car.carName);

        car.printCarName();

        Truck.test();
//        We cannot access - because constructor is package-private (default)
//        Truck truck = new Truck("F150");

    }

}
