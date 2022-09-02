package Chapter4;

import java.util.Scanner;

public class GasMileage417 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int mile = 0;
        int gallon = 0;
        float total = 0;
        float mileCounter = 0;

        while (mile != -1) {
            total = mile * gallon + 1;
            mileCounter = mileCounter +1;
            System.out.println("Enter mile or -1 to quit: ");
            mile = userInput.nextInt();

            System.out.println("Enter gallon or -1 to quit: ");
            gallon = userInput.nextInt();

        }
        if (mileCounter != 0) {
            float average = total / mileCounter;

            System.out.printf("Total of the miles per gallon entered is: %.2f%n", total);
            System.out.printf("Average is %.2f%n", average);
        }
    }
}
