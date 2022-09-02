package PracticeMakesPerfect;

import java.util.Scanner;

public class AllTheWay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int number3 = input.nextInt();

        int largest = number1;
        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;


        int smallest = number1;
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;

        System.out.printf("The largest is %d%n", largest);
        System.out.printf("The smallest is %d%n", smallest);


    }
}
