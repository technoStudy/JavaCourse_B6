package Day26;

import java.util.ArrayList;

public class _01_2D_Collections {

    public static void main(String[] args) {

        // 2D Array
        int[][] twoDArray = new int[2][2];


        // This is an ArrayList which can contain String ArrayLists
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

            ArrayList<String> cars = new ArrayList<>();
            cars.add("Toyota");
            cars.add("Tesla");
            cars.add("Ford");

            ArrayList<String> countries = new ArrayList<>();
            countries.add("France");
            countries.add("Argentina");
            countries.add("Mexico");

        listOfLists.add(cars);
        listOfLists.add(countries);

        // Printing 2D ArrayList
        System.out.println(listOfLists);

    }

}
