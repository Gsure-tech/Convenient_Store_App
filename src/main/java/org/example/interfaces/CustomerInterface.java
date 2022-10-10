package org.example.interfaces;

import org.example.Exceptions.CustomerOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.models.Customer;
import org.example.models.Products;

public interface CustomerInterface {
  Products buyProduct(String productName, int quantity) throws CustomerOutOfStockException, ProductNotAvailableException;
}
