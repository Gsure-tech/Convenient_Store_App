package org.example;

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
    public static void main(String[] args) {
    Manager manager = new Manager(1,+2347063246807l, "Moses Simon",
            Gender.MALE,"Staff Quarters in staff road");
    manager.setFullName("Musa");
   // Manager manager1 = new Manager();
        Cashier cashier = new Cashier(1,+234849473l, "Abdulganiyu",Gender.MALE,
                "No 2 college road",Qualifications.BSC,Grade.FIRST_CLASS);

    //Customer customer1 = new Customer();
        CashierServices cashierServices=new CashierServices(cashier);
        ManagerService managerService = new ManagerService(manager);


       Applicant applicant = new Applicant(1,+234849473l, "Salim",Gender.MALE,
                "No 2 Madugu road",Qualifications.PHD,Grade.FIRST_CLASS);
        Customer customer = new Customer(1,+234849473l, "Musa",Gender.MALE,
                "No 2 college road");

       // Products camera = new Products(1,"Electronics","camera",7,200,2012,2022);
        CustomerService customerService= new CustomerService(customer);

       // Products products = customerService.buyProduct("Rice",5);
        System.out.println(customerService.buyProduct("Coffee",30));

       //  System.out.println(cashierServices.dispenseReceipt(customer,SoftDrink));
       // System.out.println("hello");
        Leave leave = new Leave(1,12);
        StaffServices staffServices = new StaffServices(cashier);
        //System.out.println( staffServices.takeLeave(2,9));


    }
}