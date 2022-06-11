package Day32._01_AccessModifiersForClasses.PackageTwo;

import Day32._01_AccessModifiersForClasses.PackageOne.Boat;
import Day32._01_AccessModifiersForClasses.PackageOne.Car;
// import Day32._01_AccessModifiersForClasses.PackageOne.Plane;


public class MainOne {

    public static void main(String[] args) {

        Car car = new Car(); // Public

        Boat boat = new Boat(); // Public

//        Not available because it is package-private class,
//        the access modifier is default
//        Plane plane = new Plane();

    }

}
