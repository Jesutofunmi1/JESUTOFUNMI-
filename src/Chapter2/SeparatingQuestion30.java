package Chapter2;

import java.util.Scanner;

public class SeparatingQuestion30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five digit: ");
        int number = input.nextInt();

        int firstDigit = number/10000;
        int secondDigit = number%10000/1000;
        int thirdDigit = number%1000/100;
        int forthDigit = number%100/10;
        int fifthDigit = number%10;
        System.out.println(firstDigit + "   " + secondDigit+"   "+ thirdDigit+"   "+forthDigit+"   "+fifthDigit);

    }
}
