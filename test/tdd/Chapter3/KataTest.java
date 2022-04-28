package tdd.Chapter3;

import org.junit.jupiter.api.Test;
import tdd.Chapter3.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
        public void additionTest() {
        Kata calculator = new Kata();
        //System.out.println(calculator.add(2,3));
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void subtractionTest() {
        Kata calculate = new Kata();
       // System.out.println(calculate.subtract(5, 4));
        int result = calculate.subtract(5, 4);
        assertEquals(1, result);
    }
        @Test
        public void divisionTest () {
            Kata calculateYourLife = new Kata();
           // System.out.println(calculateYourLife.division(8, 4));
            int result = calculateYourLife.division(8, 4);
            assertEquals(2, result);
        }

        @Test
        public void multiplicationTest() {
            Kata extraction = new Kata();
            //System.out.println(extraction.multiplication(10,4));
            int result = extraction.multiplication(10,4);
            assertEquals(40, result);
        }


        @Test
        public void quotientTest() {
        Kata calculator = new Kata();
        //System.out.println(calculator.quotient(10,0));
        int result = calculator.quotient(10, 0);
        assertEquals(0, result);
        }

        @Test
        public void squareOfNumber1() {
        ArithmeticLogic calculator = new ArithmeticLogic();
       // System.out.println(calculator.squareOfNumber(10));
        int result = calculator.squareOfNumber(10);
        assertEquals(100,result);
        }

        @Test
        public void squareOfNumber2() {
        ArithmeticLogic calculator = new ArithmeticLogic();
       // System.out.println(calculator.squareOfNumber2(6));
        int result = calculator.squareOfNumber2(6);
        assertEquals(36,result);

        }
        @Test
        public void squareTest() {
        ArithmeticLogic calculator = new ArithmeticLogic();
        //System.out.println(calculator.squareSums(100,36));
        int result = calculator.squareSums(100,36);
        assertEquals(136,result);

        }

        @Test
        public void differenceOfSquare() {
        ArithmeticLogic calculator = new ArithmeticLogic();
        //System.out.println(calculator.difference(100,36));
        int result = calculator.difference(100,36);
        assertEquals(64,result);
    }



    }

