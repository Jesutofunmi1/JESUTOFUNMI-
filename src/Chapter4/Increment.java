package Chapter4;

public class Increment {
    public static void main(String[] args) {

        int c = 10;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("  postincrementing c: %d%n", c++);
        System.out.printf(" c after postincrement: %d%n", c);

        System.out.println();

        c = 17;

        System.out.printf("before preincrement: %d%n", c);
        System.out.printf("    preincrement c: %d%n", ++c);
        System.out.printf("  c after preincrement: %d%n", c);
    }
}
