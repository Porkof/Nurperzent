import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to SavingsAccount");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from SavingsAccount");
        } else {
            System.out.println("Insufficient balance in SavingsAccount");
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    public void viewBalance() {
        System.out.println("SavingsAccount balance: " + balance);
    }

    public void uniqueSavingsFeature() {
        System.out.println("Unique SavingsAccount feature: Earns higher interest!");
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to CurrentAccount");
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from CurrentAccount");
        } else {
            System.out.println("Exceeded overdraft limit in CurrentAccount");
        }
    }

    public void calculateInterest() {
        System.out.println("CurrentAccount does not earn interest");
    }

    public void viewBalance() {
        System.out.println("CurrentAccount balance: " + balance);
    }

    public void uniqueCurrentFeature() {
        System.out.println("Unique CurrentAccount feature: Can use overdraft!");
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to bank");
    }

    public void showAllBalances() {
        for (Account account : accounts) {
            account.viewBalance();
        }
    }
}

public class ex4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(1000, 5);
        CurrentAccount ca = new CurrentAccount(2000, 500);

        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.deposit(500);
        sa.calculateInterest();
        sa.viewBalance();
        sa.uniqueSavingsFeature();

        ca.withdraw(2300);
        ca.calculateInterest();
        ca.viewBalance();
        ca.uniqueCurrentFeature();

        System.out.println("\nAll balances in bank:");
        bank.showAllBalances();
    }
}
