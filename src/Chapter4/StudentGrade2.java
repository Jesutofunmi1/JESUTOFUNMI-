package Chapter4;

import java.util.Scanner;

public class StudentGrade2 {
    public static void main(String[] args) {
        System.out.print("Enter a score: ");

        Scanner userInput = new Scanner(System.in);
        int studentGrade = userInput.nextInt();

        System.out.println(studentGrade >= 90 ? "Passed" : "Failed");
        System.out.println(studentGrade >= 80 ? "Passed" : "Failed");
        System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
        System.out.println(studentGrade >= 50 ? "Passed" : "Failed");
        System.out.println(studentGrade >= 40 ? "Passed" : "Failed");
        System.out.println(studentGrade > 30 ? "Passed" : "Failed");

    }
}
