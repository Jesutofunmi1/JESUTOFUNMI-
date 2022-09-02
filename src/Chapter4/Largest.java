package Chapter4;


import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int counter = 1;
        int largest = 0;
        int number;
        while (counter <= 10) {
            System.out.println("Enter an Integer(" + counter + "): ");
            number = userInput.nextInt();
            if (number > largest) {
                largest = number;
            }
            counter += 1;
        }
        System.out.println("The largest number is " + largest);
    }
}
