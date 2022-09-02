package Chapter3;

import tdd.Chapter3.ClockTest;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        ClockTest appleMain = new ClockTest(0,0,0);

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the hours: ");
        int hours = userInput.nextInt();
        appleMain.setHours(hours);

        System.out.print("Enter the minutes: ");
        int minutes = userInput.nextInt();
        appleMain.setMinutes(minutes);

        System.out.print("Enter the seconds: ");
        int seconds = userInput.nextInt();
        appleMain.setSeconds(seconds);

        System.out.print("The time is %d%d%d  ");
    }
}
