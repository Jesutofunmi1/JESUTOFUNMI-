package Chapter2;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cassavaPrice = 239.99;
        double cocoa = 129.75;
        double castor = 99.95;
        double sunflower = 350.8;

        System.out.println("Enter item one:");
        double itemOne = input.nextDouble();

        System.out.println("Enter item two: ");
        double itemTwo = input.nextDouble();

        System.out.println("Enter item three: ");
        double itemThree = input.nextDouble();

        System.out.println("Enter item four: ");
        double itemFour = input.nextDouble();


    }
}
