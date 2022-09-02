package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesCommissionCal {
    public static void main(String[] args) {

        String prompt = """
                Items:
                Item Name               Value($)
                1. Cassava              239.99
                2. Cocoa                129.75
                3. Castor                99.95
                4. Sunflower            350.89
                
                """;
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        ArrayList<Double> salesCommission = new ArrayList<>();

        double itemPrice;
        int exit = 0;
        while (exit != -1) {

                System.out.println("Enter value or press -1 to exit");

                itemPrice = userInput.nextDouble();
                if(itemPrice != -1) {
                    salesCommission.add(itemPrice);
                }
            else {
                    double total = 0;
                    for (Double aDouble : salesCommission) {
                        total += aDouble;
                    }
                    double commission = (9*1.0/100)* total;
                    double weeklySalary = commission + 200;

                    System.out.println(weeklySalary);
                    System.exit(0);
                }
            exit++;

        }
    }
}
