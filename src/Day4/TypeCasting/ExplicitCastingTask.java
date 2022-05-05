package Day4.TypeCasting;

public class ExplicitCastingTask {

    public static void main(String[] args) {

        //     TASK1
        double a = 5.3;
        // int b = 5 + a;
        int b = 5 + (int) a;
        System.out.println(b);



        //     TASK2
        int student1 = 80;
        int student2 = 95;
        int student3 = 33;
        int student4 = 71;

        // Find the exact average for students grades!
        // with using slash "/" we can do division

//        int average = (80 + 95 + 33 + 71) / 4; -> int average = 279 / 4 = 69
//        int average = (student1 + student2 + student3 + student4) / 4;
//        this is not the exact average

//        double average = (80 + 95 + 33 + 71) / 4; double average = 69.0
//        double average = (student1 + student2 + student3 + student4) / 4;

//        double average = 279.0 / 4.0; -> 69.75
        double average = (double) (student1 + student2 + student3 + student4) / 4;
//        System.out.println(average);



    }

}
