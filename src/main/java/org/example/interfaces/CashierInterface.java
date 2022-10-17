package org.example.interfaces;

import org.example.Exceptions.NoProductBoughtException;
import org.example.Exceptions.ProductNotSoldException;
import org.example.models.Customer;
import org.example.models.Products;

import java.util.List;

public interface CashierInterface {
    //Products addProduct(Products products);
    Products  sellProduct(String productName, int quantity) throws ProductNotSoldException;
    //List<Products> sellProduct(List<Customer> myCustomer) throws ProductNotSoldException;
    String dispenseReceipt(Customer customer, String productName, int quantity) throws NoProductBoughtException;
    void sellBasedOnPriority(List<Customer> myCustomer);
    void sellBasedOnQueue(List<Customer> myCustomer);
//    String sellBasedOnQueue();
//    String sellBasedOnPriority();
}
