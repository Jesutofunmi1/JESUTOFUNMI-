package BankAccount;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BankAccountTest {

    @Test
    public void BankCanCreateAccountTest() {
        Bank Xiamie = new Bank("Xiamie Bank Plc");
        Xiamie.register("Sam", "1234");
        Xiamie.register("Mike", "9876");
        Xiamie.register("Joshua", "3456");
        assertEquals(3, Xiamie.getNumberOfCustomer());
    }

    @Test
    public void NewAccountHasAccountNumberTest() {
        Bank Xiamie = new Bank("Xiamie Bank Plc");
        Xiamie.register("Sam", "1234");
        Xiamie.register("Mike", "9876");
        Xiamie.register("Sam", "3456");
        AccountXiamie accountXiamie = Xiamie.getCustomerByAccountNumber(1);
        assertEquals("Sam", accountXiamie.getAccountName());
        assertEquals(1, accountXiamie.getAccountNumber());
    }

    @Test
    public void testThatAccountCanDeposit() {
        Bank Xiamie = new Bank("Xiamie Bank Plc");
        Xiamie.register("Sam", "1234");
        Xiamie.register("Mike", "9876");
        Xiamie.register("Joshua", "3456");
        AccountXiamie accountXiamie = Xiamie.getCustomerByAccountNumber(1);
        accountXiamie.deposit(9000.00);
        assertEquals("Sam", accountXiamie.getAccountName());
        assertEquals(1, accountXiamie.getAccountNumber());
        assertEquals(9000.00, accountXiamie.getBalance());
    }

    @Test
        public void testThatJoshuaCanTransferToSamuel() {
        Bank Xiamie = new Bank("Xiamie Bank Plc");
        Xiamie.register("Sam", "1234");
        Xiamie.register("Mike", "9876");
        Xiamie.register("Joshua", "3456");
        AccountXiamie accountXiamie = Xiamie.getCustomerByAccountNumber(1);
        AccountXiamie accountXiamie2 = Xiamie.getCustomerByAccountNumber(2);
        AccountXiamie accountXiamie3 = Xiamie.getCustomerByAccountNumber(3);
        accountXiamie.deposit(15000.00);
        Xiamie.transfer(accountXiamie,accountXiamie2,5000);
        Xiamie.transfer(accountXiamie,accountXiamie3, 2000);
        assertEquals(8000.00, accountXiamie.getBalance());
        assertEquals(5000.00, accountXiamie2.getBalance());
        assertEquals(2000.00, accountXiamie3.getBalance());
    }

}
