package Day32._01_AccessModifiersForClasses.PackageOne;

public class MainVehicles {

    public static void main(String[] args) {

        // You can access public and default classes inside same package

        Car car = new Car(); // Public Access Modifier (class)

        Boat boat = new Boat(); // Public Access Modifier (class)

        Plane plane = new Plane(); // Default Access Modifier (class)

    }

}
