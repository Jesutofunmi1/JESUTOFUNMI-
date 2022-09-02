package Chapter3;

import java.util.Scanner;

public class Zuba {
    public static void main(String[] args) {


        /*enter a number greater than 55
        print number if it's greater than 55 or equal to 55
        do not print if it's lesser than 55*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = input.nextInt();


        if (number >= 55) {
            System.out.println("Passed");

        }

        if (number <= 54)  {
            System.out.println("Failed");

        }

    }

}
