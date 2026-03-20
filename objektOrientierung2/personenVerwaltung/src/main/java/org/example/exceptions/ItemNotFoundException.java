package org.example.exceptions;

public class ItemNotFoundException extends RuntimeException {
    private String s;


    public ItemNotFoundException() {
        this("Item could not be found!");
    }

    public ItemNotFoundException(String message) {
        super(message);
    }

    public ItemNotFoundException(String message, Exception innerException) {
        super(message, innerException);
    }
}
