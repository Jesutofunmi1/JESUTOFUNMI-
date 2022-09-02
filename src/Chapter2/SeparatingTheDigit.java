package Chapter2;

import java.util.Scanner;

public class SeparatingTheDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number consisting of 5 digits : ");
        int number = input.nextInt();

        int numberOne = number % 10;
        number /= 10;

        int numberTwo = numberOne % 10;
        number /= 10;

        int numberThree = numberTwo % 10;
        number /= 10;

        int numberFour = numberThree % 10;
        number /= 10;

        int numberFive = numberFour % 10;
        number /= 10;

        System.out.printf("%d   %d   %d   %d   %d" , numberFive, numberFour, numberThree, numberTwo, numberOne);
    }
}
