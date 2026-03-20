package org.example;

public class NegativeNumberError extends Exception{
    private String s;


    public NegativeNumberError() {
        this("Negative numbers are not allowed!");
    }

    public NegativeNumberError(String message) {
        super(message);
    }

    public NegativeNumberError(String message, Exception innerException) {
        super(message, innerException);
    }
}