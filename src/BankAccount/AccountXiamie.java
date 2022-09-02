package BankAccount;

public class AccountXiamie {
    private int numberOfCustomer;
    private String nameOfCustomer;
    private String pin;
    private double balance;

    public AccountXiamie(int numberOfCustomer, String nameOfCustomer, String pin) {
        this.numberOfCustomer = numberOfCustomer;
        this.nameOfCustomer = nameOfCustomer;
        this.pin = pin;
    }


    public String getAccountName() {
        return nameOfCustomer;
    }

    public int getAccountNumber() {
        return numberOfCustomer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;

    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
