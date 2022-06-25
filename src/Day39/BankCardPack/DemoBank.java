package Day39.BankCardPack;

public class DemoBank {

    public static void main(String[] args) {

        BankCard bankCard1 = new DebitCard("John", 111111111);
        bankCard1.deposit(200);
        System.out.println(bankCard1.getBalance());
        bankCard1.withdraw(150);
        System.out.println(bankCard1.getBalance());


        BankCard bankCard2 = new CreditCard("Katy", 222222222);
        bankCard2.deposit(200);
        System.out.println(bankCard2.getBalance());
        bankCard2.withdraw(250);
        System.out.println(bankCard2.getBalance());

    }

}
