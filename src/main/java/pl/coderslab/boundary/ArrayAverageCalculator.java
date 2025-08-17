package pl.coderslab.boundary;

public class ArrayAverageCalculator {
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }
}
