import java.util.Scanner;

public class ConditionalGrade {
    public static void main(String[] args) {

        System.out.println("Enter a score: ");

        Scanner input = new Scanner(System.in);
        int studentGrade = input.nextInt();

        if (studentGrade >= 60) {
            System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
        }
    }
}