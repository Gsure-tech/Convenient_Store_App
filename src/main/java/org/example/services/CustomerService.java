package org.example.services;

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
    public Products buyProduct(String productName, int quantity) {
        StoreService.load();
        //if(Store.productList.contains(Store.productList.get(2).equals(productName))){
        //System.out.println(Store.productList.);
        for (int i = 0; i < Store.productList.size(); i++) {
            if (Store.productList.get(i).getProductName().equals(productName) && quantity <= Store.productList.get(i).getQuantity() ) {
                    //System.out.println(Store.productList.get(i));
                    System.out.println("Product bought successfully");
                   // Store.productList.get(i).setQuantity(Store.productList.get(i).getQuantity() - quantity);
                   Store.productList.get(i).setQuantity(quantity);
                 //   System.out.println("Remaining Product");
                    return Store.productList.get(i);

                } //else if(quantity > Store.productList.get(i).getQuantity()){
//                    System.out.println("Your request is unavailable as we have " + Store.productList.get(i).getQuantity()+
//                            " "+ productName +" left");
//                   return null;
//                }
        }
        System.out.println("Product out of stock");
        return null;
    }
}