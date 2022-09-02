package Chapter4;

public class ForCounter {
    public static void main(String[] args) {

//        for (int counter = 100; counter <= 200; counter++)  {
//            System.out.printf("%d  ", counter);
        int counter = 1;

        while (counter <= 100) {
        System.out.printf("%d  ", counter);
        ++counter;
    }
        System.out.println();
    }
}
