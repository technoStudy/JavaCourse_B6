package Day34.Homework.Task2;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("12345", Currency.USD);

        System.out.println(bankAccount1.getUserId());
        System.out.println(bankAccount1.getCurrency());

        bankAccount1.deposit(1000);
        System.out.println(bankAccount1.getBalance());

    }

}
