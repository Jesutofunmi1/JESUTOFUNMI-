package Chapter2;

import java.util.Scanner;

public class MeterConversion {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = userInput.nextDouble();

        double meter = 0.305 * feet;

        System.out.printf("Conversion is %.4f meters ", meter);
    }
}
