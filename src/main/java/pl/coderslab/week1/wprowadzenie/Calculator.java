package pl.coderslab.week1.wprowadzenie;

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
}
