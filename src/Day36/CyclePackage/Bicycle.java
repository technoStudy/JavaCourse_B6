package Day36.CyclePackage;

public class Bicycle {

    int gear;
    int speed = 0;

    public Bicycle(int gear) {
        this.gear = gear;
    }

    public void speedUp(int incrementSpeed) {
        speed += incrementSpeed;
    }

    public void applyBreak(int decrementSpeed) {
        if (decrementSpeed > speed)
            speed = 0;
        else
            speed -= decrementSpeed;
    }


}
