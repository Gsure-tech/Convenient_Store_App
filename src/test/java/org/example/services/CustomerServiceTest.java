package org.example.services;

import org.example.Exceptions.CustomerOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.enums.Gender;
import org.example.models.Customer;
import org.example.models.Products;
import org.example.models.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {
    Customer customer;
    CustomerService customerService;
    String productName;
    int quantity;
    Products products;
    @BeforeEach
    public void setUp(){

    customer = new Customer("234849473l", "Abdulganiyu", Gender.MALE,
                "No 2 college road");
    customerService = new CustomerService(customer);
    }
    @Test
    public void customerShouldBuy() throws CustomerOutOfStockException, ProductNotAvailableException {

        assertEquals(products,customerService.buyProduct(productName,quantity));
    }

}