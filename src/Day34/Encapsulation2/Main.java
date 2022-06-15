package Day34.Encapsulation2;

public class Main {

    public static void main(String[] args) {

        MyPlanet halit = new MyPlanet();
        System.out.println("Halit's planet: " + halit.getPlanet());
        System.out.println("Halit's satellite: " + halit.getSatellite());
        System.out.println("Halit's days in a year: " + halit.getDaysInAYear());


        MyPlanet elon = new MyPlanet();

        System.out.println("Elon's planet: " + elon.getPlanet());
        System.out.println("Elon's satellite: " + elon.getSatellite());
        System.out.println("Elon's days in a year: " + elon.getDaysInAYear());

        elon.setPlanet("Mars");
        elon.setSatellite("Phobos");
        elon.setDaysInAYear(687);

        System.out.println("Elon's planet: " + elon.getPlanet());
        System.out.println("Elon's satellite: " + elon.getSatellite());
        System.out.println("Elon's days in a year: " + elon.getDaysInAYear());

    }

}
