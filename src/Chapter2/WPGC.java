package Chapter2;

import java.util.Scanner;

public class WPGC {
    public static void main(String[] args) {

        int CWP = 500000;
//
        double annualGrowthRate = 0.01;
        int increase = (int) (CWP + (CWP * annualGrowthRate));

        System.out.println(increase);
//        int amount = CWP - PWP;
//        int percentage = amount / PWP * 100;
//        int year1 = CWP - PWP * annualGrowthRate;
//        int year2 = CWP - PWP * annualGrowthRate *year1;
//        int year3 = CWP - PWP * annualGrowthRate * year2;
//        int year4 = CWP - PWP * annualGrowthRate * year3;
//        int year5 = CWP - PWP * annualGrowthRate * year4;

//        System.out.printf("%d "+year1,year2,year3,year4,year5);
    }
}
