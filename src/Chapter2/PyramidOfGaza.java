package Chapter2;

import java.util.Scanner;

public class PyramidOfGaza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter average weight of stone: ");
        double averageWeightOfEachStone = input.nextDouble();

        double weightPerMinute = averageWeightOfEachStone * averageWeightOfEachStone;
        double weightPerHour = weightPerMinute * 24;
        double weightPerYear = weightPerHour * 365;
        double totalWeight = weightPerYear * 20;

        System.out.printf("Weight of Pyramid stone used per Minute is: %.4f tons %n", weightPerMinute);
        System.out.printf("Weight of Pyramid stone used per Hour is: %.2f tons %n", weightPerHour);
        System.out.printf("Weight of Pyramid stone used per Year is: %.2f tons %n", weightPerYear);
        System.out.printf("Total weight of Pyramid stone used is: %.2f tons", totalWeight);

    }
}

//43,800 * 2.5 tons(weight) = 109,500 tons
//average weight would be 109,500 tons divided by 2 = 54,750
// total number of stones = 2.3 million
// total number of years is 20 years
// total weight of stones for 20 years: weight per year(21,900 tons) * 20 years = 438,900 tons.
// weight for each year would be: weight of stone * 365 days = 60 tons * 365 days = 21,900 tons
// 24 stones per day: weight of stone * 24 hours = 2.5 tons * 24 = 60 tons