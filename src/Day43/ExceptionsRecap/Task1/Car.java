package Day43.ExceptionsRecap.Task1;


public class Car {

    public void buy(CarCondition carCondition) throws Exception {
        if (carCondition.equals(CarCondition.OLD) || carCondition.equals(CarCondition.WASTE)) {
            throw new Exception("You can't buy this car it's waste!");
        }
    }


    public void drive(String weather) {
        if (weather.equalsIgnoreCase("normal")) {
            System.out.println("You can drive the car");
        } else {
            throw new RuntimeException("You can't drive the car in this weather!");
        }
    }

}
