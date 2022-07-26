package ChibuzorTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    AirCondition myAirConditioner;

    @BeforeEach
    void setUp() {
    myAirConditioner = new AirCondition();

    }
    @Test
    void testThatACIsOff() {
       myAirConditioner.isOff();
       assertFalse(myAirConditioner.isOff());

    }
    @Test
    void testThatACIsOn() {
        myAirConditioner.isOff();
        myAirConditioner.isOn();
        assertFalse(myAirConditioner.isOn());
    }

    @Test
    void testThatACCanBeTurnedOn() {
        myAirConditioner.isOn();
        myAirConditioner.turnOn();
        assertTrue(myAirConditioner.isOn());
    }
    @Test
    void testThatACCanBeTurnedOff() {
        myAirConditioner.isOn();
        myAirConditioner.turnOff();
        assertTrue(myAirConditioner.isOn());
    }

    @Test
    void testThatACCanIncreaseTemperature() {
        myAirConditioner.turnOn();
        myAirConditioner.increaseTemperature();
        assertEquals(16, myAirConditioner.getIncreaseTemperature());
    }
    @Test
    void testThatACCanDecreaseTemperature() {
        myAirConditioner.turnOn();
        myAirConditioner.increaseTemperature();
        myAirConditioner.decreaseTemperature();
        assertEquals(-11, myAirConditioner.getDecreaseTemperature());
        myAirConditioner.turnOff();
        assertFalse(myAirConditioner.isOff());
    }
}

