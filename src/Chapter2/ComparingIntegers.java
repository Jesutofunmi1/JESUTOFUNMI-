package Chapter2;

import java.util.Scanner;

public class ComparingIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("square of number1: ");
        int squareOfNumber1 = input.nextInt();

        if (number1 > 100) {
            System.out.println(number1 + "is the greatest");
        }
        if (number1 == 100) {
            System.out.println(number1 + "is equal");
        }
        if (number1 != 100) {
            System.out.println(number1 + "is not equal");
        }
        if (number1 < 100) {
            System.out.println(number1 + "is the smallest");
        }


        if (squareOfNumber1 > 100) {
            System.out.println(squareOfNumber1 + "is the greatest");
        }
        if (squareOfNumber1 == 100) {
            System.out.println(squareOfNumber1 + "is equal");
        }

        if (squareOfNumber1 != 100) {
            System.out.printf(squareOfNumber1 + "is not equal");
        }

        if (squareOfNumber1 < 100) {
            System.out.println(squareOfNumber1 + "is the smallest");
        }



    }

    }
