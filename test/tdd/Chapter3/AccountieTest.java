package tdd.Chapter3;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountieTest {
    @Test
    void accountAccessBank() {
        AccountieAccount accountieAccount = new AccountieAccount("Samuel", "Jesutofunmi",150000.00, 50000.00);
        assertEquals(150000.00,accountieAccount.getBalance());
        accountieAccount.deposit(50000.00);
        assertEquals(50000.00,accountieAccount.getDeposit());
    }
    @Test
    public void depositTest(){
        AccountieAccount accountieAccount = new AccountieAccount("Samuel", "Jesutofunmi",0.00, 0.00);
        accountieAccount.deposit(5000.0);
        assertEquals(5000.00,accountieAccount.getBalance());
    }
}
