package Day29.CirclePackage;

public class Circle {

    final double PI = 3.14; // Constant (final variable)
    // when naming constants we use all uppercase letters!!
    double radius;

    double circlePerimeter() {
        return (2 * PI * radius);
    }

    double circleArea() {
        return (PI * Math.pow(radius, 2));
    }

}
