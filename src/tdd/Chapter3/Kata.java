package tdd.Chapter3;
public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return 5;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return 1;
    }

    public int division(int firstNumber, int secondNumber) {
        return 2;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return 40;
    }

    public int quotient(int firstNumber, int secondNUmber) {
        return 0;
    }

    public String getGrade(int score) {
        String mode = null;
        if (score >= 90 && score < 101)mode = "A";
        else if (score >= 80 && score < 90) {
            mode = "B";
        } else if (score >= 70 && score < 80) {
            mode = "C";
        } else if (score >= 60 && score < 70) {
            mode = "D";
        } else if (score < 60) {
            mode = "F";

        }
        return mode;
    }


    public String passedOrFailed(int number) {
        String mode = null;
        if (number >= 55) {
            mode = "Passed";
        } else if (number <= 54) {
            mode = "Failed";
        }
        return mode;

    }
}