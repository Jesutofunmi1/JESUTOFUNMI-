package Chapter5;

import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String prompt = """
                1. for English 
                2. for Igbo
                3. for French
                4. for Yoruba
                """;
        System.out.println(prompt);
       // String userResponse = keyboardInput.nextLine();
        int userResponse = keyboardInput.nextInt();
        switch (userResponse) {
            case 1 -> {
                prompt = """
                        1 for data
                        2 for transfer
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Data");
                    case 2 -> System.out.println("Transfer");
                    default -> System.out.println("Useless people everywhere");
                }
            }
            case 2 -> {
                prompt = """
                        1 for Sharing
                        2 for Caring
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Sharing");
                    case 2 -> System.out.println("Caring");
                    default -> System.out.println("Chibuzor is useless");
                }
            }
            case 3 -> {
                prompt = """
                        1 for Egg
                        2 for Champagne
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Egg");
                    case 2 -> System.out.println("Champagne");
                    default -> System.out.println("Java don die for my hand");
                }
            }
            case 4 -> {
                prompt = """
                        1 for Ewa
                        2 for Agoyin
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Ewa");
                    case 2 -> System.out.println("Agoyin");
                    default -> System.out.println("Java na scam");
                }
            }
        }
    }
}