package tdd.Chapter3;

public class AccessBankAccount {

    private  String name;
    private int balance;


    public AccessBankAccount(String firstName, String lastName) {
        name = firstName + " "+ lastName;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int deposit) {
        if (deposit > 0){
            balance = balance + deposit;
        }
    }

    public void withdraw(int withdraw) {
        if (withdraw > 0) {

            balance = balance - withdraw;
        }
    }


}
