package Chapter2;

import java.util.Scanner;

public class Prompter<matriculationNumber> {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name:" );
        String name = input.nextLine();

        System.out.print("Enter Matriculation Number:");
        String matriculationNumber = input.nextLine();
        //34/23/900909
        //56 67
        //170105527

        System.out.print("Enter age:");
        int age = input.nextInt();

        System.out.print("Enter accountNumber: ");
        float accountNumber = input.nextInt();

        System.out.printf("name is %s%n, matricNo is %s%n, age is %d%n, accDetails is  %.1f%n ", name, matriculationNumber,
                age,accountNumber);
    }
    }

