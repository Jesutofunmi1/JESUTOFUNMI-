package Chapter4;

import java.util.Scanner;

public class LargeNumTrial {
    private static Scanner sc;

    public static void main(String[] args) {

        int arr[] = new int[5];
        int i,j;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter array elements: ");

        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(j = 1; j < arr.length; j++){
            if (max <arr[j]);
            max = arr[j];
        }
        System.out.println("max number:"+max);
    }
}
