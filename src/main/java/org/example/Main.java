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

        Products rice = new Products(1,"food","Rice",
                30,2000.0,2019,2022);

        Products drink = new Products(1,"drinks","malt",
                10,3000.0,2013,2021);
        cashierServices.addProduct(rice);
        cashierServices.addProduct(drink);
       // cashierServices.addProduct(Battery);

       Applicant applicant = new Applicant(1,+234849473l, "Salim",Gender.MALE,
                "No 2 Madugu road",Qualifications.PHD,Grade.FIRST_CLASS);
        Customer customer = new Customer(1,+234849473l, "Musa",Gender.MALE,
                "No 2 college road");
        CustomerService customerService= new CustomerService(customer);


         Products products =  customerService.buyProduct(rice);
       //  System.out.println(cashierServices.dispenseReceipt(customer,SoftDrink));
       // System.out.println("hello");
        Leave leave = new Leave(1,12);
        StaffServices staffServices = new StaffServices(cashier);
        //System.out.println( staffServices.takeLeave(2,9));

        String path ="/Users/gsure-tech/IdeaProjects/Convienience_Store/src/productslist.csv";
        BufferedReader br;
        String line ="";
        ArrayList<Products> product =new ArrayList<>();
        {
            try {
                br = new BufferedReader(new FileReader(path));
                while ((line= br.readLine())!=null){
                    String[] detailed = line.split(",");


                    if(detailed[0].equals("Product_Id"))
                        continue;
                    int productId = Integer.parseInt(detailed[0]);
                    String productCategory = detailed[1];
                    String productName = detailed[2];
                    int quantity = Integer.parseInt(detailed[3]);
                    double price = Double.parseDouble(detailed[4]);
                    int manufactureYear = Integer.parseInt(detailed[5]);
                    int expiryYear = Integer.parseInt(detailed[6]);
                    product.add(new Products(productId,productCategory,productName,quantity,price,manufactureYear,expiryYear));

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        System.out.println(product);

    }
}