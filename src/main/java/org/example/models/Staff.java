package org.example.models;

import org.example.enums.Gender;

public abstract class Staff  extends Person{

    public Staff(int id, long phoneNumber, String fullName, Gender gender, String address) {
        super(id, phoneNumber, fullName, gender, address);
    }

    @Override
    public String toString() {
        return "Staff{}";
    }

    public Staff() {
        super();
    }
}
