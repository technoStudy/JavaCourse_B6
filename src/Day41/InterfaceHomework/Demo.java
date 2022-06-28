package Day41.InterfaceHomework;

public class Demo {

    public static void main(String[] args) {

        Car car = new Car();
        car.speed();

        Train train = new Train();
        train.speed();

        Boat boat = new Boat();
        boat.speed();
        boat.sail();

        Plane plane = new Plane();
        plane.speed();
        plane.fly();

        SpaceShip spaceShip = new SpaceShip();
        spaceShip.speed();
        spaceShip.fly();
        spaceShip.sail();

    }

}
