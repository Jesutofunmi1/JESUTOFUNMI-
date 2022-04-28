package tdd.Chapter3;

import org.testng.annotations.Test;
import tdd.Chapter3.ArithmeticLogic;

import static org.testng.AssertJUnit.assertEquals;

public class ArithmeticLogicTest {
    @Test
    public void addNumberTest(){
        ArithmeticLogic arithmeticLogic = new ArithmeticLogic();
        System.out.println(arithmeticLogic.addNumbers(4, 5));
        int result = arithmeticLogic.addNumbers(4, 5);
       assertEquals(9, result);
   }
    @Test
    public void squareOfNumber() {
        ArithmeticLogic arithmeticLogic = new ArithmeticLogic();
        int result = arithmeticLogic.squareOfNumbers(2,4);
        assertEquals(6,result);



    }
}
