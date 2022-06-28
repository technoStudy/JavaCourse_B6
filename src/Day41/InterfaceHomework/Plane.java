package Day41.InterfaceHomework;

public class Plane implements Vehicle, Flying {

    @Override
    public void speed() {
        System.out.println("Plane can speed up to 500 miles/hour");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying!");
    }

}
