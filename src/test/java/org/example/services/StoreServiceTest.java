package org.example.services;

import org.example.models.Products;
import org.example.models.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreServiceTest {
    Products products;
    @BeforeEach
    void setUp() {
        StoreService.load();
        products = new Products(1,"drinks","malt",
                10,3000.0,2013,2021);
        Store.productList.add(products);
    }

    @Test
    public void storeServiceShouldRead(){
        Assertions.assertEquals(26,Store.productList.size());
    }

}