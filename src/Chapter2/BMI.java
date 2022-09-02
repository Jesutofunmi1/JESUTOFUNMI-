package Chapter2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight: ");
        int weightInPounds = input.nextInt();

        System.out.println("Enter height: ");
        double heightInInches = input.nextInt();

        double weight = weightInPounds  * 703 / heightInInches * heightInInches;
        double height = weightInPounds * 703 / heightInInches * heightInInches;

        System.out.println("Weight in Pounds: " + weight);
        System.out.println("Height in meters: " + height);
    }
}
