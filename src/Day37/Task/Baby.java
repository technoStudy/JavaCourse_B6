package Day37.Task;

public class Baby extends Human {

    public Baby(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Babies can only drink milk!");
    }

    @Override
    public void transport() {
        if (age < 1)
            System.out.println("Babies are like plants, they cannot move");
        else
            System.out.println("Baby is crawling!");
    }

}
