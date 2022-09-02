package Chapter4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

//        System.out.print("Enter grade or -1 to quit: ");
//        int grade = input.nextInt();
        int grade = 0;
//        for (int i = 0; i < 5; i++) { //0, 0+1,1+1,2+1,3+1,     4+1(false)
//            System.out.println("*");
//
//        }

        while (grade != -1) {


            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();

            total = total + grade;

            if (gradeCounter != 0) {
                double average = (double) total / gradeCounter;

                gradeCounter = gradeCounter + 1;  //gradecounter++
                System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class average is %.2f%n", average);
            } else {

                System.out.println("No grades were entered");
            }
        }
    }
    }
