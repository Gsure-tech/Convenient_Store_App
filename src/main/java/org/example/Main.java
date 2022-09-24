package org.example;

import org.example.enums.Gender;
import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.models.Cashier;
import org.example.models.Customer;
import org.example.models.Manager;
import org.example.models.Products;
import org.example.services.CashierServices;
import org.example.services.ManagerService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Manager manager = new Manager(1,+2347063246807l, "Moses Simon",
            Gender.MALE,"Staff Quarters in staff road");
    manager.setFullName("Musa");
   // Manager manager1 = new Manager();
        Cashier cashier1 = new Cashier(1,+234849473l, "Abdulganiyu",Gender.MALE,
                "No 2 college road",Qualifications.NCE,Grade.PASS);
    Cashier cashier = new Cashier(Qualifications.NCE, Grade.FIRST_CLASS);
    cashier.setFullName("Ahmad");

    //Customer customer1 = new Customer();
    CashierServices cashierServices=new CashierServices(cashier);
        ManagerService managerService = new ManagerService(manager);

        Products Bread = new Products(1,"Bread",200.0,
                "12-2-2020","14-2-2020");
        Products SoftDrink = new Products(2,"Soft Drinks",5000.0,
                "12-2-2020","14-2-2021");
        Products Battery= new Products(3,"Battery",4000.0,
                "12-2-2020","14-2-2020");

        List<Products> productList = new ArrayList<>();
        productList.add(Bread);
        productList.add(SoftDrink);
        productList.add(Battery);

        //System.out.println(productList);
        Products product2 = productList.get(1);
        //System.out.println(product2);
//    cashierServices.dispenseReceipt();
//    cashierServices.sellProduct(customer1);
  // Cashier myCashier = new Cashier();

        //Cashier cashier2 = managerService.hireCashier(cashier1);
        String cashier2 = managerService.fireCashier(cashier1);
        System.out.println(cashier2);
        // managerService.fireCashier(cashier);
        //System.out.println(myCashier.getQualifications(Qualifications.BSC);

    }
}