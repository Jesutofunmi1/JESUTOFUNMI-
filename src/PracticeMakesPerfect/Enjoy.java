package PracticeMakesPerfect;

import java.util.Arrays;

public class Enjoy {
    public static void main(String[] args) {
        int[] num = { 1,2,4,5,6,7,8,9,10,11};

        int series = 1;

        for (int i = 0; i < num.length; i++) {
            num[i] += series;
            series++;

        }
        System.out.println(Arrays.toString(num));
    }
}
