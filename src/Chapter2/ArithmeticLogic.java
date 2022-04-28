package Chapter2;

import java.util.Scanner;

public class ArithmeticLogic {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sum;
        int difference;
        int squarenumber1;
        int squarenumber2;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        squarenumber1 = number1 * number1;
        squarenumber2 = number2 * number2;

        sum = squarenumber1 + squarenumber2;
        difference = squarenumber1 - squarenumber2;



        System.out.printf("Square of number1 is %d%n: ", squarenumber1);
        System.out.printf("Square of number2 is %d%n: ", squarenumber2);
        System.out.printf("Sum is %d%n: ", sum);
        System.out.printf("Difference is %d%n: ", difference );

    }

    }

