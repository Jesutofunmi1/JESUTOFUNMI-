package PracticeMakesPerfect;

import java.util.Scanner;

public class SecondsCalculation {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int numberOfSecondsEntered = userInput.nextInt();

        int seconds = 60;
        int secondsInAnHour = 3600;
        int secondsInADay = 86400;
        int secondsInAYear = 31390000;

        int numberOfYears = numberOfSecondsEntered / secondsInAYear;
        int numberOfDays = (numberOfSecondsEntered - secondsInAYear * numberOfYears) / secondsInADay;
        int numbersOfHours = (numberOfSecondsEntered % secondsInADay) / secondsInAnHour;
        int numberOfMinutes = ((numberOfSecondsEntered  % secondsInADay) % secondsInAnHour) / seconds;
        int numberOfSeconds = ((numberOfSecondsEntered % secondsInADay) % secondsInAnHour) % seconds;

        System.out.printf("%d seconds is approximately %d years %d days %d hours %d minutes %d seconds ",
                numberOfSecondsEntered, numberOfYears, numberOfDays, numbersOfHours, numberOfMinutes, numberOfSeconds);

    }
}
// number o seconds entered  - number of seconds in 31 years /  number of seconds in a day