package Chapter3;

import tdd.Chapter3.HeartRates;

import java.util.Scanner;

public class HeartRateMain {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your firstName please: ");
        String firstName = userInput.nextLine();
//        profile.setFirstName(firstName);

        System.out.print("Enter your middleName: ");
        String middleName = userInput.nextLine();
//        profile.setMiddleName(middleName);

        System.out.print("Enter your lastName: ");
        String lastName = userInput.nextLine();
//        profile.setLastName(lastName);

        System.out.print("Enter your date of Birth:" );
        int age = userInput.nextInt();
//        profile.setAge(age);

        HeartRates profile = new HeartRates(firstName,middleName,lastName,0,0,0,age);

        int year = 2022 - profile.getAge();
        int maximumRate = profile.getMaximumRate();
        int targetRate = profile.getTargetRate();

        System.out.printf("Your health profile is %s %s %s %d %d %d ", profile.getFirstName(), profile.getMiddleName(),
                profile.getLastName(), year, maximumRate, targetRate);
    }
}
