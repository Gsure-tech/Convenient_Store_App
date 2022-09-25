package org.example.services;

import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.Cashier;
import org.example.models.Products;
import org.example.models.Store;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierServicesTest {
    @Test
    public void cashierShouldSell(){
       Products products = new Products(2,"Bread",200.0,
                "2-6-2021","4-6-2021");
        Store.productList.add(products);

        Cashier cashier = new Cashier(1,+234849473l, "Abdulganiyu", Gender.MALE,
                "No 2 college road", Qualifications.BSC, Grade.FIRST_CLASS);
       CashierServices cashierServices = new CashierServices(cashier);
        Assert.assertEquals("Sold successfully",cashierServices.sellProduct(products));
    }


}