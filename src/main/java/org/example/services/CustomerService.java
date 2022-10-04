package org.example.services;

import org.example.interfaces.CustomerInterface;
import org.example.models.Customer;
import org.example.models.Products;
import org.example.models.Store;

public class
CustomerService implements CustomerInterface {
    private final Customer customer;

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
//            }
//    }
    @Override
    public Products buyProduct(String productName, int quantity) {
        StoreService.load();
//        if(Store.productList.contains(Store.productList.get(2).equals(productName))){
            //System.out.println(Store.productList.);
            for (int i = 0; i < Store.productList.size(); i++) {
                if(Store.productList.get(i).getProductName().equals(productName) && quantity<=Store.productList.get(i).getQuantity()){
                    return Store.productList.get(i);
                }
           // }
           // Products products = Store.productList.get(2).setProductName(productName);

        }
            System.out.println("Product out of stock");
            return null;

    }

}
