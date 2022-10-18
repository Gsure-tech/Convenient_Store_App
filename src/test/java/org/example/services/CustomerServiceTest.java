package org.example.services;

import org.example.Exceptions.ProductOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.enums.Gender;
import org.example.models.Customer;
import org.example.models.Products;
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

    customer = new Customer("Musa","070627267",Gender.MALE,"No 20, express way",2000.0);
    customerService = new CustomerService(customer);
    productName= "Rice";
    quantity =4;
    }
    @Test
    public void customerShouldBuy() throws ProductOutOfStockException, ProductNotAvailableException {

        assertEquals(products,customerService.buyProduct(productName,quantity));
    }

}