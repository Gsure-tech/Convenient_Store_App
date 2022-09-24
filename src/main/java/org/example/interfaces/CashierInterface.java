package org.example.interfaces;

import org.example.models.Customer;
import org.example.models.Products;

public interface CashierInterface {

    Products sellProduct(Customer customer);
    String dispenseReceipt();
}
