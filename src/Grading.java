import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

      /*  User should enter a score
        if the score is greater than 90 or equals 100 print A
        if the score is greater than or equal to 80 or less than 90 print B
        if the score is greater than or equal to 70 or less than 80 print C
        if the score is greater than or equal to 60 or less than 70 print D
        if the score is less than 60 print F    */


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score: ");

        int score = input.nextInt();


        if (score >= 90 && score < 100) {
            System.out.println("A");
        }

        if (score >= 80 && score < 90 ) {
            System.out.println("B");
        }

        if (score >= 70 && score < 80 ) {
            System.out.println("C");
        }

        if (score >= 60 && score < 70 ) {
            System.out.println("D");
        }

        if (score < 60 ) {
            System.out.println("F");
        }
    }
}