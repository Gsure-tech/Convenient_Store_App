package org.example.interfaces;

import org.example.models.Products;

public interface CustomerInterface {
  Products buyProduct(String productName, int quantity);
}
