package Chapter3;

import tdd.Chapter3.HealthRecord;

import java.util.Scanner;

public class HealthProfile {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstName = userInput.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = userInput.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine();

        System.out.print("Enter your gender: ");
        String gender = userInput.nextLine();

        System.out.print("Enter your date of birth: ");
        String dateOfBirth = userInput.nextLine();

        System.out.println("Enter your height in inches: ");
        int height = userInput.nextInt();

        System.out.println("Enter your weight in pounds: ");
        int weight = userInput.nextInt();

        HealthRecord record = new HealthRecord(firstName, middleName, lastName,
                "male", 26, 14, "January",1996, 0,0);

        int age = record.getAge();
        int BMI = record.getBMI();
        int heartRate = record.getMaximumHeartRate();
        int targetRate = record.getTargetRateInRecord();

        System.out.printf("You entered: %s %s %s %s %s %d %d %d %d %d %d as your health profile ", record.getFirstName(), record.getMiddleName(), record.getLastName(), record.getGender(), record.getDateOfBirth(),
               record.getHeight(), record.getWeight(), record.getAge(), record.getBMI(), record.getMaximumHeartRate(), record.getTargetRateInRecord());
    }
}
