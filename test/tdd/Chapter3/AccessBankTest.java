package tdd.Chapter3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessBankTest {
    @Test
    public void accountAccess() {
        AccessBankAccount accessBankAccount = new AccessBankAccount("Samuel" ,"Jesutofunmi");
        assertEquals("Samuel Jesutofunmi",accessBankAccount.getName());
    }
    @Test
    public void accountBalance() {
        AccessBankAccount accessBankAccount = new AccessBankAccount("Samuel" ,"Jesutofunmi");
        accessBankAccount.deposit(600);
        assertEquals(600,accessBankAccount.getBalance());
    }
    @Test
    public void accountDeposit() {
        AccessBankAccount accessBankAccount = new AccessBankAccount("Samuel", "Jesutofunmi");
        accessBankAccount.deposit(5000);
        assertEquals(5000,accessBankAccount.getBalance());
    }
    @Test
    public void accountWithdraw() {
        AccessBankAccount accessBankAccount = new AccessBankAccount("Samuel", "Jesutofunmi");
        accessBankAccount.deposit(5000);
        accessBankAccount.withdraw(1000);
        assertEquals(4000,accessBankAccount.getBalance());
    }
    @Test
    public void accountDeposit2() {
        AccessBankAccount accessBankAccount = new AccessBankAccount("Samuel", "Jesutofunmi");
        accessBankAccount.deposit(5000);
        accessBankAccount.deposit(5000);
        assertEquals(10000,accessBankAccount.getBalance());
    }
    @Test
    public void accountNegativeDeposit() {
        AccessBankAccount accessBankAccount = new AccessBankAccount("Samuel", "Jesutofunmi");
        accessBankAccount.deposit(-200);
        assertEquals(0,accessBankAccount.getBalance());
    }
    @Test
    public void accountNegativeWithdraw() {
        AccessBankAccount accessBankAccount = new AccessBankAccount("Samuel", "Jesutofunmi");
        accessBankAccount.withdraw(-200);
        assertEquals(0,accessBankAccount.getBalance());
    }

}
