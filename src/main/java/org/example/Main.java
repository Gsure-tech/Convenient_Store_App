package org.example;

import org.example.Exceptions.*;
import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.*;
import org.example.services.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CashierNotHiredException, CustomerOutOfStockException, NoProductBoughtException, ProductNotSoldException, ProductNotAvailableException {
    Manager manager = new Manager();
    manager.setFullName("Musa");

        Cashier cashier = new Cashier();
        CashierServices cashierServices=new CashierServices(cashier);
        ManagerService managerService = new ManagerService(manager);
        Applicant applicant = new Applicant("3490485999","AHMAD MUSA",Gender.MALE,"No 14,Mungo park",2223,Qualifications.BSC,Grade.FIRST_CLASS);
        Customer musa = new Customer("Musa","070627267",Gender.MALE,"No 20, express way",2000.0);
        Customer john = new Customer("John","070627267",Gender.MALE,"No 20, express way",3000.0);
        Customer tega = new Customer("Tega","070627267",Gender.FEMALE,"No 20, express way",1000.0);
        Customer aisha = new Customer("Aisha","070627267",Gender.FEMALE,"No 20, express way",4000.0);
       // Products camera = new Products(1,"Electronics","camera",7,200,2012,2022);
        CustomerService customerService = new CustomerService(musa);
        CustomerService customerService1 = new CustomerService(john);
        CustomerService customerService2 = new CustomerService(tega);
        CustomerService customerService3 = new CustomerService(aisha);

        customerService.buyProduct("Malt", 4);
        customerService1.buyProduct("Rice", 2);
        customerService2.buyProduct("Coffee", 3);
        customerService3.buyProduct("Coffee", 4);
        customerService3.buyProduct("Malt", 5);
        System.out.println();
        List<Customer> allCustomers = new ArrayList<>();
        allCustomers.add(musa);
        allCustomers.add(tega);
        allCustomers.add(john);
        allCustomers.add(aisha);
        CashierServices cashierServices1 = new CashierServices(cashier);
        cashierServices1.sellBasedOnPriority(allCustomers);
        System.out.println();
        cashierServices1.sellBasedOnQueue(allCustomers);

       // StoreService.load();

     //   Products products = customerService.buyProduct("Rice",5);

//        System.out.println(customer1.buyProduct("Malt",20));
//        System.out.println(customer2.buyProduct("Rice",12));
//        System.out.println(customer3.buyProduct("Coffee",22));

        //System.out.println(Customer.getCustomerCartPriority());

       // System.out.println(cashierServices.dispenseReceipt(customer,"Rice",70));
        //System.out.println(cashierServices.sellProduct("Rice",40));

        //System.out.println(cashierServices.dispenseReceipt(customer,"Malt",4));
       // System.out.println("hello");
        Leave leave = new Leave(1,12);
        StaffServices staffServices = new StaffServices(cashier);
       // cashierServices.sellBasedOnQueue(Customer.getCustomerCartQueue());
      // System.out.println( managerService.hireCashier(applicant));

    }
}