package org.example.Exceptions;

public class CustomerOutOfStockException extends Exception{
    public CustomerOutOfStockException(String message) {
        super(message);
    }
}
