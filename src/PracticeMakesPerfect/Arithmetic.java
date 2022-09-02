package PracticeMakesPerfect;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second Integer: ");
        int secondNumber = input.nextInt();

        int squareOfFirstNumber = firstNumber * firstNumber;
        int squareOfSecondNUmber = secondNumber * secondNumber;
        int sumOfSquaredNumbers = squareOfFirstNumber + squareOfSecondNUmber;
        int differenceOfSquaredNumbers = squareOfFirstNumber - squareOfSecondNUmber;

        System.out.printf("First Number square is: %d%n" ,squareOfFirstNumber);
        System.out.printf("Second Number square is: %d%n" ,squareOfSecondNUmber);
        System.out.printf("Sum of First and Second Square of Numbers is: %d%n" ,sumOfSquaredNumbers);
        System.out.printf("Difference of First and Second Square of Numbers is: %d%n" ,differenceOfSquaredNumbers);
    }

}
