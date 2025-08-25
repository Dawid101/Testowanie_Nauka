package pl.coderslab.week1.wprowadzenie;

import pl.coderslab.exceptions.NegativeNumberException;

public class Calculator {
    public int add(int a, int b) {
        if (a == Integer.MAX_VALUE || b == Integer.MAX_VALUE) {
            throw new ArithmeticException("Integer overflow");
        } else {
            return a + b;
        }
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public static int factorial(int number) {
        if (number <  0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result =  1;
        for (int i =  1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static double square(double number){
        if(number < 0){
            throw new NegativeNumberException("Number must be non-negative");
        }
        return Math.sqrt(number);
    }

}
