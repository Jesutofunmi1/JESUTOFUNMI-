package Chapter3;

import personalFun.PetrolPurchase;

import java.util.Scanner;

public class PetrolPurchaseMain {


    public static void main(String[] args) {
        PetrolPurchase information = new PetrolPurchase("Xiamie", "Abeokuta", "Ago",0,0.00,0.00);
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Petrol Station name: ");
        String name = userInput.nextLine();
        information.setName(name);

        System.out.print("Enter location: ");
        String location = userInput.nextLine();
        information.setLocation(location);

        System.out.print("Enter type: ");
        String type = userInput.nextLine();
        information.setType(type);

        System.out.print("Enter quantity: ");
        int quantity = userInput.nextInt();
        information.setQuantity(quantity);

        System.out.print("Enter price: ");
        double price = userInput.nextDouble();
        information.setPrice(price);

        System.out.print("Enter the discount: ");
        double discount = userInput.nextDouble();
        information.setDiscount(discount);

        System.out.printf("I went to %s gas station located in %s to get %s of %d litres at the price of %.2f naira " +
                           "at a discount of %.2f which amounted to %.2f naira",information.getName(), information.getLocation(),
                           information.getType(), information.getQuantity(), information.getPrice(), information.getDiscount(),
                           information.getPurchaseAmount());

    }
}
