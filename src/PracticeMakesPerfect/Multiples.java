package PracticeMakesPerfect;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second Integer: ");
        int number2 = input.nextInt();

        int tripledNumber = number1 * number1 * number1;
        int doubledNumber = number2 * number2;


        if (tripledNumber % doubledNumber == 0 ) {
            System.out.printf("%d is a multiple of %d%n ", tripledNumber, doubledNumber);
        }
        if ( tripledNumber % doubledNumber != 0) {
            System.out.printf("%d is not a multiple of %d%n ", tripledNumber, doubledNumber);
        }
    }
}
