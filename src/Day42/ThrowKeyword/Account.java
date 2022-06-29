package Day42.ThrowKeyword;

public class Account {

    double balance = 0;

    public void deposit(double moneyToDeposit) {
        if (moneyToDeposit <= 0)
            throw new IllegalArgumentException("Input is INVALID!");

        balance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw <= 0)
            throw new IllegalArgumentException();

        balance -= moneyToWithdraw;
    }

}
