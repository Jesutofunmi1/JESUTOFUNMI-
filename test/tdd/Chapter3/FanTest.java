
package tdd.Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FanTest {

    @Test
    public void fanClassExist(){
        Fan fan = new Fan("MEM");
        assertNotNull(fan);
        assertFalse(fan.isOn());
    }

    @Test
    public void fanCanBeTurnedOn(){
        Fan fan = new Fan("MEM");
        assertFalse(fan.isOn());
        fan.turnOn();
        assertTrue(fan.isOn());

    }

    @Test
    public void fanCanBeTurnedOff(){
        Fan fan = new Fan("MEM");
        assertFalse(fan.isOn());
        fan.turnOn();
        assertTrue(fan.isOn());
        fan.turnOff();
        assertFalse(fan.isOn());
    }

    @Test
    public void fanSpeedCanBeIncreased(){
        Fan fan = new Fan("MEM");
        fan.turnOn();
        assertEquals(0,fan.getSpeed());
        fan.increaseSpeed();
        assertEquals(1, fan.getSpeed());
    }

    @Test
    public void fanSpeedCannotGoBeyond_3(){
        Fan fan = new Fan("MEM");
        fan.turnOn();
        assertEquals(0, fan.getSpeed());
        fan.increaseSpeed();
        fan.increaseSpeed();
        fan.increaseSpeed();
        assertEquals(3, fan.getSpeed());
        fan.increaseSpeed();
        fan.increaseSpeed();
        assertEquals(3, fan.getSpeed());
    }
    @Test
    public void fanSpeedCanBeDecreased(){
        Fan fan = new Fan("MEM");
        fan.turnOn();
        assertEquals(0,fan.getSpeed());
        fan.increaseSpeed();
        fan.increaseSpeed();
        fan.decreaseSpeed();
        assertEquals(1, fan.getSpeed());

    }
    @Test
    public void fanSpeedCanDecreaseBeyond_0(){
        Fan fan = new Fan("MEM");
        fan.turnOn();
        assertEquals(0,fan.getSpeed());
        fan.increaseSpeed();
        fan.increaseSpeed();
        fan.decreaseSpeed();
        fan.decreaseSpeed();
        fan.decreaseSpeed();
        assertEquals(0, fan.getSpeed());

    }

}