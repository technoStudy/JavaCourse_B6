package Day29.PetManagementSystem;

public class MainPet {

    public static void main(String[] args) {

        Bird eagle = new Bird();
        eagle.color = "Grey";
        eagle.age = 10;
        eagle.type = "Bald Eagle";

        eagle.listOfNeeds = new String[3];
        eagle.listOfNeeds[0] = "Water";
        eagle.listOfNeeds[1] = "Meat";
        eagle.listOfNeeds[2] = "Cage";

        eagle.owner = new Owner();
        eagle.owner.name = "Matt";
        eagle.owner.age = 30;
        eagle.owner.gender = "Male";

        eagle.printProperties();
        eagle.owner.printOwnerInfo();




        Fish nemo = new Fish();
        nemo.color = "Orange and White";
        nemo.age = 1;
        nemo.type = "Clownfish";

        nemo.listOfNeeds = new String[2];
        nemo.listOfNeeds[0] = "Food";
        nemo.listOfNeeds[1] = "Father";

        nemo.owner = new Owner();
        nemo.owner.name = "Emma";
        nemo.owner.age = 25;
        nemo.owner.gender = "Female";

        nemo.printProperties();
        nemo.owner.printOwnerInfo();

    }

}
