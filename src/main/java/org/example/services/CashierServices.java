package org.example.services;

import org.example.enums.Gender;
import org.example.interfaces.CashierInterface;
import org.example.models.Cashier;
import org.example.models.Customer;
import org.example.models.Products;
import org.example.models.Store;

public class CashierServices implements CashierInterface {

    private final Cashier cashier;

    public CashierServices(Cashier cashier) {

        this.cashier = cashier;
    }

//    @Override
//    public Products addProduct(Products products) {
//        Store.productList.add(products);
//        return products;
//    }

//    @Override
//    public Products (Products products) {
//
//        //CustomerService customerService = new CustomerService(new Customer(2,+23707493843l,"Emma", Gender.MALE,"No.30 college road"));
//       CustomerService customerService= new CustomerService();
//        if(Store.productList.contains(products)){
//            return "Sold successfully";
//        }else
//        return "Product not available";
//    }


    @Override
    public Products sellProduct(String productName, int quantity) {
        StoreService.load();
        for (int i = 0; i < Store.productList.size(); i++) {
            if(Store.productList.get(i).getProductName().contains(productName) &&
                    quantity<= Store.productList.get(i).getQuantity()){
                System.out.println("Initial Product");
                System.out.println(Store.productList.get(i));
                Store.productList.get(i).setQuantity(Store.productList.get(i).getQuantity()-quantity);
                System.out.println("Product sold successfully");
                System.out.println("Remaining product");
                return Store.productList.get(i);
            }

        }
        return null;
    }

    @Override
    public String dispenseReceipt(Customer customer, String productName, int quantity) {
        StoreService.load();
        for (int i = 0; i < Store.productList.size(); i++) {
            if(Store.productList.get(i).getProductName().equals(productName)){
                Store.productList.get(i).setQuantity(quantity);
            return "******-----RECEIPT-----****** \n" +
                    "Customer Name: " + customer.getFullName() + "\n" +
                    "Address: " + customer.getAddress() + "\n" +
                    "Product name: " + Store.productList.get(i).getProductName() + "\n" +
                    "Quantity: " + Store.productList.get(i).getQuantity() + "\n" +
                    "Price: " + Store.productList.get(i).getPrice() + "\n" +
                    "Manufacture Date: " + Store.productList.get(i).getManufactureYear() + "\n" +
                    "Expiry Date: " + Store.productList.get(i).getExpiryYear() + "\n" +
                    "Total Amount payable: " + Store.productList.get(i).getPrice()*quantity ;

            }
        }
        return "";
    }
}
