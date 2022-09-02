package Chapter4;

public class DanglingStatement2 {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        if (x < 10) {
            x = 10;
        }
        if (y > 10) {
            System.out.println("*****");
        }
        else {
            System.out.println("####");
            System.out.println("$$$$");
        }
    }
}
