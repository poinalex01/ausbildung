package org.example.exceptions;

public class InvalidPersonNameException extends RuntimeException {
    private String s;


    public InvalidPersonNameException() {
        this("Invalid Name!");
    }

    public InvalidPersonNameException(String message) {
        super(message);
    }

    public InvalidPersonNameException(String message, Exception innerException) {
        super(message, innerException);
    }
}
