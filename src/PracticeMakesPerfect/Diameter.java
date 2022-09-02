package PracticeMakesPerfect;
import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter radius: ");
        int radius = input.nextInt();

        int diameter = 2 * radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159 * radius * radius;

        System.out.printf("Diameter is %d%n ", diameter);
        System.out.printf("Circumference is %.2f%n ", circumference);
        System.out.printf("Area is %.2f ", area);
    }
}
