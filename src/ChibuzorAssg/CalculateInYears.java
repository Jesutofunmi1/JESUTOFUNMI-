package ChibuzorAssg;

import java.util.Scanner;

public class CalculateInYears {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int numberOfMinutesEntered = userInput.nextInt();

        int minutesInADay = 1440;
        int minutesInAYear = 525600;


        int numberOfYears = numberOfMinutesEntered / minutesInAYear;
        int numberOfDays = numberOfMinutesEntered % minutesInAYear / minutesInADay;

        System.out.printf("%d minutes is approximately %d years and %d days", numberOfMinutesEntered, numberOfYears, numberOfDays);
    }
}


// 60 seconds make 1 minute
// number of seconds in an hour = formula is Number of seconds in a minute multiplied by the 60 minutes(1 hour) 60 seconds * 60 minutes = 3600 seconds
// number of seconds in a day = number of seconds in an hour * 24 hours: 3600 seconds * 24 hours = 86,400 seconds
// for a year: number of seconds in a day(86,400) * 365 day(1 year) = 86,000 * 365 days = 31,390,000 seconds (makes a year)
// 1000 years: 31,390,000 seconds(a year) * 1000 years = 3.139e10

// To get number of seconds in a given year: number of seconds given / seconds in a year = years of seconds
// To get number of seconds in a given day: number of seconds given / seconds in a day = days of seconds