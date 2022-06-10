package Day30.BankAccount_Task;

public class BankAccount {

    String customerName;
    double customerBalance = 0;

    static double totalBalance = 0;

    void deposit(double moneyToDeposit) {
        customerBalance += moneyToDeposit;
        totalBalance += moneyToDeposit;
    }

    void withdraw(double moneyToWithdraw) {
        customerBalance -= moneyToWithdraw;
        totalBalance -= moneyToWithdraw;
    }

}
