package org.example.services;

import org.example.interfaces.CustomerInterface;
import org.example.models.Customer;
import org.example.models.Products;
import org.example.models.Store;

public class
CustomerService implements CustomerInterface {
    private final Customer customer;

    public CustomerService(Customer customer) {
        this.customer = customer;

    }

    @Override
    public Products buyProduct(Products products) {
        if(Store.productList.contains(products)){
            return products;

        }else{
        return null;
        }
    }
}
