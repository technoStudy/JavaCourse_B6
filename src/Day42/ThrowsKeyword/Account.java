package Day42.ThrowsKeyword;

import java.io.IOException;

public class Account {

    double balance = 0;

    public void deposit(double moneyToDeposit) throws IOException {
        if (moneyToDeposit <= 0)
            throw new IOException();

        balance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) throws IOException {
        if (moneyToWithdraw <= 0)
            throw new IOException();

        balance -= moneyToWithdraw;
    }

}
