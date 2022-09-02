package Chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sales = 0;
        int maximum=0;
        int max=Integer.MIN_VALUE;
        int salesCounter = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number: ");

            int number = input.nextInt();

            if(number> max) max=number;
        }
        System.out.println(max);
//
//        while (salesCounter <= 10) {
//            System.out.print("Enter a number: ");
//            int number = input.nextInt();
//            if(number > maximum) maximum=number;
//            salesCounter++;
//
//
//        }

        System.out.println(maximum);
    }
}
