package org.example.Exceptions;

public class CashierNotHiredException extends Exception {
//    public CashierNotHiredException(String message) {
//        super(message);
//    }

    public CashierNotHiredException() {
        super("Cashier is not hired");
    }
}
