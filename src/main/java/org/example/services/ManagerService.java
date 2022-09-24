package org.example.services;

import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.interfaces.ManagerInterface;
import org.example.models.Cashier;
import org.example.models.Manager;

public class ManagerService implements ManagerInterface {
    private final Manager manager;

    public ManagerService(Manager manager) {
        this.manager = manager;
    }

    @Override
    public Cashier hireCashier(Cashier cashier) {
        if(cashier.getQualifications()== Qualifications.BSC && cashier.getGrade()==Grade.FIRST_CLASS){
            return cashier;
       }else
        //
        return null;
    }

    @Override
    public String fireCashier(Cashier cashier) {
        if(cashier.getGrade()== Grade.FAIL){
            return "Cashier is fired because of his grade is " + cashier.getGrade();
        }else if(cashier.getGrade()==Grade.PASS){

            return  "Cashier is fired because of his grade is " + cashier.getGrade();
        }
            else
        return "null";
    }


//    @Override
//    public Products sellProduct(Customer customer) {
//
//        return null;
//    }
}
