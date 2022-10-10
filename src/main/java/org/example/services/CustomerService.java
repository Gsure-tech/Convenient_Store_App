package org.example.services;

import org.example.Exceptions.CustomerOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.interfaces.CustomerInterface;
import org.example.models.Customer;
import org.example.models.Products;
import org.example.models.Store;

public class
CustomerService implements CustomerInterface {
    private  Customer customer;

    public CustomerService() {
    }

    public CustomerService(Customer customer) {
        this.customer = customer;

    }



    //    public Products buyProduct(Products products, int quantity) {
//        System.out.println(products.getQuantity() + "Product before");
//            if(Store.productList.contains(products) && products.getQuantity()<= quantity){
//                products.setQuantity(quantity- products.getQuantity());
//                System.out.println(products.getQuantity() + "product after");
//                return products;
//            }else {
//                System.out.println("PRODUCT IS OUT OF STOCK" + " " + products.getQuantity());
//
//                return null;
//
//    }
    @Override
    public Products buyProduct(String productName, int quantity) throws CustomerOutOfStockException, ProductNotAvailableException {
        StoreService.load();

        for (int i = 0; i < Store.productList.size(); i++) {
                if (Store.productList.get(i).getProductName().equals(productName)
                        && quantity <= Store.productList.get(i).getQuantity()) {
                    System.out.println("Product bought successfully");
                    Store.productList.get(i).setQuantity(quantity);
                    Customer.getCustomerCartQueue().add(Store.productList.get(i));
                   // Customer.getCustomerCartPriority().add(Store.productList.get(i));

                 //   System.out.println(" Customer cart "+Customer.getCustomerCart());
                    return Store.productList.get(i);
              }else if(Store.productList.get(i).getProductName().equals(productName)
                        &&quantity > Store.productList.get(i).getQuantity()){
                    throw  new CustomerOutOfStockException("Product out of Stock");
                }
        }
        throw new ProductNotAvailableException();
    }
}