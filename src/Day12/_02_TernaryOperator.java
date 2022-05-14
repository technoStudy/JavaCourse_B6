package Day12;

public class _02_TernaryOperator {

    public static void main(String[] args) {

        int income = 175_000;

        String className = income > 100_000 ? "First Class" : "Enonomy Class";
        System.out.println(className);


//        if (income > 100_000) {
//            System.out.println("First Class");
//        } else {
//            System.out.println("Economy Class");
//        }

    }

}
