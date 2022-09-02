package PracticeMakesPerfect;

import java.util.Scanner;

public class ArithmeticLandS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.println("Enter third integer: ");
        int number3 = input.nextInt();



        int sum = number1 + number2 + number3;
        int average = sum/2;
        int product = number1 * number2 * number3;

        int largest = number1;
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        int smallest = number1;
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;


        System.out.printf("Sum of Numbers is: %d%n",sum);
        System.out.printf("Average of Numbers is: %d%n",average);
        System.out.printf("Product of Numbers is: %d%n",product);
        System.out.println("Largest number is: " +largest);
        System.out.println("Smallest number is: " +smallest);
        }
    }

