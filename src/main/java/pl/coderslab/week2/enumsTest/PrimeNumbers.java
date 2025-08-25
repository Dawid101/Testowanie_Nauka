package pl.coderslab.week2.enumsTest;

public class PrimeNumbers {
    public static boolean isPrimeNumber(int number) {
        return (number > 1 && number % 2 != 0) || number == 2;
    }
}
