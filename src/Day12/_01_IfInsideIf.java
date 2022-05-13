package Day12;

public class _01_IfInsideIf {

    public static void main(String[] args) {

        boolean hasHighIncome = true;
        int creditScore = 790;

        if (hasHighIncome) {

            if (creditScore > 740) {
                System.out.println("You are eligible for loan!");
            } else {
                System.out.println("Your credit score is not good enough for loan!");
            }

        } else {
            System.out.println("You are not eligible for loan!");
        }

    }

}
