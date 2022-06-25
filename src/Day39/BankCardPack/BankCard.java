package Day39.BankCardPack;

public abstract class BankCard {

    private String name;
    private int SSN;
    private double balance = 0;

    public BankCard(String name, int SSN) {
        this.name = name;
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public int getSSN() {
        return SSN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
         this.balance = balance;
    }

    public abstract void deposit(double moneyToDeposit);

    public abstract void withdraw(double moneyToWithdraw);

}
