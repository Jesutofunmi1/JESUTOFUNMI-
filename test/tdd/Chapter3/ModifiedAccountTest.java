package tdd.Chapter3;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiedAccountTest {

    @Test
    void accountCanBeCreated(){
        ModifiedAccount modifiedAccount = new ModifiedAccount(" ", " ", 0);
        modifiedAccount.setFirstName("Shola"); modifiedAccount.setLastName("Azeez");
        modifiedAccount.setBalance(0);
        assertEquals("Shola", modifiedAccount.getFirstName());
        assertEquals("Azeez", modifiedAccount.getLastName());
        assertEquals(0,modifiedAccount.getBalance());

    }

    @Test
    void accountDeposit() {
        ModifiedAccount modifiedAccount = new ModifiedAccount("Shola", "Azeez", 5000);
        modifiedAccount.deposit(5000);
        assertEquals(10000,modifiedAccount.getBalance());

    }

    @Test
    void accountWithdrawal() {
        ModifiedAccount modifiedAccount = new ModifiedAccount("Shola", "Azeez",10000);
        modifiedAccount.withdrawal(2000);
        assertEquals(8000, modifiedAccount.getBalance());

    }

}
