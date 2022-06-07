package Day29.RectanglePackage;

public class Rectangle {

    int length;
    int width;

    int perimeter() {
        return (length + width) * 2;
    }

    int area() {
        return length * width;
    }

}
