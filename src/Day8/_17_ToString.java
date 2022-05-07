package Day8;

import java.awt.*;

public class _17_ToString {

    public static void main(String[] args) {

        Point point = new Point(1,1);
        System.out.println("This is point object: " + point);

        String converted = point.toString();
        System.out.println(converted.contains("x=1,y=1"));

    }

}
