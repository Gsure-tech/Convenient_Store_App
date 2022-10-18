package org.example.services;

import org.example.Exceptions.ProductOutOfStockException;
import org.example.Exceptions.ProductNotSoldException;

public class SellProductThread extends Thread {
    private CashierServices cashierServices;
    private String productName;
    private int quantity;

    public SellProductThread(CashierServices cashierServices, String productName, int quantity) {
        this.cashierServices = cashierServices;
        this.productName = productName;
        this.quantity = quantity;
    }

    public void run() {
        try {
            cashierServices.sellProduct(productName,quantity);
        } catch (ProductNotSoldException | ProductOutOfStockException e) {
            throw new RuntimeException(e);
        }
    }
}
