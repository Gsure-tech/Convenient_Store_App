package org.example.models;
import org.example.enums.Gender;
import java.lang.invoke.StringConcatFactory;
import java.util.*;

public class Customer extends Person {
    private static Queue<Products> customerCartQueue = new LinkedList<>();
    private static PriorityQueue<Products>customerCartPriority = new PriorityQueue<>();

   // private static List<Products>customerCart = new ArrayList<>();

    public static PriorityQueue<Products> getCustomerCartPriority() {
        return customerCartPriority;
    }

    public static void setCustomerCartPriority(PriorityQueue<Products> customerCartPriority) {
        Customer.customerCartPriority = customerCartPriority;
    }

    public static Queue<Products> getCustomerCartQueue() {
        return customerCartQueue;
    }

    public static void setCustomerCartQueue(Queue<Products> customerCartQueue) {
        Customer.customerCartQueue = customerCartQueue;
    }

    public Customer() {
    }


    public Customer(String phoneNumber, String fullName, Gender gender, String address) {
        super(phoneNumber, fullName, gender, address);
    }

    public String toString() {
        return "Customer{" +" " + "PhoneNumber: " + getPhoneNumber() + " "
                +"FullName: "+ getFullName() + " "+ " Gender: " +getGender() + " "+
                "Address: " + getAddress() +" " +
                '}';
    }
}
