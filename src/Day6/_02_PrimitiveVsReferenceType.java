package Day6;

import java.awt.*;

public class _02_PrimitiveVsReferenceType {

    public static void main(String[] args) {

        // Primitive Types are copied by their values
        int x = 3;
        int y = x;  // int y = x's value
                    // int y = 3;

        System.out.println("X before update: " + x); // 3
        System.out.println("Y before update: " + y); // 3

        x = 5;

        System.out.println("X after update: " + x);
        System.out.println("Y after update: " + y);


        Point point = new Point(1, 1);
        Point point2 = point;

        System.out.println("Point before update: " + point);
        System.out.println("Point2 before update: " + point2);

        point.x = 5;

        System.out.println("Point after update: " + point);
        System.out.println("Point2 after update: " + point2);

    }

}
