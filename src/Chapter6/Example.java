package Chapter6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
        static FileRead fr = new FileRead();
        private static final Scanner scnr = new Scanner(System.in);

        public static void main(String[] args)
                throws FileNotFoundException {
            while (true) {
                int userChoice = menu();
                while (userChoice == 1) {
                    // Select Animal
                    int animal = animalSelect();
                    String Name = null;
                    switch (animal) {
                        case 1:
                            Name = "Animal - Lion";
                            break;
                        case 2:
                            Name = "Animal - Tiger";
                            break;
                        case 3:
                            Name = "Animal - Bear";
                            break;
                        case 4:
                            Name = "Animal - Giraffe";
                            break;
                        default:
                            userChoice = menu();
                            break;
                    } FileRead.readAnimal(Name);
                }

                while (userChoice == 2) {
                    // Select Habitat
                    int animal = habitatSelect();
                    String Name = null;
                    switch (animal) {
                        case 1:
                            Name = "Habitat - Penguin";
                            break;
                        case 2:
                            Name = "Habitat - Bird";
                            break;
                        case 3:
                            Name = "Habitat - Aquarium";
                            break;
                        default:
                            userChoice = menu();
                            break;
                    }
                    FileRead.readHabitat(Name);
                }

                // Exit Program
                if (userChoice == 3) {
                    System.out.println("Thank you!");
                    System.exit(0);
                }

                // Error for invalid option
                else {
                    System.out.println("ERROR: Invalid Selection");
                }
            }
        }

        private static int habitatSelect() {
            // Habitat Menu
            System.out.println("Which habitat would you like to monitor?");
            System.out.println("1. Penguin Habitat");
            System.out.println("2. Bird Habitat");
            System.out.println("3. Aquarium");
            System.out.println("4. Exit");
            int userChoice = Integer.parseInt(scnr.nextLine());
            return userChoice;
        }

        private static int animalSelect() {
            // Animal Menu
            System.out.println("Which animal would you like to monitor?");
            System.out.println("1. Lion");
            System.out.println("2. Tiger");
            System.out.println("3. Bear");
            System.out.println("4. Giraffe");
            System.out.println("5. Exit");
            int userChoice = Integer.parseInt(scnr.nextLine());
            return userChoice;
        }

        private static int menu() {
            // Main Menu
            System.out.println("WELCOME! Please choose from the following");
            System.out.println("1. Monitor Animal");
            System.out.println("2. Monitor Habitat");
            System.out.println("3. Exit");
            int userChoice = Integer.parseInt(scnr.nextLine());
            return userChoice;
        }
}
