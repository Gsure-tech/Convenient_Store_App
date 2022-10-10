package org.example.Exceptions;

public class ProductNotSoldException extends Exception {
    public ProductNotSoldException(String message) {
        super(message);
    }
}
