package tdd.Chapter3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
        //given i have created and account
        Account account = new Account();
        //when I check my account
        int balance = account.getBalance();
        // confirm that my balance is zero
        assertEquals(0, account.getBalance());
    }
    @Test
    public void depositMoneyTest(){
        //given i have an account
        Account boyoAccount = new Account();
        //when i deposit money
        boyoAccount.deposit(1500);
        //check that my deposit has changed
        assertEquals(1500, boyoAccount.getBalance());

    }

    @Test
    @DisplayName("Deposit negative should not change balance Test")
    public void depositNegativeAmountTest(){
        Account duroAccount = new Account();
        duroAccount.deposit(-1500);
        assertEquals( 0, duroAccount.getBalance());

    }

    @Test
    public void withdrawTest(){
        Account mikeAccount = new Account();
        mikeAccount.deposit(10000);
        mikeAccount.withdraw(4000);
        assertEquals(6000, mikeAccount.getBalance());

    }
    @Test
    public void withdrawNegativeTest(){
        Account abiAccount = new Account();
        abiAccount.deposit(4000);
        abiAccount.withdraw(-2000);
        assertEquals(4000, abiAccount.getBalance());

    }

    @Test
    public void withdrawPositiveTest(){
        Account bidemiAccount = new Account();
        bidemiAccount.deposit(4000);
        bidemiAccount.withdraw(5000);
        assertEquals(4000,bidemiAccount.getBalance());
    }
}
