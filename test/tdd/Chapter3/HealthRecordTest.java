package tdd.Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthRecordTest {

    @Test
    void profileRecord(){
        HealthRecord record = new HealthRecord("Samuel", "Oluwadarasimi", "Jesutofunmi",
                "male", 26, 14, "January",1996, 0,0);
        record.setFirstName("Samuel"); record.setMiddleName("Oluwadarasimi"); record.setLastName("Jesutofunmi"); record.setGender("male");
        record.setGender("Male"); record.setAge(26); record.setDay(14); record.setMonth("January"); record.setYear(1996);
        record.setHeight(0); record.setWeight(0);
        assertEquals("Samuel", record.getFirstName()); assertEquals("Oluwadarasimi", record.getMiddleName());
        assertEquals("Jesutofunmi",record.getLastName()); assertEquals("Male", record.getGender());
        assertEquals(26, record.getAge());
        assertEquals("14/1/1996", record.getDateOfBirth());
        assertEquals(14, record.getDay());
        assertEquals("January", record.getMonth()); assertEquals(1996, record.getYear());
        assertEquals(0, record.getHeight()); assertEquals(0, record.getWeight());
    }
    @Test
    void profileBMI(){
        HealthRecord record = new HealthRecord("Samuel", "Oluwadarasimi", "Jesutofunmi",
                "male", 26, 14, "January",1996, 5,0);
        assertEquals(0, record.getBMI());
    }
    @Test
    void targetHeartRate(){
        HealthRecord record = new HealthRecord("Samuel", "Oluwadarasimi", "Jesutofunmi",
                "male", 26, 14, "January",1996, 5,0);
        assertEquals(4, record.getTargetRateInRecord());
    }
    @Test
    void maximumHeartRate(){
        HealthRecord record = new HealthRecord("Samuel", "Oluwadarasimi", "Jesutofunmi",
                "male", 26, 14, "January",1996, 5,0);
        assertEquals(34, record.getMaximumHeartRate());
    }
}

