package tdd.Chapter3;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount) {
        if (amount < balance && amount > 0) {
            balance = balance - amount;
        }
    }


}
