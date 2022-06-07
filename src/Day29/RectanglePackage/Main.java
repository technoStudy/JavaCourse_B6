package Day29.RectanglePackage;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 10;
        rectangle1.width = 9;

        int perimeterOfRectangle1 = rectangle1.perimeter();
        int areaOfRectangle1 = rectangle1.area();

        System.out.println("Perimeter: " + perimeterOfRectangle1);
        System.out.println("Area: " + areaOfRectangle1);

    }

}
