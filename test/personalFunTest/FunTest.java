package personalFunTest;

import org.junit.jupiter.api.Test;
import personalFun.Fun;

import static org.testng.Assert.assertEquals;

public class FunTest {
    @Test
    public  void createClass(){
        Fun myFun = new Fun("bola",77);
        myFun.setName("bola");
        assertEquals("bola",myFun.getName());
    }

    @Test
    public void test(){
        Fun myFun = new Fun("amaka",23,6,3,2006);

        myFun.setName("amaka");
        assertEquals("amaka",myFun.getName());

        myFun.setAge(23);

        myFun.setDay(6);
        assertEquals(6,myFun.getDay());

        myFun.setMonth(6);
        assertEquals(6,myFun.getMonth());

        myFun.setYear(2006);
        assertEquals(2006,myFun.getYear());
    }

    @Test
    public void dateOfBirth(){
        Fun myFun = new Fun("amaka",16,6,6,5678);

        myFun.setDay(6);
        assertEquals(6,myFun.getDay());

        myFun.setMonth(6);
        assertEquals(6,myFun.getMonth());

        myFun.setYear(5678);
        assertEquals(5678,myFun.getYear());

        assertEquals("6/6/5678",myFun.getDateOfBirth());

    }
}
