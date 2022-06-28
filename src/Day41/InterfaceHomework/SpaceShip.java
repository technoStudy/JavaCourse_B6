package Day41.InterfaceHomework;

public class SpaceShip implements Vehicle, Flying, Sailing {

    @Override
    public void speed() {
        System.out.println("SpaceShip can speed up to 1000 miles/hour");
    }

    @Override
    public void sail() {
        System.out.println("SpaceShip can also sail!");
    }

    @Override
    public void fly() {
        System.out.println("SpaceShip can fly to stars!");
    }

}
