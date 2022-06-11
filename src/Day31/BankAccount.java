package Day31;

public class BankAccount {

    // Constructor : is a special method which is used to initialize objects!

    // Every class has a constructor even if we did not create any (default constructor)
    // Constructor will always have the same name with the class!

    String customerName;
    int customerSSN;
    String customerAddress;
    double customerBalance = 0;

    static double totalBalance = 0;

    public BankAccount(String customerName, int customerSSN) {
        this.customerName = customerName;
        this.customerSSN = customerSSN;
    }

    void deposit(double moneyToDeposit) {
        customerBalance += moneyToDeposit;
        totalBalance += moneyToDeposit;
    }

    void withdraw(double moneyToWithdraw) {
        customerBalance -= moneyToWithdraw;
        totalBalance -= moneyToWithdraw;
    }

}
