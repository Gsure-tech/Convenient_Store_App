package org.example.services;

import org.example.Exceptions.CustomerOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.models.Customer;


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
        } catch (CustomerOutOfStockException e) {
            throw new RuntimeException(e);
        } catch (ProductNotAvailableException e) {
            throw new RuntimeException(e);
        }
    }
}
