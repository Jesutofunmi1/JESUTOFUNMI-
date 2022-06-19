package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptTest {
    @Test
    public void Prices() {
        Receipt receipt = new Receipt(0.00, 0.00, 0.00 );
        receipt.setPriceTrouser(0.00); receipt.setPriceShirt(0.00); receipt.setPriceShoe(0.00);
        assertEquals(0.00, receipt.getPriceTrouser);
        assertEquals(0.00, receipt.getPriceShirt);
        assertEquals(0.00, receipt.getPriceShoe);
    }
    @Test
    public void PriceDiscount() {
        Receipt receipt = new Receipt(0.00, 0.00,0.00);
        receipt.setDiscount(2/100);
    }
}
