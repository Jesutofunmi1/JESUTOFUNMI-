package PracticeMakesPerfect;

import java.util.Scanner;

public class NegPosZeroValues {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter five numbers: ");
        int number = userInput.nextInt();


        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;

        int number1a = 0;
        int number2a = 0;
        int number3a = 0;
        int number4a = 0;
        int number5a = 0;

        int positive = number1;
        if ( number2 > positive ) positive = number2;
        if ( number3 > positive ) positive = number3;
        if ( number4 > positive ) positive = number3;
        if ( number5 > positive ) positive = number4;

        int negative = number1a;
        if ( number2a < negative ) negative = number2a;
        if ( number3a < negative ) negative = number3a;
        if ( number4a < negative ) negative = number4a;
        if ( number5a < negative ) negative = number5a;

        System.out.println(" positive number " + positive);
        System.out.println(" negative number " + negative);
    }
}
