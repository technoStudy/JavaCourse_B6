package Day17;

public class Task3 {

    //    {"apple", "watermelon", "peach", "strawberry", "kiwi"}
    //    print this array in reverse order (using for loop)


    public static void main(String[] args) {

        String[] fruits = {"apple", "watermelon", "peach", "strawberry", "kiwi"};

        // last index of array = length of array - 1

        // printing elements in index order
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("---------------------");

        // printing array in reverse order
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }

    }

}
