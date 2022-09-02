package Chapter7;

public class InitArray2 {
    public static void main(String[] args) {

        int[] array = {32,27,64,18,95,14,95,14,90,70,56,89,90,100,60,37};

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter <array.length; counter++) {
            System.out.printf("%5d%8s%n", counter,array[counter]);
        }
    }
}
