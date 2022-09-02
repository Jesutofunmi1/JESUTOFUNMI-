package ChibuzorAssg;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number of students: ");
        int numberOfStudent = userInput.nextInt();
        System.out.println("Enter number of subjects: ");
        int numberOfSubject = userInput.nextInt();

        int[][] studentData = new int[numberOfStudent][numberOfSubject];
        int[][] total = new int[numberOfStudent][numberOfSubject];
        double [][] average = new double[numberOfStudent][numberOfSubject];

        for (int i = 0; i < numberOfStudent; i ++) {
            System.out.println("For student" + " " + (i + 1));
                for (int j = 0; j < numberOfSubject; j++) {
                    System.out.println("Enter score of student");
                    studentData[i][j] = userInput.nextInt();
                }
        }
        System.out.println();
        for (int i = 0; i < numberOfStudent; i++) {
            int sum = 0;
            for (int j = 0; j < numberOfSubject; j++) {

                sum += studentData[i][j];
                total[i][0] = sum;
                average[i][0] = (double) total[i][0] / numberOfSubject;
            }
        }
        equals();
        System.out.println();
        System.out.print("s/n" + "\t");
        for (int i = 0; i < numberOfSubject; i++) {
            System.out.print("Subject" + (i + 1) + "\t");

        }
        System.out.print("Total" + "\t\t");
        System.out.print("Average" + "\t\t");
        System.out.println();

        equals();
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.print(i + 1 + "\t");

            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print(studentData[i][j] + " \t\t");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(total[i][j] + "\t\t");
            }
            for (int j = 0; j < 1; j++)  {
                System.out.print(average[i][j] + "\t");
            }
            System.out.println();
        }
        equals();
        System.out.println("Results of Students for the SSS3 MOCK EXAMINATION");
        int highest = 0;
        for (int i = 0; i < numberOfStudent; i++) {
            for (int j = 0; j <= 0; j++) {
                highest = studentData[i][j];
                if (highest < studentData[i][j]) {
                    studentData[i][j] = highest;
                }
            }
        }
        System.out.println();
        System.out.print(highest);
    }

    private static void equals() {
        for (int i = 0; i < 60; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
