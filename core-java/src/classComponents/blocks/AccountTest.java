package classComponents.blocks;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1, "Chetan", 1000, "chetan123", "password");
        System.out.println("Before transaction initial balance " + account.getBalance());
        account.deposit(10000);
        account.withdrawAmount(6000);
        System.out.println("After transaction  balance : " + account.getBalance());//5000

    }
}
