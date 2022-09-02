package Chapter4;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        System.out.println("Enter a score: ");

        Scanner input = new Scanner(System.in);
        double average = input.nextInt();
    }
        private String name;
        private double average;

    public Student(String name, double average){
            this.name = name;

            if (average > 0.0) {
                if (average <= 100.0) {
                    this.average = average;

                }
            }
        }

        public void setName (String name){
            this.name = name;
        }
        public String getName () {
            return name;
        }
        public void setAverage ( double studentAverage){

            if (average > 0.0) {
                if (average <= 100.0) {
                    this.average = average;

                }
            }
        }
        public double getAverage () {
            return average;
        }
        public String getLetterGrade () {
            String letterGrade = "";
            if (average >= 90.0) {
                System.out.println(letterGrade = "A");
            } else if (average >= 80.0) {
               System.out.println(letterGrade = "B");
            } else if (average >= 70.0) {
               System.out.println(letterGrade = "C");
            } else if (average >= 60.0) {
               System.out.println(letterGrade = "D");
            } else if (average >= 50.0) {
               System.out.println(letterGrade = "F");
            }
            return letterGrade;
        }
    }
