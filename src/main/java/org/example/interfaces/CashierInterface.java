package org.example.interfaces;

import org.example.Exceptions.NoProductBoughtException;
import org.example.Exceptions.ProductNotSoldException;
import org.example.models.Customer;
import org.example.models.Products;

public interface CashierInterface {
    //Products addProduct(Products products);
    Products sellProduct(String productName, int quantity) throws ProductNotSoldException;
    String dispenseReceipt(Customer customer, String productName, int quantity) throws NoProductBoughtException;
//    String sellBasedOnQueue();
//    String sellBasedOnPriority();
}
