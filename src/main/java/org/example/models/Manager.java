package org.example.models;

import org.example.enums.Gender;

public class Manager extends Customer {
    public Manager(int id, long phoneNumber, String fullName, Gender gender, String address) {
        super(id, phoneNumber, fullName, gender, address);
    }
}
