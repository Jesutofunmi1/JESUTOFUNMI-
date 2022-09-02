package Chapter4;

import java.util.Scanner;

public class CreditLimit418 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int creditLimit = 5000;
        int beginningBalance ;
        int totalItemsCharged ;
        int totalCreditApplied ;
        int accountNumber;
        int exit = 0;
        while (exit != -1) {
            System.out.println("Enter customer account number:");
            accountNumber = userInput.nextInt();

            System.out.println("Enter customer's balance at the beginning of the month: ");
            beginningBalance = userInput.nextInt();

            System.out.println("Enter total of all items charged by the customer this month: ");
            totalItemsCharged = userInput.nextInt();

            System.out.println("Enter total of all credits applied to the customer's account this month: ");
            totalCreditApplied = userInput.nextInt();

            int newBalance = (beginningBalance + totalItemsCharged) - totalCreditApplied;
            System.out.println("Your new balance is " +newBalance);
            System.out.println("Done!");

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded!");
            }
            System.out.println("Enter -1 to quit or 0 to add another customer");
            exit = userInput.nextInt();
        }
    }
}
