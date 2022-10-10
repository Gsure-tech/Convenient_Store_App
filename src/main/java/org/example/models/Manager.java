package org.example.models;

import org.example.enums.Gender;

public class Manager extends Staff {
    public Manager() {
    }

    public Manager(int staffId) {
        super(staffId);
    }

    public Manager(String phoneNumber, String fullName, Gender gender, String address, int staffId) {
        super(phoneNumber, fullName, gender, address, staffId);
    }
}
