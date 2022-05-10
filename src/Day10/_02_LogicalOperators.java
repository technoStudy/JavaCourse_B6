package Day10;

public class _02_LogicalOperators {

    public static void main(String[] args) {

        int temperature = 25;
        // When we use "AND" operator both conditions should be true
        boolean isWarm = temperature < 30 && temperature > 20; // AND operator
        System.out.println(isWarm);


        boolean hasHighIncome = false;
        boolean hasGoodCredit = false;
        // When we use "OR" operator if one of the conditions true result will be true
        boolean isEligible = hasHighIncome || hasGoodCredit; // OR operator
        System.out.println(isEligible);

    }

}
