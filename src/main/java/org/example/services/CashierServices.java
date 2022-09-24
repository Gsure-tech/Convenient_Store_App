package org.example.services;

import org.example.interfaces.CashierInterface;
import org.example.models.Cashier;
import org.example.models.Customer;
import org.example.models.Products;

public class CashierServices implements CashierInterface {

    private final Cashier cashier;

    public CashierServices(Cashier cashier) {

        this.cashier = cashier;
    }

    @Override
    public Products sellProduct(Customer customer) {

        return null;
    }

    @Override
    public String dispenseReceipt() {
        return null;
    }
}
