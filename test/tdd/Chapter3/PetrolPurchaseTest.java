package tdd.Chapter3;

import org.testng.annotations.Test;
import personalFun.PetrolPurchase;

import static org.testng.AssertJUnit.assertEquals;

public class PetrolPurchaseTest {

    @Test
    public void petrolPurchaseAccount() {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Xiamie", "Abeokuta", "Ago", 0, 00.00, 00.00);
        petrolPurchase.setName("Xiamie");
        petrolPurchase.setLocation("Abeokuta");
        petrolPurchase.setType("Ago");
        petrolPurchase.setQuantity(50);
        petrolPurchase.setPrice(30.00);
        petrolPurchase.setDiscount(2.00);
        assertEquals("Xiamie", petrolPurchase.getName());
        assertEquals("Abeokuta", petrolPurchase.getLocation());
        assertEquals("Ago", petrolPurchase.getType());
        assertEquals(50, petrolPurchase.getQuantity());
        assertEquals(30.00, petrolPurchase.getPrice());
        assertEquals(2.00, petrolPurchase.getDiscount());
        assertEquals(1498.00, petrolPurchase.getPurchaseAmount());

    }
}
