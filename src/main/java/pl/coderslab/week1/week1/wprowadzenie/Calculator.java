package pl.coderslab.week1.week1.wprowadzenie;

public class Calculator {
    int add(int a, int b) {
        if (a == Integer.MAX_VALUE || b == Integer.MAX_VALUE) {
            throw new ArithmeticException("Integer overflow");
        } else {
            return a + b;
        }
    }

    int subtract(int a, int b){
        return a - b;
    }

    int multiply(int a, int b){
        return a * b;
    }
}
