package org.example.services;

import org.example.Exceptions.ProductOutOfStockException;
import org.example.Exceptions.ProductNotSoldException;
import org.example.models.Customer;

import java.util.List;

public class SellProductThread extends Thread {
    private CashierServices cashierServices;
    private List<Customer> myCustomer;
//    private String productName;
//    private int quantity;


    public SellProductThread(CashierServices cashierServices, List<Customer> myCustomer) {
        this.cashierServices = cashierServices;
        this.myCustomer = myCustomer;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is selling");
        cashierServices.sellProduct(myCustomer);
    }
}
