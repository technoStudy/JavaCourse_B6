package Day34.Encapsulation2;

public class MyPlanet {

    private String planet = "Earth";
    private String satellite = "Moon";
    private int daysInAYear = 365;

    // getter - planet field
    public String getPlanet() {
        return planet;
    }

    // getter - satellite field
    public String getSatellite() {
        return  satellite;
    }

    public int getDaysInAYear() {
        return daysInAYear;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }

    public void setDaysInAYear(int daysInAYear) {
        this.daysInAYear = daysInAYear;
    }

}
