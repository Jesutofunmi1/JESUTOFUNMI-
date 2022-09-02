package Chapter7;

public class MyArray {
    public static void main(String[] args) {
        int[] myArray = {10, 20,33,-6,-7};
int sum = 0;
int largest = 0;
int smallest = 0;
int average = 0;

        for (int j : myArray) {
            sum += j;
            average = sum / myArray.length;
            if (largest < j) {
                largest = j;
            }
            if (smallest > j) {
                smallest = j;
            }
        }
        System.out.println("Sum of number "+ sum);
        System.out.println("Largest number "+ largest);
        System.out.println("Smallest number "+ smallest);
        System.out.println("Average number "+ average);
    }

    int[] myArray = {1,3,4,778,341, 45, -899};

}
