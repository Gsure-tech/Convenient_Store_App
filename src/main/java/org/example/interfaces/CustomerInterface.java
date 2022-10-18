package org.example.interfaces;

import org.example.Exceptions.ProductOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.models.Products;

import java.util.List;

public interface CustomerInterface {
  List<Products> buyProduct(String productName, int quantity) throws ProductOutOfStockException, ProductNotAvailableException;
}
