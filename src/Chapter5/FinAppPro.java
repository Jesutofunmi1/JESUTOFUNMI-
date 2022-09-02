package Chapter5;

public class FinAppPro {
    public static void main(String[] args) {

        double savings = 100;
        double interest = 0.00417;

        System.out.printf("%s%20s%n", "Month", "Amount on deposit");

        for (int month = 2; month <= 12; ++month) {

            double amount = savings * Math.pow(1.0 + interest, month);

            System.out.printf("%4d%,20.2f%n", month, amount);
        }
    }
}
