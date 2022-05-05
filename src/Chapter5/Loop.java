package Chapter5;

public class Loop {
    public static void main(String[] args) {

        System.out.println("Even numbers between 1 to 20 are: ");
        for (int number = 2; number < 21; number++) {

            if (number % 2 == 0) {
                System.out.print(number + " ");

            }
        }
    }
}
