package Day30.BankAccount_Task;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.customerName = "Ozan";

        bankAccount1.deposit(1_000_000);
        System.out.println(bankAccount1.customerBalance);
        bankAccount1.withdraw(5.99);
        System.out.println(bankAccount1.customerBalance);




        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.customerName = "Mila";

        bankAccount2.deposit(1_000_000);
        System.out.println(bankAccount2.customerBalance);


        System.out.println(BankAccount.totalBalance);

    }

}
