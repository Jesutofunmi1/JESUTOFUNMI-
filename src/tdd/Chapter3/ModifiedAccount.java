package tdd.Chapter3;

public class ModifiedAccount {
    private String firstName;
    private String lastName;
    private int balance;

    public ModifiedAccount(String firstName, String lastName, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;

    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int deposit) {
        balance = deposit + balance;
    }

    public void withdrawal(int withdrawal) {
        balance = balance - withdrawal;
    }
}
