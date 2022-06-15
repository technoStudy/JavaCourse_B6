package Day34.Enums;

public enum Months {

    JANUARY("jan"),
    FEBRUARY("feb"),
    MARCH("mar"),
    APRIL("apr"),
    MAY("may"),
    JUNE("jun"),
    JULY("jul"),
    AUGUST("aug"),
    SEPTEMBER("sep"),
    OCTOBER("oct"),
    NOVEMBER("nov"),
    DECEMBER("dec");

    final String shortname;

    Months(String shortname) {
        this.shortname = shortname;
    }


}
