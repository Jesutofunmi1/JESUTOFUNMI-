package ChibuzorAssg;

import java.util.Scanner;

public class ConvertToKilo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.printf("Enter a number in pounds: ");
        double numberInPounds = userInput.nextDouble();

        double kilo = numberInPounds * 0.454;

        System.out.printf("Conversion of Pounds to Kilogram is: %.3f kilograms", kilo);
    }

}
