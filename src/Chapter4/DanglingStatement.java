package Chapter4;

public class DanglingStatement {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        if (x > 5) {
            x = 5;
        }
        if (y > 5) {
            System.out.println("x and y are > 5");
        }
        else {
            System.out.println("x is <= 5");
        }

    }
}
