package Chapter2;

import java.util.Scanner;

public class Arithmetics {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("Sum is %d%n ", sum);

        int average = sum / 2;
        System.out.printf(" average is %d%n", average);

        int product = sum * 2;
        System.out.printf("product of sum is %d%n", product);

        if ( number1 > number2 && number1 > number3 ) {
            System.out.printf("%d > %d%n", number1);
        }
        if ( number1 < number2 && number1 < number3 ) {
            System.out.printf("%d > %d%n", number1);
        }
        if (number1 > number3 && number1 > number2 ) {
            System.out.printf("%d > %d%n", number1);
        }
        if (number1 < number3 && number1 < number2 ) {
            System.out.printf("%d > %d%n", number1);
        }

        if (number2 > number3 && number2 > number1) {
            System.out.printf("%d > %d%n", number2);
        }
        if (number2 < number3 && number2 < number1) {
            System.out.printf("%d > %d%n", number2);
        }
        if (number2 > number1 && number2 > number3) {
            System.out.printf("%d > %d%n", number2);
        }
        if (number2 < number1 && number2 < number3) {
            System.out.printf("%d > %d%n", number2);
        }


        if (number3 > number2 && number3 > number1) {
            System.out.printf("%d > %d%n", number3);
        }
        if (number3 < number2 && number3 < number1) {
            System.out.printf("%d > %d%n", number3);
        }
        if (number3 > number1 && number3 > number2) {
            System.out.printf("%d > %d%n", number3);
        }
        if (number3 > number1 && number3 > number2) {
            System.out.printf("%d > %d%n", number3);
        }
    }



}
