package org.example.models;
import org.example.enums.Gender;
import java.lang.invoke.StringConcatFactory;
import java.util.*;

public class Customer extends Person {
    private int  quantity =0;
    private double customerWallet;

   private List<Products> customerCart ;



    //    private static Queue<Products> customerCartQueue = new LinkedList<>();
  //  private static PriorityQueue<Products>customerCartPriority = new PriorityQueue<>();

   // private static List<Products>customerCart = new ArrayList<>();
   public Customer() {
   }
    public Customer(int quantity, double customerWallet, List<Products> customerCart) {
        this.quantity = quantity;
        this.customerWallet = customerWallet;
        this.customerCart = customerCart;
    }

    public Customer(String fullName,String phoneNumber,  Gender gender, String address, double customerWallet) {
        super(fullName,phoneNumber,  gender, address);
        this.customerWallet = customerWallet;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCustomerWallet() {
        return customerWallet;
    }

    public void setCustomerWallet(double customerWallet) {
        this.customerWallet = customerWallet;
    }

    public List<Products> getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(List<Products> customerCart) {
        this.customerCart = customerCart;
    }
//    public static PriorityQueue<Products> getCustomerCartPriority() {
//        return customerCartPriority;
//    }
//
//    public static void setCustomerCartPriority(PriorityQueue<Products> customerCartPriority) {
//        Customer.customerCartPriority = customerCartPriority;
//    }
//
//    public static Queue<Products> getCustomerCartQueue() {
//        return customerCartQueue;
//    }
//
//    public static void setCustomerCartQueue(Queue<Products> customerCartQueue) {
//        Customer.customerCartQueue = customerCartQueue;
//    }


    @Override
    public String toString() {
        return "Customer{"  +
        " '" + getFullName() + '\'' +
                "quantity=" + quantity +
                ", customerWallet=" + customerWallet +
                ", customerCart=" + customerCart +
                "} ";
    }


//    @Override
//    public int compareTo(Products products) {
//        if(products.getQuantity()> products.getQuantity()) {
//            return 1;
//        }
//        return 0;
//    }
}
