package org.example;

import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.Cashier;
import org.example.models.Customer;
import org.example.models.Manager;
import org.example.models.Products;
import org.example.services.CashierServices;
import org.example.services.CustomerService;
import org.example.services.ManagerService;

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


        Customer customer = new Customer(1,+234849473l, "Abdulganiyu",Gender.MALE,
                "No 2 college road");
        CustomerService customerService= new CustomerService(customer);
        String imple = cashierServices.sellProduct(Battery);

         Products products =  customerService.buyProduct(Battery);
         System.out.println(imple);
       // System.out.println("hello");
    }
}