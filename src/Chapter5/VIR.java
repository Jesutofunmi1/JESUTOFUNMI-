package Chapter5;

import java.util.Scanner;

public class VIR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Language of your choice: ");
        System.out.println("Press 1 for English: ");
        System.out.println("Press 2 for Igbo: ");
        System.out.println("Press 3 for French: ");
        System.out.println("Press 4 for Yoruba: ");

        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("Press 1 for Data: ");
                System.out.println("Press 2 for Transfer: ");
                int English = input.nextInt();
                switch (English) {
                    case 1:
                        System.out.println("Data");
                        break;
                    case 2:
                        System.out.println("Transfer");
                        break;
                }
                break;

            case 2:
                System.out.println("Press 1 for Sharing: ");
                System.out.println("Press 2 for Caring: ");
                int Igbo = input.nextInt();
                switch (Igbo) {
                    case 1:
                        System.out.println("Sharing");
                        break;
                    case 2:
                        System.out.println("Caring");
                        break;
                }
                break;

            case 3:
                System.out.println("Press 1 for Egg: ");
                System.out.println("Press 2 for Champagne: ");
                int French = input.nextInt();
                switch (French) {
                    case 1:
                        System.out.println("Egg");
                        break;
                    case 2:
                        System.out.println("Champagne");
                        break;
                }
                break;

            case 4:
                System.out.println("Press 1 for Ewa: ");
                System.out.println("Press 2 for Agoyin: ");
                int Yoruba = input.nextInt();
                switch (Yoruba) {
                    case 1:
                        System.out.println("Ewa");
                    case 2:
                        System.out.println("Agoyin");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input");
        }

    }

}