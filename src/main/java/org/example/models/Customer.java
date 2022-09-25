package org.example.models;

import org.example.enums.Gender;

public class Customer extends Person {
    public Customer(int id, long phoneNumber, String fullName, Gender gender, String address) {
        super(id, phoneNumber, fullName, gender, address);
    }

    public Customer() {
    }
    public String toString() {
        return "Cashier{" +"id:" + getId() +" " + "PhoneNumber: " + getPhoneNumber() + " "
                +"FullName: "+ getFullName() + " "+ " Gender: " +getGender() + " "+
                "Address: " + getAddress() +" " +
                '}';


    }
}
