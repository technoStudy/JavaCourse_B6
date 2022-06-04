package Day26;

import java.util.ArrayList;
import java.util.Collections;

public class Task_2D_Collections {

    // TASK
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        ArrayList<String> employees = new ArrayList<>();
        Collections.addAll(employees, "Mike", "John", "Emily");

        ArrayList<String> employers = new ArrayList<>();
        Collections.addAll(employers, "Elon Musk", "Bill Gates", "Jeff Bezos");

        ArrayList<String> companies = new ArrayList<>();
        Collections.addAll(companies, "Tesla", "Microsoft", "Amazon");


        Collections.addAll(listOfLists, employees, employers, companies);

        System.out.println(listOfLists);

    }

}
