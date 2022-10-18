package org.example.services;

import org.example.Exceptions.ProductOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;


public class BuyProductThread extends Thread {
   private CustomerService customerService;
   private String productName;
   private int quantity;

    public BuyProductThread( CustomerService customerService,String productName, int quantity) {

        this.customerService = customerService;
        this.productName = productName;
        this.quantity = quantity;
    }

    public void run() {
        try {
            customerService.buyProduct(productName,quantity);
        } catch (ProductOutOfStockException e) {
            throw new RuntimeException(e);
        } catch (ProductNotAvailableException e) {
            throw new RuntimeException(e);
        }
    }
}
