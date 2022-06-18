package Day36.ShapePackage;

public class Demo {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle.radius); // 5
        System.out.println(circle.PI); // 3.14
        System.out.println(circle.area); // 78.15
        System.out.println(circle.perimeter); // 31.4


        Rectangle rectangle = new Rectangle(10, 9);
        System.out.println(rectangle.length); // 10
        System.out.println(rectangle.width); // 9
        System.out.println(rectangle.area); // 90
        System.out.println(rectangle.perimeter); // 38


        Square square = new Square(7);
        System.out.println(square.length); // 7
        System.out.println(square.width); // 7
        System.out.println(square.area); // 49
        System.out.println(square.perimeter); // 28

    }

}
