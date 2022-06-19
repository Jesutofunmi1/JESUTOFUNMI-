package tdd.Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void carModel() {
        CarBrand carBrand = new CarBrand("Toyota", "2009", 0.00);
        carBrand.setName("Toyota");
        assertEquals("Toyota", carBrand.getName());

    }

    @Test
    void carYear() {
        CarBrand carBrand = new CarBrand("Toyota", "2009", 0.00);
        carBrand.setYear("2009");
        assertEquals("2009", carBrand.getYear());
    }

    @Test
    void carPrice() {
        CarBrand carBrand = new CarBrand("Toyota", "2009", 0.00);
        carBrand.setPrice(0.00);
        assertEquals(0.00, carBrand.getPrice());
    }
    @Test
    void ToyotaHiluxDiscount() {
        CarBrand carBrand = new CarBrand("Toyota", "2009", 0.00);
        carBrand.setDiscount(5.00);
        carBrand.setHiluxPrice(500000.00);
        assertEquals(25000.00, carBrand.getDiscount());
    }

    @Test
    void ToyotaCorollaDiscount() {
        CarBrand carBrand = new CarBrand("Toyota", "2009", 0.00);
        carBrand.setDiscount(7.00);
        carBrand.setCorollaPrice(200000.00);
        assertEquals(14000,carBrand.getDiscount());
    }
}
