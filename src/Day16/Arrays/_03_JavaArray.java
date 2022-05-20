package Day16.Arrays;

public class _03_JavaArray {

    public static void main(String[] args) {

        String[] carsArray = new String[5];

        carsArray[0] = "BMW";
        carsArray[1] = "Ford";
        carsArray[2] = "Tesla";
        carsArray[3] = "Honda";
        carsArray[4] = "Mercedes";

        System.out.println(carsArray[0]);
        System.out.println(carsArray[3]);



        String[] studentsArray = {"Mario", "Nigar", "Ali", "Faruk"};

        // updating the value inside Array
        studentsArray[3] = "Talal";

        System.out.println("Size of students array: " + studentsArray.length); // size of Array

    }

}
