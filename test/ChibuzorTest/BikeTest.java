package ChibuzorTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike lifan;

    @BeforeEach
    void setUp() {
        lifan = new Bike();

    }

    @Test
    void testThatBikeIsOff() {
        assertFalse(lifan.isOn());
    }

    @Test
    void testThatBikeCanBeTurnedOn() {
        lifan.turnOn();
        assertTrue(lifan.isOn());
    }

    @Test
    void autoChangeGearAndAccelerate() {
        lifan.turnOn();
        assertTrue(lifan.isOn());
        assertEquals(lifan.getGearNumber(), 0);
        assertEquals(lifan.getKilometer(), 0);
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 1);
    }

    @Test
    void testThatBikeIsOnGearOne() {
        lifan.turnOn();
        assertTrue(lifan.isOn());
        assertEquals(lifan.getGearNumber(), 0);
        assertEquals(lifan.getKilometer(), 0);
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 1);
        for (int i = 0; i < 18; i++) {
            lifan.accelerate();
        }
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 20);
        assertEquals(lifan.getGearNumber(), 1);
        for (int i = 0; i < 20; i++) {
            lifan.applyBreak();
        }
        assertEquals(lifan.getKilometer(), 0);
        assertEquals(lifan.getGearNumber(), 0);
    }

    @Test
    void testThatBikeIsOnGearTwo() {
        lifan.turnOn();
        assertTrue(lifan.isOn());
        assertEquals(lifan.getGearNumber(), 0);
        assertEquals(lifan.getKilometer(), 0);
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 1);
        for (int i = 0; i < 18; i++) {
            lifan.accelerate();
        }
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 19);
        lifan.accelerate();
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 2);
        assertEquals(lifan.getKilometer(), 21);
        lifan.accelerate();
        assertEquals(lifan.getKilometer(), 23);
        lifan.applyBreak();


    }

    @Test
    void testThatBikeIsOnGearThree() {
        lifan.turnOn();
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 1);
        for (int i = 0; i < 19; i++) {
            lifan.accelerate();
        }
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 20);
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 2);
        assertEquals(lifan.getKilometer(), 21);
        lifan.accelerate();
        assertEquals(lifan.getKilometer(), 23);
        for (int i = 0; i < 9; i++) {
            lifan.accelerate();
        }
        assertEquals(lifan.getGearNumber(), 3);
        assertEquals(lifan.getKilometer(), 41);
        for (int i = 0; i < 5; i++) {
            lifan.accelerate();
        }

        assertEquals(lifan.getKilometer(), 56);
        assertEquals(lifan.getGearNumber(), 3);
        lifan.applyBreak();
        assertEquals(lifan.getKilometer(), 53);
        assertEquals(lifan.getGearNumber(), 3);
        for (int i = 0; i < 5; i++) {
            lifan.applyBreak();
        }
        lifan.applyBreak();
        assertEquals(lifan.getKilometer(), 36);
        assertEquals(lifan.getGearNumber(), 2);
        for (int i = 0; i < 10; i++) {
            lifan.applyBreak();
        }
        assertEquals(lifan.getKilometer(), 16);
        assertEquals(lifan.getGearNumber(), 1);
        for (int i = 0; i < 20; i++) {
            lifan.applyBreak();
        }
        assertEquals(lifan.getKilometer(), 0);
        assertEquals(lifan.getGearNumber(), 0);
    }

    @Test
    void testThatBikeIsOnGearFour() {
        lifan.turnOn();
        lifan.accelerate();

        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 1);
        for (int i = 0; i < 19; i++) {
            lifan.accelerate();
        }
        assertEquals(lifan.getGearNumber(), 1);
        assertEquals(lifan.getKilometer(), 20);
        lifan.accelerate();
        assertEquals(lifan.getGearNumber(), 2);
        assertEquals(lifan.getKilometer(), 21);
        lifan.accelerate();
        assertEquals(lifan.getKilometer(), 23);
        for (int i = 0; i < 9; i++) {
            lifan.accelerate();
        }
        assertEquals(lifan.getGearNumber(), 3);
        assertEquals(lifan.getKilometer(), 41);
        for (int i = 0; i < 7; i++) {
            lifan.accelerate();
        }
        assertEquals(lifan.getKilometer(), 62);
        assertEquals(lifan.getGearNumber(), 4);
        lifan.applyBreak();
        assertEquals(lifan.getKilometer(), 58);
        assertEquals(lifan.getGearNumber(), 3);
        lifan.applyBreak();
        assertEquals(lifan.getKilometer(), 55);
        assertEquals(lifan.getGearNumber(), 3);
        for (int i = 0; i < 5; i++) {
            lifan.applyBreak();
        }
        assertEquals(lifan.getKilometer(), 40);
        assertEquals(lifan.getGearNumber(), 2);
        for (int i = 0; i < 10; i++) {
            lifan.applyBreak();
        }
        assertEquals(lifan.getKilometer(), 20);
        assertEquals(lifan.getGearNumber(), 1);
        for (int i = 0; i < 20; i++) {
            lifan.applyBreak();
        }
        assertEquals(lifan.getKilometer(), 0);
        assertEquals(lifan.getGearNumber(), 0);
    }

}

