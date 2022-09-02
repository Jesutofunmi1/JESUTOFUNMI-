package PracticeMakesPerfect;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        int squareOfNumber = number * number;

        if ( number > 100) {
            System.out.printf("%d is greater than 100\n", number);
        }
        if ( number == 100) {
            System.out.printf("%d is equal to 100\n", number);
        }
        if ( number != 100) {
            System.out.printf("%d is not equal to 100\n", number);
        }
        if (number < 100) {
            System.out.printf("%d is lesser than 100\n", number);
        }
        if ( squareOfNumber > 100) {
            System.out.printf("%d is greater than 100\n", squareOfNumber);
        if ( squareOfNumber == 100 ) {
            System.out.printf("%d is equal 100\n", squareOfNumber);
        }
            if ( squareOfNumber != 100 ) {
                System.out.printf("%d is not equal 100\n", squareOfNumber);
            } if ( squareOfNumber < 100 ) {
                System.out.printf("%d is lesser than 100\n", squareOfNumber);
            }
        }
    }
}
