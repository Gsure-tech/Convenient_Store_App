package org.example.services;

import org.example.Exceptions.ProductNotSoldException;
import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CashierServicesTest {
    Queue<Customer> myQueue;
    Queue<Customer> customerQueue;
    Products products;
    String productName;
    @BeforeEach
    void setUp() {
        productName = "Malt";
        customerQueue = new LinkedList<>();
        myQueue = new PriorityQueue<>(new CustomerComparator());

        Customer musa = new Customer("Musa","070627267",Gender.MALE,"No 20, express way",2000.0);
        myQueue.add(musa);
        customerQueue.add(musa);

        StoreService.load();
        products = new Products(1,"drinks","malt",
                10,3000.0,2013,2021);
        Store.productList.add(products);
        //Cashier cashier = new Cashier(Qualifications.BSC,Grade.FIRST_CLASS);
//   CashierServices cashierServices = new CashierServices(cashier);
    }
    @Test
    public void cashierShouldSell() throws ProductNotSoldException {
       //Assert.assertEquals(products,cashierServices.sellProduct(productName,5));
       // Assertions.assertFalse(Store.productList.isEmpty());
        Assertions.assertEquals(26,Store.productList.size());
    }




    @Test
    void cashierShouldSellBasedOnPriority() {
       Assertions.assertFalse(myQueue.isEmpty());
       // assert myQueue !=null;
    }

    @Test
    void cashierShouldSellBasedOnQueue() {
       Assertions.assertFalse(customerQueue.isEmpty());
        //assert customerQueue !=null;
    }
}