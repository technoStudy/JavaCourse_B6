package Day29.CirclePackage;

public class MainCircle {

    public static void main(String[] args) {

        Circle myCircle = new Circle();
        myCircle.radius = 5;
//        myCircle.PI = 10; - PI field is already initialized and it's a constant so we cannot update it

        System.out.println(myCircle.circlePerimeter());
        System.out.println(myCircle.circleArea());

    }

}
