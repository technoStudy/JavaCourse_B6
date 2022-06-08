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


    }

}
