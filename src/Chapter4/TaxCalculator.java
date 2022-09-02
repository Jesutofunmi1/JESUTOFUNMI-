package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double totalTax = 0;
        int earning = 1;
        while (earning <= 3) {

                System.out.println("Enter citizen's name: ");
                String name = userInput.nextLine();

                System.out.println("Enter earning(" + earning + "): ");
                int Earning = userInput.nextInt();

                if (Earning <= 30000 )
                {
                    totalTax = (15 * 1.0 / 100) * Earning;
                }
                if (Earning > 30000) {
                totalTax = (20 * 1.0 / 100) * Earning;
                }
                earning += 1;
                System.out.printf("For the year 2022 %s your tax rate for your earnings is $%.2f\n ",name ,totalTax);
        }
    }
}
