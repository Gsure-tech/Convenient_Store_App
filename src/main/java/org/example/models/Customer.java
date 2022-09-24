package org.example.models;

import org.example.enums.Gender;

public class Customer extends Person {
    public Customer(int id, long phoneNumber, String fullName, Gender gender, String address) {
        super(id, phoneNumber, fullName, gender, address);
    }
}
