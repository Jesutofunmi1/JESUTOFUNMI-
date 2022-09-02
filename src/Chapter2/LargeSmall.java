package Chapter2;

import java.util.Scanner;

public class LargeSmall {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.println("Enter third integer: ");
        int number3 = input.nextInt();

        System.out.println("Enter forth integer: ");
        int number4 = input.nextInt();

        System.out.println("Enter fifth integer: ");
        int number5 = input.nextInt();

        int largest = number1;
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;
        if (number4 > largest) largest = number4;
        if (number5 > largest) largest = number5;

        int smallest = number1;
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;
        if (number4 < smallest) smallest = number4;
        if (number5 < smallest) smallest = number5;

        System.out.printf("Largest Number is %d%n", largest);
        System.out.printf("Smallest Number is %d", smallest);

    }
}
