package Chapter4;

import java.util.Scanner;

public class SapaGrade {
    public static void main(String[] args) {
        System.out.println("Enter a score: ");

        Scanner input = new Scanner (System.in);
        int studentGrade12 = input.nextInt();

        if (studentGrade12 >= 60) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
            System.out.println("You must take this course again.");

        }
    }
}
