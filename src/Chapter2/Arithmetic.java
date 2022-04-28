package Chapter2;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        double squareOfNumber1 = Math.pow(number1, 2);
        double squareOfNumber2 = Math.pow(number2, 2);

        System.out.printf("the square of the numbers is %.0f and %.0f\n", squareOfNumber1, squareOfNumber2);

        double sumOfSquare = squareOfNumber1 + squareOfNumber2;
        System.out.printf("the sum of both squares is %.0f\n", sumOfSquare);

        double minusOfSquare = squareOfNumber1 - squareOfNumber2;
        System.out.printf("the minus of both square is %.0f", minusOfSquare);
}
}
