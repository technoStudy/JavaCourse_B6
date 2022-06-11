package Day31;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Mark", 123456789);

        bankAccount.deposit(1000);

        System.out.println(bankAccount.customerName);
        System.out.println(bankAccount.customerSSN);


        BankAccount bankAccount2 = new BankAccount("Emily", 12345, "NYC");

    }

}
