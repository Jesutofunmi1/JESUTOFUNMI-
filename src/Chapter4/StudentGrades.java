package Chapter4;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        System.out.println("Enter a score: ");

        Scanner input = new Scanner (System.in);
        int studentGrade = input.nextInt();

        if (studentGrade >= 90) {
            System.out.println("A");
        }
        else {
            if (studentGrade >= 80) {
                System.out.println("B");
            }
            else {
                if (studentGrade >= 70) {
                    System.out.println("C");
                }
                else {
                    if (studentGrade >= 60) {
                        System.out.println("D");
                    }
                    else {
                        System.out.println("F");
                    }
                }
            }
        }
    }
}
