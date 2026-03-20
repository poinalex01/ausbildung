package org.example;

public class Calculator {
    private Calculator() {}


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double squareRoot(double a) throws NegativeNumberError {
        if (a < 0)
            throw new NegativeNumberError();

        return Math.sqrt(a);
    }

    public static double power(double a, int b) {
        return Math.pow(a, b);
    }
}
