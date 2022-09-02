package ChibuzorAssg;

import java.util.Scanner;

public class FinancialApp {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        int savingsAmount = userInput.nextInt();

        double firstMonthRate = savingsAmount * (1 + 0.00417);
        double secondMonthRate = (savingsAmount + firstMonthRate) * (1 + 0.00417);
        double thirdMonthRate = (savingsAmount + secondMonthRate) * (1 + 0.00417);
        double forthMonthRate = (savingsAmount + thirdMonthRate) * (1 + 0.00417);
        double fifthMonthRate = (savingsAmount + forthMonthRate) * (1 + 0.00417);
        double sixthMonthRate = (savingsAmount + fifthMonthRate) * (1 + 0.00417);

        System.out.printf("First month is: $%.3f%n ", firstMonthRate);
        System.out.printf("Second month is: $%.3f%n ", secondMonthRate);
        System.out.printf("Third month is: $%.3f%n ", thirdMonthRate);
        System.out.printf("Forth month is: $%.3f%n ",  forthMonthRate);
        System.out.printf("Fifth month is: $%.3f%n ",  fifthMonthRate);

        System.out.printf("After the sixth month, the account value is: $%.2f%n ", sixthMonthRate);
    }
}
