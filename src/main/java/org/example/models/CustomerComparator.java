package org.example.models;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getQuantity()<o2.getQuantity()){
            return 1;
        }else if(o1.getQuantity()>o2.getQuantity()){
            return -1;
        }
        return 0;
    }
}
