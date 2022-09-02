package PracticeMakesPerfect;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        if (number % 3 == 0 ) {
            System.out.println("Correct ");

        } if (number % 3 != 0) {
            System.out.println("Incorrect");
        }
    }
}
