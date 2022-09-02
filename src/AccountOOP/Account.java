package AccountOOP;

public class Account {

    private final String firstName;
    private final String lastName;
    private final String pin;
    private final int accountNumber;
    private double balance;
    private double deposit;
    private double withdraw;
    private double bankTransfer = 1.25;

    public Account(String firstName, String lastName, int accountNumber, double balance, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void balance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double depositAmount) {
        balance += depositAmount;
        return balance;
    }

    public double getDeposit() {
        return deposit + balance;
    }
    public void withdraw(double withdrawAmount, String pin) {
        balance -= withdrawAmount;
    }

    public void transfer(double sendAmount, String pin) {
        balance -= (sendAmount + bankTransfer);
    }
    public void receivesTransfer(double receiveAmount) {
        balance += receiveAmount;
    }
}
