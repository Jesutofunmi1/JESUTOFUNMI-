package ChibuzorAssg;

import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double drivingDistance = userInput.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = userInput.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = userInput.nextDouble();

        double costOfDriving = drivingDistance / milesPerGallon * pricePerGallon;

        System.out.printf("The Cost of Driving: $%.2f ", costOfDriving);
    }
}
