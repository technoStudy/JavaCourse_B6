package Day34.Enums;

public enum Directions {

    EAST("E", 1),
    WEST("W", 2),
    NORTH("N", 3),
    SOUTH("S", 4);

    final String shortName;
    int number;

    Directions(String shortName, int number) {
        this.shortName = shortName;
        this.number = number;
    }

}
