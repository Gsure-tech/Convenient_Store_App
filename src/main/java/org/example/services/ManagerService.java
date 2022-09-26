package org.example.services;

import org.example.enums.Grade;
import org.example.enums.Qualifications;
import org.example.interfaces.ManagerInterface;
import org.example.models.Applicant;
import org.example.models.Cashier;
import org.example.models.Manager;

public class ManagerService implements ManagerInterface {
    private final Manager manager;

    public ManagerService(Manager manager) {
        this.manager = manager;
    }

    @Override
    public Applicant hireCashier(Applicant applicant) {
        if(applicant.getQualifications()== Qualifications.BSC && applicant.getGrade()==Grade.FIRST_CLASS){
            System.out.println("Congratulations you have been hired as Cashier");
            return applicant;
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
