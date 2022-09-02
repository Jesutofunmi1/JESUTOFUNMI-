package ChibuzorAssg;

import java.util.Scanner;

public class ConvertFeetToMeters {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        double feet = userInput.nextDouble();

        double meter = feet * 0.305;

        System.out.printf(" %.4f  " , meter);
    }
}
