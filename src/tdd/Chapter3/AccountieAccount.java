package tdd.Chapter3;

public class AccountieAccount {

    private String name;
    private double balance;
    private double deposit;
    private String setFirstName;
    private String setLastName;

    public AccountieAccount(String firstName, String lastName, double balance, double deposit) {
        name = firstName + " "+ lastName;
        if (balance > 0.00) {
            this.balance = balance;
        }
        if (deposit > 0.00) {
            this.deposit = deposit;
        }
    }
    public void setFirstName(String firstName) {
        this.setFirstName = firstName;

    }
    public void setLastName(String lastName) {
        this.setLastName = lastName;

    }
    public double getBalance() {
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void deposit(double deposit) {

        balance += deposit;
    }
}

