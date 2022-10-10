package org.example.services;

import org.example.Exceptions.NoProductBoughtException;
import org.example.Exceptions.ProductNotSoldException;
import org.example.enums.Gender;
import org.example.interfaces.CashierInterface;
import org.example.models.Cashier;
import org.example.models.Customer;
import org.example.models.Products;
import org.example.models.Store;

import java.util.LinkedList;
import java.util.Queue;

public class CashierServices implements CashierInterface {

    private final Cashier cashier;

    public CashierServices(Cashier cashier) {

        this.cashier = cashier;
    }

    @Override
    public Products sellProduct(String productName, int quantity) throws ProductNotSoldException {
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
       throw  new ProductNotSoldException("Cant sell Product");
    }

    @Override
    public String dispenseReceipt(Customer customer, String productName, int quantity) throws NoProductBoughtException {
        StoreService.load();
        for (int i = 0; i < Store.productList.size(); i++) {
            if(Store.productList.get(i).getProductName().equals(productName) && Store.productList.get(i).getQuantity()>=quantity){
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
        throw new NoProductBoughtException("Can't generate receipt");

    }


    public void sellBasedOnQueue(Queue<Products>customers) {
        for (int i = customers.size();i>0; i--) {
          Products currentProduct = customers.poll();
          assert currentProduct !=null;
            System.out.println("Selling " + currentProduct.getProductName());
        }
        System.out.println("Product successfully sold");
    }


    public String sellBasedOnPriority() {
        return null;
    }
}
