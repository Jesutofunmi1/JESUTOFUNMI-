package BankAccount;


public class Bank {
    public AccountXiamie getCustomerBalance;
    private int numberOfCustomers = 0;
    private AccountXiamie[] accountXiamies = new AccountXiamie[14];
    private String bankName;


    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void register(String nameOfCustomer, String pin) {
        AccountXiamie accountXiamie = new AccountXiamie(++ numberOfCustomers, nameOfCustomer, pin);
        accountXiamies[numberOfCustomers-1] = accountXiamie;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomers;

    }

    public AccountXiamie getCustomerByAccountNumber(int accountNumber) {
        return accountXiamies[accountNumber-1];
            }

    public void transfer(AccountXiamie senderAccount, AccountXiamie receiverAccount, int amount) {
        senderAccount.withdraw(amount);
        receiverAccount.deposit(amount);
    }
}



