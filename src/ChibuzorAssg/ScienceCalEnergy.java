package ChibuzorAssg;

import java.util.Scanner;

public class ScienceCalEnergy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double waterInKilograms = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        double Q = waterInKilograms * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is: %.2f ", Q);
    }
}
