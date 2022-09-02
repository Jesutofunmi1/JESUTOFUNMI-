package Chapter7;

import java.util.Date;
import java.util.Scanner;

public class StoreReceipt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("XIAMIE STORES");
        System.out.println("MAIN BRANCH, LAGOS");
        System.out.println("1, XIAMIE AVENUE, VICTORIA ISLAND, LAGOS.");
        System.out.println("TEL: 08144117135");
        System.out.println("Date: "+new Date());

        System.out.print("Cashier on duty: ");
        input.nextLine();

        double TROUSER_PRICE = 4.79;
        double TSHIRT_PRICE = 7.50;
        double AIRMAX_PRICE = 2.99;

        System.out.println("Welcome! The available items are: ");
        System.out.println("ITEMS           PRICE        DISCOUNT");
        System.out.println("Trouser         $4.79        15%off");
        System.out.println("Shirt           $7.50        4%off");
        System.out.println("Air Max(Nike)   $500         40%off");

        System.out.print("Customer's Name: ");
        input.nextLine();

        System.out.println("How many pieces of Trousers do you want to buy: ");
        int numberTrousers = input.nextInt();

        System.out.println("How many pieces of Shirts do you want to buy: ");
        int numberShirts = input.nextInt();

        System.out.println("How many pieces of Airmax do you want to buy: ");
        int numberAirmax = input.nextInt();

        double trouserTotal = (TROUSER_PRICE * numberTrousers ) / 0.7185;
        double tShirtTotal = (TSHIRT_PRICE * numberShirts ) / 0.3;
        double airmaxTotal = (AIRMAX_PRICE * numberAirmax ) / 200;
        double finalTotal = trouserTotal + tShirtTotal + airmaxTotal;

//      double change = finalTotal - amountPaid
        System.out.println("========================================================");
        System.out.printf("Your total price is: $%.2f %n" , finalTotal);
        System.out.print("How much are you paying? ");
        input.nextInt();
        System.out.println("Your change will be ");
//        money -finalTotal
    }
}
