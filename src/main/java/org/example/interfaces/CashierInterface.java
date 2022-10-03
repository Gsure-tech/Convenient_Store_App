package org.example.interfaces;

import org.example.models.Customer;
import org.example.models.Products;

public interface CashierInterface {
    //Products addProduct(Products products);
    String sellProduct(Products products);
    String dispenseReceipt(Customer customer, Products products);
}
