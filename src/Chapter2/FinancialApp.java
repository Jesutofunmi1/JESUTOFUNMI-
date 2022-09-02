package Chapter2;

public class FinancialApp {
    public static void main(String[] args) {

        double savings = 100;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Month","Amount on deposit");

        for (int month = 1; month <= 6; ++month) {
            double amount = savings * Math.pow(1.0 + rate,month);

            System.out.printf("4d%,20.2f%n", month,amount);
        }
    }
}
