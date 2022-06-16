package Day34.Homework.Task2;

public class BankAccount {

    private String userId;
    private double balance;
    private Currency currency;

    public BankAccount(String userId, Currency currency) {
        this.userId = userId;
        this.currency = currency;
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void deposit(double moneyToDeposit) {
        if (moneyToDeposit <= 0)
            throw new IllegalArgumentException();
        balance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw > balance)
            throw new IllegalArgumentException("You cannot withdraw more than your balance!");
        balance -= moneyToWithdraw;
    }

}
