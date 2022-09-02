package Chapter4;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {
        System.out.println("Enter a score ");

        Scanner input = new Scanner(System.in);
        int Grade = input.nextInt();

        System.out.println(Grade >= 60 ? "Passed" : "Failed");
    }
}
