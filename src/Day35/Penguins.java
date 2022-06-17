package Day35;

// Penguins class is a child class of Animal class
public class Penguins extends Animal {

//    String name;  - coming from parent class
//    int age;      - coming from parent class
    int weight;
    int height;

    public Penguins(String name, int age, int weight) {
        super(name, age); // call parent constructor
        this.weight = weight;
    }

}
