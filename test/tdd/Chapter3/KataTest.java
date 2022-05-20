package tdd.Chapter3;

import Chapter2.Prompter;
import org.junit.jupiter.api.Test;
import tdd.Chapter3.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
    public void divisionTest() {
        Kata calculateYourLife = new Kata();
        // System.out.println(calculateYourLife.division(8, 4));
        int result = calculateYourLife.division(8, 4);
        assertEquals(2, result);
    }

    @Test
    public void multiplicationTest() {
        Kata extraction = new Kata();
        //System.out.println(extraction.multiplication(10,4));
        int result = extraction.multiplication(10, 4);
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
        assertEquals(100, result);
    }

    @Test
    public void squareOfNumber2() {
        ArithmeticLogic calculator = new ArithmeticLogic();
        // System.out.println(calculator.squareOfNumber2(6));
        int result = calculator.squareOfNumber2(6);
        assertEquals(36, result);

    }

    @Test
    public void squareTest() {
        ArithmeticLogic calculator = new ArithmeticLogic();
        //System.out.println(calculator.squareSums(100,36));
        int result = calculator.squareSums(100, 36);
        assertEquals(136, result);

    }
//    @Test
////    public void petrolPrice() {
//        Petrol petrol = new Petrol();
//        int result = petrol.price("unilag","gas",50,165,0.05);
//    }

    @Test
    public void differenceOfSquare() {
        ArithmeticLogic calculator = new ArithmeticLogic();
        //System.out.println(calculator.difference(100,36));
        int result = calculator.difference(100, 36);
        assertEquals(64, result);
    }

        @Test
        public void numberPassed() {
            Kata grading = new Kata();
            String result = grading.passedOrFailed(55);
            assertEquals("Passed", result);
        }
        @Test
        public void numberFailed() {
        Kata grading = new Kata();
        String result = grading.passedOrFailed( 54);
        assertEquals("Failed", result);

        }

    @Test
    public void gradeATest() {
        Kata grading = new Kata();
        String result = grading.getGrade(100);
        assertEquals("A", result);
    }

    @Test
    public void gradeBTest(){
        Kata grading = new Kata();
        String result = grading.getGrade(88);
        assertEquals("B", result);
    }

    @Test
    public void gradeCTest(){
        Kata grading = new Kata();
        String result = grading.getGrade(77);
        assertEquals("C", result);

    }

    @Test
    public void gradeDTest() {
        Kata grading = new Kata();
        String result = grading.getGrade(66);
        assertEquals("D", result);
    }
    @Test
    public void gradeFTest() {
        Kata grading = new Kata();
        String result = grading.getGrade(55);
        assertEquals("F", result);
    }
//        @Test
//        public void factorTest() {
//            int factors = Kata.noOfFactorsOf(5);
//            short expected;
//            assertEquals(2, factors);
//
//            factors = Kata.noOfFactorsOf(10);
//            assertEquals(4);

       @Test
            public void factorTest() {
            Kata factor = new Kata();
            int factors = Kata.noOfFactorsof(5);
            assertEquals(2,factor);

            factors = Kata.noOfFactorsof(10);
            assertEquals(10,factor);

        }

        @Test
    public void primeNumberTest() {
        boolean isPrime = Kata.isPrime(5);
        assertTrue(isPrime);
        }
    }



