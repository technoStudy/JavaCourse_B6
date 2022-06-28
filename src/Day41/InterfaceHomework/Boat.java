package Day41.InterfaceHomework;

public class Boat implements Vehicle, Sailing {

    @Override
    public void speed() {
        System.out.println("Boat can speed up to 50 miles/hour");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing!");
    }

}
