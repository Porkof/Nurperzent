abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 0.05;

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit = 500.0;

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account.");
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class ex3 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount current = new CurrentAccount(500);

        savings.showBalance();
        savings.deposit(200);
        savings.withdraw(1500);
        savings.showBalance();
        System.out.println("----------------------");

        current.showBalance();
        current.withdraw(800);
        current.deposit(300);
        current.showBalance();
    }
}
