package classComponents.blocks;

import java.time.LocalDateTime;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    private String username;
    private String password;

    static String bankName = "Mallya Bank";

    public Account() {
        System.out.println("Zero param con : No args constructor");
    }

    public Account(int accountNumber, String accountHolderName, int balance, String username, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.username = username;
        this.password = password;
        System.out.println("parameterized constrcutor : All args constructor");
    }

    {
        System.out.println("Account object is created at :" + LocalDateTime.now());
    }

    static {
        System.out.println("This will be executed only once at the time class loading in the memory.");
    }

    public void withdrawAmount(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public int getBalance(){
        return balance;
    }
}
