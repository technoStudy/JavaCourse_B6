package Day33._01_FinalWithPrimitiveTypes;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(2020);
        car1.name = "BMW";

        System.out.println(car1.name);
        System.out.println(car1.YEAR);

        car1.name = "BMW 520i";

//        car1.YEAR = 2022; - this will not work because YEAR is final

        Car car2 = new Car(2005);
        System.out.println(car2.YEAR);

    }

}
