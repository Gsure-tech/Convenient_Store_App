package org.example.services;

import org.example.Exceptions.CustomerOutOfStockException;
import org.example.Exceptions.ProductNotAvailableException;
import org.example.interfaces.CustomerInterface;
import org.example.models.Customer;
import org.example.models.Products;
import org.example.models.Store;

import java.util.ArrayList;
import java.util.List;

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
    public List<Products> buyProduct(String productName, int quantity) throws CustomerOutOfStockException, ProductNotAvailableException {
        StoreService.load();
   // int customerQuantity = 0;
    List<Products> myProducts = new ArrayList<>();
        for (int i = 0; i < Store.productList.size(); i++) {
                if (Store.productList.get(i).getProductName().equals(productName)
                        && quantity <= Store.productList.get(i).getQuantity()){
                        myProducts.add(Store.productList.get(i));
                     System.out.println( Store.productList.get(i).getProductName() + " added to customer cart");
                    customer.setCustomerCart(myProducts);
                   // customer.getCustomerCart().add(Store.productList.get(i));
                   // Customer.getCustomerCartPriority().add(Store.productList.get(i));
                    customer.setQuantity(customer.getQuantity() + quantity);
                    Store.productList.get(i).setQuantity(Store.productList.get(i).getQuantity()- quantity);

                 //   System.out.println(" Customer cart "+Customer.getCustomerCart());
                    return customer.getCustomerCart();
              }else if(Store.productList.get(i).getProductName().equals(productName)
                        &&quantity > Store.productList.get(i).getQuantity()){
                    throw  new CustomerOutOfStockException("Product out of Stock");
                }
        }
        throw new ProductNotAvailableException();
    }
}