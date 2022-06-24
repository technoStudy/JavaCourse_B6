package Day38;

public class DemoShape {

    public static void main(String[] args) {

        // Reference types can store its own and sub-types!

        Square square = new Square();           // every square is a square
        Rectangle square2 = new Square();       // every square is a rectangle
        Shape square3 = new Square();           // every square is a shape
        Object square4 = new Square();          // every square is an object

        // Square shape = new Shape();          // every shape is not a square

        square.getShapeName(); // method from Shape class (Grand-Parent)
        square.printArea(); // method from Rectangle class (Parent)
        square.printPerimeter(); // method from Square class


        square3.getShapeName();
        // square3.printArea();          - cannot access child methods
        // square3.printPerimeter();   - cannot access methods from child class

    }

}
