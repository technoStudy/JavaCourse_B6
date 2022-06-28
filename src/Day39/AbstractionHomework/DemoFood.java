package Day39.AbstractionHomework;

public class DemoFood {

    public static void main(String[] args) {

        Baklava baklava = new Baklava();

        baklava.taste();
        baklava.madeIn();

        System.out.println("*************************");

        CheeseCake cheeseCake = new CheeseCake();

        cheeseCake.taste();
        cheeseCake.madeIn();

        System.out.println("*************************");

        GreekSalad greekSalad = new GreekSalad();

        greekSalad.taste();
        greekSalad.madeIn();

        System.out.println("*************************");

        SezarSalad sezarSalad = new SezarSalad();

        sezarSalad.taste();
        sezarSalad.madeIn();

    }

}
