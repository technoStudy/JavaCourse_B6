package Day13;

public class _01_IfElseRecap {

    public static void main(String[] args) {

//          BASIC STRUCTURE OF IF - ELSE
//        if (condition) {
//            System.out.println("if condition true print this");
//        } else if (anotherCondition) {
//            System.out.println("if another condition true then print this");
//        } else {
//            System.out.println("If all the conditions are false print this");
//        }

        // This is not the ideal way to implement this task (check next class)
        int income = 120_000;
        boolean hasHighIncome;

        if (income > 100_000) {
            hasHighIncome = true;
        } else {
            hasHighIncome = false;
        }

        System.out.println(hasHighIncome);

    }

}
