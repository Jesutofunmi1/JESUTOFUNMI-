package AccountOOP;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AccountTest {

    @Test
    public void openAccount() {
        Account account = new Account("Samuel", "Jesutofunmi",2071844457, 0.00,"1234");
        account.balance(0.00);
        assertEquals(0.00, account.getBalance());
}

    @Test
    public void accountCanDeposit() {
        Account account = new Account("Samuel", "Jesutofunmi",2071844457, 0.00,"1234");
        account.deposit(5000.00);
        account.deposit(4000.00);
        assertEquals(9000.00, account.getBalance());
    }

    @Test
    public void accountCanWithdraw() {
        Account account = new Account("Samuel", "Jesutofunmi",2071844457, 0.00,"1234");
        account.deposit(10000.00);
        account.withdraw(3000.00, "0000");
        assertEquals(7000.00, account.getBalance());
    }

    @Test
    public void accountNumber2() {
        Account2 account2 = new Account2("Judith", "Oviosun", 0.00, "1234");
        account2.balance(500.00);
        assertEquals(500.00, account2.getBalance());
    }

    @Test
    public void account2CanWithdraw() {
        Account2 account2 = new Account2("Judith", "Oviosun", 0.00, "0000");
        account2.balance(4000.00);
        account2.withdraw(1000.00, "0000");
        assertEquals(3000.00, account2.getBalance());
    }

    @Test
    public void account2CanDeposit() {
        Account2 account2 = new Account2("Judith", "Oviosun", 0.00, "0000");
        account2.deposit(5000.00);
        account2.deposit(4000.00);
        assertEquals(9000.00, account2.getBalance());
    }

    @Test
    public void accountCanTransfer() {
        Account account = new Account("Samuel", "Jesutofunmi",2071844457, 0.00,"1234");
        Account2 account2 = new Account2("Judith", "Oviosun", 0.00, "0000");
        account.balance(10000.00);
        account2.balance(30000.00);
        account.transfer(2000.00, "1234");
        account2.receivesTransfer(2000.00);
        assertEquals(7998.75, account.getBalance());
        assertEquals(32000.00, account2.getBalance());
    }

    @Test
    public void account2Transfer() {
        Account2 account2 = new Account2("Judith", "Oviosun", 0.00, "0000");
        Account account = new Account("Samuel", "Jesutofunmi",2071844457, 0.00,"1234");
        account2.balance(5000.00);
        account.balance(3000);
        account2.transfer(3000.00, "0000");
        account.receivesTransfer(3000.00);
        assertEquals(1998.75, account2.getBalance());
        assertEquals(6000.00, account.getBalance());
    }
}
