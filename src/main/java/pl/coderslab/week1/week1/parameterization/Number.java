package pl.coderslab.week1.week1.parameterization;

public class Number {
    public static String checkParity(int number) {
        if (number == 0) {
            return "zero";
        } else if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
