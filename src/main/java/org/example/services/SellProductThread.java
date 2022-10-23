package org.example.services;

import org.example.Exceptions.ProductOutOfStockException;
import org.example.Exceptions.ProductNotSoldException;
import org.example.models.Customer;
import org.example.models.Products;

import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SellProductThread extends Thread {
    Products products;
    private CashierServices cashierServices;
    private BlockingQueue<Customer>allCustomers;
    //private List<Customer> myCustomer;
//    private String productName;
//    private int quantity;


    public SellProductThread(CashierServices cashierServices, BlockingQueue<Customer> allCustomers) {
        this.cashierServices = cashierServices;
        this.allCustomers = allCustomers;
    }

    public void run() {

        Customer customer = allCustomers.poll();
        if(customer != null){
            cashierServices.sellProductTo(customer);
            System.out.println(Thread.currentThread().getName() + " is selling " + " to " + customer.getFullName());
        }

    }
}
