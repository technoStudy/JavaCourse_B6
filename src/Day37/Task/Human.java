package Day37.Task;

public class Human {

    String name;
    String gender;
    int age;

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println("Human is eating");
    }

    public void transport() {
        System.out.println("Human is transporting");
    }

}
