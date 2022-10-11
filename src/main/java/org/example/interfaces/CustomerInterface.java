package org.example.interfaces;

import org.example.Exceptions.CustomerOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.models.Customer;
import org.example.models.Products;

import java.util.List;

public interface CustomerInterface {
  List<Products> buyProduct(String productName, int quantity) throws CustomerOutOfStockException, ProductNotAvailableException;
}
