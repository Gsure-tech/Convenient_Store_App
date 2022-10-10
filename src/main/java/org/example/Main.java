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

public class Main {
    public static void main(String[] args) throws CashierNotHiredException, CustomerOutOfStockException, NoProductBoughtException, ProductNotSoldException, ProductNotAvailableException {
    Manager manager = new Manager();
    manager.setFullName("Musa");

        Cashier cashier = new Cashier();
        CashierServices cashierServices=new CashierServices(cashier);
        ManagerService managerService = new ManagerService(manager);
        Applicant applicant = new Applicant("3490485999","AHMAD MUSA",Gender.MALE,"No 14,Mungo park",2223,Qualifications.BSC,Grade.FIRST_CLASS);
        Customer customer = new Customer("234849473l", "Musa",Gender.MALE, "No 2 college road");
       // Products camera = new Products(1,"Electronics","camera",7,200,2012,2022);
        CustomerService customer1= new CustomerService(customer);
        CustomerService customer2 = new CustomerService();
        CustomerService customer3 = new CustomerService();

     //   Products products = customerService.buyProduct("Rice",5);

        System.out.println(customer1.buyProduct("Malt",10));
        System.out.println(customer2.buyProduct("Rice",12));
        System.out.println(customer3.buyProduct("Coffee",22));
        System.out.println(Customer.getCustomerCartQueue());
        //System.out.println(Customer.getCustomerCartPriority());

       // System.out.println(cashierServices.dispenseReceipt(customer,"Rice",70));
        //System.out.println(cashierServices.sellProduct("Rice",40));

        //System.out.println(cashierServices.dispenseReceipt(customer,"Malt",4));
       // System.out.println("hello");
        Leave leave = new Leave(1,12);
        StaffServices staffServices = new StaffServices(cashier);
        cashierServices.sellBasedOnQueue(Customer.getCustomerCartQueue());
      // System.out.println( managerService.hireCashier(applicant));

    }
}