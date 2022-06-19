package tdd.Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Clock {
    @Test
    void clockCreation() {
        ClockTest clockTest = new ClockTest(0,0,0);
        clockTest.setHours(0); clockTest.setMinutes(0); clockTest.setSeconds(0);
        assertEquals(0,clockTest.getHours());
        assertEquals(0,clockTest.getMinutes());
        assertEquals(0,clockTest.getSeconds());

    }
}
