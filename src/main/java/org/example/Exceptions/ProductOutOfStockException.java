package org.example.Exceptions;

public class ProductOutOfStockException extends Exception{
    public ProductOutOfStockException(String message) {
        super(message);
    }
}
