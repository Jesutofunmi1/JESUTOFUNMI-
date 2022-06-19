package tdd.Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    
    @Test
    public void profileDetails(){
        HeartRates profile = new HeartRates("Samuel", "Oluwadarasimi", "Jesutofunmi", 26, 14,1,1996);
        profile.setFirstName("Samuel"); profile.setLastName("Jesutofunmi"); profile.setMiddleName("Oluwadarasimi");
        profile.setAge(26); profile.setDay(14); profile.setMonth(1); profile.setYear(1996);
        assertEquals("Samuel",profile.getFirstName());
        assertEquals("Oluwadarasimi",profile.getMiddleName());
        assertEquals("Jesutofunmi",profile.getLastName());
        assertEquals(26,profile.getAge());
        assertEquals(14, profile.getDay());
        assertEquals(1,profile.getMonth());
        assertEquals(1996,profile.getYear());
        assertEquals("14/1/1996", profile.getDateOfBirth());
    }
    @Test
    public void provideAge(){
        HeartRates profile = new HeartRates("Samuel", "Oluwadarasimi", "Jesutofunmi", 26, 14,1,1996);
        assertEquals(26, profile.getAgeOfPatient());
    }

    @Test
    public void maximumHeartRate(){
        HeartRates profile = new HeartRates("Samuel", "Oluwadarasimi", "Jesutofunmi", 26, 14,1,1996);
        profile.setMaximumRate(220);
        assertEquals(194,profile.getMaximumRate());

    }
    @Test
    public void targetHeartRate(){
        HeartRates profile = new HeartRates("Samuel", "Oluwadarasimi", "Jesutofunmi", 26, 14,1,1996);
        profile.setTargetRate(50/100);
        assertEquals(4,profile.getTargetRate());
    }

}


