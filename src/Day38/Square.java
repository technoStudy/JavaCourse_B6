package Day38;

public class Square extends Rectangle {

    @Override
    String getShapeName() {
        return "Square";
    }

    @Override
    void printShapeName() {
        System.out.println("Square");
    }

    @Override
    void printArea() {
        System.out.println("10");
    }

    void printPerimeter() {
        System.out.println("10");
    }

}
