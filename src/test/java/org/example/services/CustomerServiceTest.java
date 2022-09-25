package org.example.services;

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

    Products products;
    @BeforeEach
    public void setUp(){


    products = new Products(2,"Bread",200.0,
            "2-6-2021","4-6-2021");
    Store.productList.add(products);
    customer = new Customer(1,+234849473l, "Abdulganiyu", Gender.MALE,
                "No 2 college road");
    customerService = new CustomerService(customer);
    }
    @Test
    public void customerShouldBuy(){

        assertEquals(products,customerService.buyProduct(products));
    }

}