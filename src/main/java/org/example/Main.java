package org.example;

import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.*;
import org.example.services.CashierServices;
import org.example.services.CustomerService;
import org.example.services.ManagerService;
import org.example.services.StaffServices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

        Products Bread = new Products(1,"Bread",200.0,
                "12-2-2020","14-2-2020");
        Products SoftDrink = new Products(2,"Soft_Drinks",5000.0,
                "12-2-2020","14-2-2021");
        Products Battery= new Products(3,"Battery",4000.0,
                "12-2-2020","14-2-2020");

        cashierServices.addProduct(Bread);
        cashierServices.addProduct(SoftDrink);
       // cashierServices.addProduct(Battery);

       Applicant applicant = new Applicant(1,+234849473l, "Salim",Gender.MALE,
                "No 2 Madugu road",Qualifications.PHD,Grade.FIRST_CLASS);
        Customer customer = new Customer(1,+234849473l, "Musa",Gender.MALE,
                "No 2 college road");
        CustomerService customerService= new CustomerService(customer);
        String imple = cashierServices.sellProduct(Battery);

         Products products =  customerService.buyProduct(Battery);
       //  System.out.println(cashierServices.dispenseReceipt(customer,SoftDrink));
       // System.out.println("hello");
        Leave leave = new Leave(1,12);
        StaffServices staffServices = new StaffServices(cashier);
        System.out.println( staffServices.takeLeave(2,9));

        String path ="/Users/gsure-tech/IdeaProjects/Convienience_Store/src/productslist.csv";
        BufferedReader br;
        String line ="";

        {
            try {
                br = new BufferedReader(new FileReader(path));
                while ((line= br.readLine())!=null){
                    System.out.println(line);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}