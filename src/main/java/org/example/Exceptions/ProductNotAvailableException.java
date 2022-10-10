package org.example.Exceptions;

public class ProductNotAvailableException extends Exception {
    public ProductNotAvailableException() {
        super("Product is unavailable");
    }
}
