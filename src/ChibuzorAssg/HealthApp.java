package ChibuzorAssg;

import java.util.Scanner;

public class HealthApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter your Height in inches: ");
        double heightInInches = input.nextDouble();

        double BMI = weightInPounds * 0.4536/heightInInches * 0.0254 * heightInInches * 0.0254;

        System.out.printf("BMI is: %4f", BMI);
    }
}
