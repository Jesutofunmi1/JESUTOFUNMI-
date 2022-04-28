package tdd.Chapter3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.Chapter3.TestDriller;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    @Test
    @DisplayName("1-4 number of copies sold at rate 2_000")
    public void testDriller1(){
        TestDriller UTME = new TestDriller();
        int price = UTME.price(4);
        assertEquals(8_000, price);
    }

    @Test
    @DisplayName("5-9 number of copies sold at rate 1_800")
    public void testDriller2(){
        TestDriller UTME =  new TestDriller();
        int price = UTME.price(9);
        assertEquals(16_200, price);
    }
    @Test
    @DisplayName("10-29 number of copies sold at rate 1_600")
    public void testDriller3(){
        TestDriller UTME = new TestDriller();
        int price = UTME.price(29);
        assertEquals(46_400,price);

    }
    @Test
    @DisplayName("30-49 number of copies sold at rate 1_500")
    public void testDriller4(){
        TestDriller UTME = new TestDriller();
        int price = UTME.price(49);
        assertEquals(73_500,price);
    }

    @Test
    @DisplayName("50-99 number of copies sold at rate 1_300")
    public void testDriller5(){
        TestDriller UTME = new TestDriller();
        int price = UTME.price(99);
        assertEquals(128_700,price);
    }
    @Test
    @DisplayName("100-199 number of copies sold at rate 1_200")
    public void testDriller6(){
        TestDriller UTME = new TestDriller();
        int price = UTME.price(199);
        assertEquals(238_800,price);
    }
    @Test
    @DisplayName("200-499 number of copies sold at rate 1_100")
    public void testDriller7(){
        TestDriller UTME = new TestDriller();
        int price = UTME.price(499);
        assertEquals(548_900,price);
    }
    @Test
    @DisplayName("500-above number of copies sold at rate 1_000")
    public void testDriller8(){
        TestDriller UTME = new TestDriller();
        int price = UTME.price(500);
        assertEquals(500_000,price);


    }
}
