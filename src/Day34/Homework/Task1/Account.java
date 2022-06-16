package Day34.Homework.Task1;

public class Account {

    private String userId;
    private double balance;

    public Account(String userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be less than or equal to 0");
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

}
