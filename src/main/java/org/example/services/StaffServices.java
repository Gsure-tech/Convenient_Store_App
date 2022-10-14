package org.example.services;

import org.example.Exceptions.LeaveNotGrantedException;
import org.example.interfaces.StaffInterface;
import org.example.models.Cashier;
import org.example.models.Customer;
import org.example.models.Manager;

import java.security.PrivateKey;

public class StaffServices implements StaffInterface {
   private  Cashier cashier;
   private Manager manager;
    public StaffServices(Cashier cashier) {
        this.cashier = cashier;

    }

    public StaffServices( Manager manager) {
        this.manager = manager;

    }


    @Override
    public String takeLeave(int startDay, int endDay) throws LeaveNotGrantedException {
        if(endDay - startDay <= 10){
            return "Leave granted";
        }
        throw new LeaveNotGrantedException("Leave not granted");
    }
}
