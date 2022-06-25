package Day39.BankCardPack;

public class CreditCard extends BankCard {

    public CreditCard(String name, int SSN) {
        super(name, SSN);
    }

    @Override
    public void deposit(double moneyToDeposit) {
        if (moneyToDeposit < 0)
            throw new IllegalArgumentException("You cannot deposit this amount!");
        setBalance(getBalance() + moneyToDeposit);
    }

    @Override
    public void withdraw(double moneyToWithdraw) {
        if (moneyToWithdraw < 0)
            throw new IllegalArgumentException("You cannot withdraw this amount!");
        setBalance(getBalance() - moneyToWithdraw);
    }

}
