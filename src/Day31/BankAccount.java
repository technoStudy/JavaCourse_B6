package Day31;

public class BankAccount {

    // Constructor : is a special method which is used to initialize objects!
    //               so it will be called when you create an object!

    // Every class has a constructor even if we did not create any (default constructor) public BankAccount() {}
    // Constructor will always have the same name with the class!

    // Method VS Constructor !!!!

    // Constructor will always have the same name with class
    // Method can have any name

    // Constructor don't need any return even void
    // Method should have a return at least void

    // Constructor will be created automatically (default constructor)
    // Method will not be created automatically

    // We use Constructor to initialize instances of an object
    // We use method to perform actions (functions)

    String customerName;
    int customerSSN;
    String customerAddress;
    double customerBalance = 0;

    static double totalBalance = 0;

    public BankAccount(String customerName, int customerSSN) {
        this.customerName = customerName;
        this.customerSSN = customerSSN;
    }

    // Constructor Overloading
    public BankAccount(String customerName, int customerSSN, String customerAddress) {
        this.customerName = customerName;
        this.customerSSN = customerSSN;
        this.customerAddress = customerAddress;
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
