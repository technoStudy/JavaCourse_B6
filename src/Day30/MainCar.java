package Day30;

public class MainCar {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2009;

        car1.buyCar();

        Car.printNumberOfCars();


        Car car2 = new Car();
        car2.make = "BMW";
        car2.model = "i8";
        car2.year = 2023;

        car2.buyCar();

        Car.printNumberOfCars();

    }

}
