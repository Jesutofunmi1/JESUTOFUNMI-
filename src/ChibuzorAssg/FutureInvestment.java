package ChibuzorAssg;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = userInput.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = userInput.nextDouble();

        System.out.print("Enter number of years: ");
        double numberOfYears = userInput.nextDouble();

        double accumulatedValue = investmentAmount * (1 + annualInterestRate / 12) * numberOfYears * 12;

        System.out.printf("Accumulated value is $%.2f ", accumulatedValue);
    }
}
